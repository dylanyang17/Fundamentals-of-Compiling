package decaf.translate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import decaf.tree.Tree;
import decaf.backend.OffsetCounter;
import decaf.symbol.Class;
import decaf.symbol.Function;
import decaf.symbol.Symbol;
import decaf.symbol.Variable;
import decaf.tac.Temp;

public class TransPass1 extends Tree.Visitor {	//处理类、方法、变量等的定义，处理order、offset，以及建立对应Temp类对象
	private Translater tr;

	private int objectSize;

	private List<Variable> vars;

	public TransPass1(Translater tr) {
		this.tr = tr;
		vars = new ArrayList<Variable>();
	}

	@Override
	public void visitTopLevel(Tree.TopLevel program) {
		for (Tree.ClassDef cd : program.classes) {
			cd.accept(this);
		}
		for (Tree.ClassDef cd : program.classes) {
			tr.createVTable(cd.symbol);				//建立所有类的VTable
			tr.genNewForClass(cd.symbol);			//生成构建类的TAC
		}
		for (Tree.ClassDef cd : program.classes) {
			if (cd.parent != null) {
				cd.symbol.getVtable().parent = cd.symbol.getParent()  //构建不同类之间Vable的父子关系
						.getVtable();
			}
		}
	}

	@Override
	public void visitClassDef(Tree.ClassDef classDef) {
		classDef.symbol.resolveFieldOrder();	//（包括从父类继承来的）类中的方法和变量的符号上分别按顺序排序并存入order中
		objectSize = 0;
		vars.clear();
		for (Tree f : classDef.fields) {
			f.accept(this);
		}
		Collections.sort(vars, Symbol.ORDER_COMPARATOR);
		OffsetCounter oc = OffsetCounter.VARFIELD_OFFSET_COUNTER;
		Class c = classDef.symbol.getParent();
		if (c != null) {						//oc赋初值
			oc.set(c.getSize());
		} else {
			oc.reset();
		}
		for (Variable v : vars) {  				//给变量类型的符号赋上其相对类基址的地址偏移值
			v.setOffset(oc.next(OffsetCounter.WORD_SIZE));
		}
	}

	@Override
	public void visitMethodDef(Tree.MethodDef funcDef) {
		Function func = funcDef.symbol;
		if (!func.isStatik()) {
			func.setOffset(2 * OffsetCounter.POINTER_SIZE + func.getOrder()
					* OffsetCounter.POINTER_SIZE);		//设置非静态方法相对类基址的地址偏移值
		}
		tr.createFuncty(func);
		OffsetCounter oc = OffsetCounter.PARAMETER_OFFSET_COUNTER;
		oc.reset();
		int order;
		if (!func.isStatik()) {						// 设定"this"的order为0并为其设定Temp类对象和偏移值
			Variable v = (Variable) func.getAssociatedScope().lookup("this");
			v.setOrder(0);
			Temp t = Temp.createTempI4();
			t.sym = v;
			t.isParam = true;
			v.setTemp(t);
			v.setOffset(oc.next(OffsetCounter.POINTER_SIZE));
			order = 1;
		} else {
			order = 0;
		}
		for (Tree.VarDef vd : funcDef.formals) {	// 设定各局部变量的order并设定对应Temp类对象和偏移值
			vd.symbol.setOrder(order++);
			Temp t = Temp.createTempI4();
			t.sym = vd.symbol;
			t.isParam = true;
			vd.symbol.setTemp(t);
			vd.symbol.setOffset(oc.next(vd.symbol.getTemp().size));
		}
	}

	@Override
	public void visitVarDef(Tree.VarDef varDef) {
		vars.add(varDef.symbol);
		objectSize += OffsetCounter.WORD_SIZE;
	}

}
