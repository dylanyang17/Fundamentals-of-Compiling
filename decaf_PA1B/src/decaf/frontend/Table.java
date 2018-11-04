/* This is auto-generated source by LL1-Parser-Gen.
 * Specification file: F:\eclipse-workspace\decaf_PA1B\src\decaf\frontend\Parser.spec
 * Options: unstrict mode
 * Generated at: Sun Nov 04 22:28:54 CST 2018
 * Please do NOT modify it!
 *
 * Project repository: https://github.com/paulzfm/LL1-Parser-Gen
 * Version: special version for decaf-PA1-B
 * Author: Zhu Fengmin (Paul)
 */

package decaf.frontend;

import decaf.Location;
import decaf.tree.Tree;
import decaf.tree.Tree.*;
import java.util.*;

public class Table
 {
    public static final int eof = -1;
    public static final int eos = 0;
    
    /* tokens and symbols */
    public static final int VOID = 257; //# line 13
    public static final int BOOL = 258; //# line 13
    public static final int INT = 259; //# line 13
    public static final int STRING = 260; //# line 13
    public static final int CLASS = 261; //# line 13
    public static final int NULL = 262; //# line 14
    public static final int EXTENDS = 263; //# line 14
    public static final int THIS = 264; //# line 14
    public static final int WHILE = 265; //# line 14
    public static final int FOR = 266; //# line 14
    public static final int IF = 267; //# line 15
    public static final int ELSE = 268; //# line 15
    public static final int RETURN = 269; //# line 15
    public static final int BREAK = 270; //# line 15
    public static final int NEW = 271; //# line 15
    public static final int PRINT = 272; //# line 16
    public static final int READ_INTEGER = 273; //# line 16
    public static final int READ_LINE = 274; //# line 16
    public static final int LITERAL = 275; //# line 17
    public static final int IDENTIFIER = 276; //# line 18
    public static final int AND = 277; //# line 18
    public static final int OR = 278; //# line 18
    public static final int STATIC = 279; //# line 18
    public static final int INSTANCEOF = 280; //# line 18
    public static final int LESS_EQUAL = 281; //# line 19
    public static final int GREATER_EQUAL = 282; //# line 19
    public static final int EQUAL = 283; //# line 19
    public static final int NOT_EQUAL = 284; //# line 19
    public static final int SEALED = 285; //# line 22
    public static final int TOR = 286; //# line 22
    public static final int DMOD = 287; //# line 22
    public static final int SCOPY = 288; //# line 22
    public static final int IN = 289; //# line 22
    public static final int VAR = 290; //# line 22
    public static final int FOREACH = 291; //# line 22
    public static final int DADD = 292; //# line 22
    public static final int DEFAULT = 293; //# line 22
    public static final int LOR = 294; //# line 22
    public static final int ROR = 295; //# line 22
    
    public static final int ExprDAdd = 296;
    public static final int VariableDef = 297;
    public static final int ExprT5 = 298;
    public static final int GuardedCont = 299;
    public static final int BoundVariable = 300;
    public static final int Oper3 = 301;
    public static final int Oper6 = 302;
    public static final int VariableList = 303;
    public static final int Formals = 304;
    public static final int Oper7 = 305;
    public static final int IfSubStmt = 306;
    public static final int Expr8 = 307;
    public static final int AfterSimpleTypeExpr = 308;
    public static final int Constants = 309;
    public static final int Expr2 = 310;
    public static final int Oper2 = 311;
    public static final int SealedOpt = 312;
    public static final int ExprDMod = 313;
    public static final int MoreConstants = 314;
    public static final int OperDAdd = 315;
    public static final int IfBranchs = 316;
    public static final int ExprT8_2 = 317;
    public static final int Expr6 = 318;
    public static final int BreakStmt = 319;
    public static final int ExprT2 = 320;
    public static final int StmtList = 321;
    public static final int Constant = 322;
    public static final int SubVariableList = 323;
    public static final int PrintStmt = 324;
    public static final int ForStmt = 325;
    public static final int Expr9 = 326;
    public static final int Expr1 = 327;
    public static final int ExprT8_1 = 328;
    public static final int ForeachStmt = 329;
    public static final int ArrayConstant = 330;
    public static final int GuardedStmt = 331;
    public static final int Oper1 = 332;
    public static final int ElseClause = 333;
    public static final int ExprDAddT = 334;
    public static final int FieldList = 335;
    public static final int IfBranch = 336;
    public static final int SubExprList = 337;
    public static final int ExprDModT = 338;
    public static final int AfterParenExpr = 339;
    public static final int ClassDef = 340;
    public static final int ReturnStmt = 341;
    public static final int ExprList = 342;
    public static final int StmtBlock = 343;
    public static final int FunctionField = 344;
    public static final int AfterIdentExpr = 345;
    public static final int Program = 346;
    public static final int Expr = 347;
    public static final int Type = 348;
    public static final int Expr5 = 349;
    public static final int AfterNewExpr = 350;
    public static final int Assignment = 351;
    public static final int ExtendsClause = 352;
    public static final int IfExpr = 353;
    public static final int Oper5 = 354;
    public static final int ArrayType = 355;
    public static final int Expr3 = 356;
    public static final int Actuals = 357;
    public static final int Variable = 358;
    public static final int ExprT3 = 359;
    public static final int Stmt = 360;
    public static final int SimpleStmt = 361;
    public static final int SimpleType = 362;
    public static final int WhileStmt = 363;
    public static final int ExprT1 = 364;
    public static final int IfSuf = 365;
    public static final int Expr4 = 366;
    public static final int ExprT4 = 367;
    public static final int ReturnExpr = 368;
    public static final int whileExpr = 369;
    public static final int OperDMod = 370;
    public static final int IfStmt = 371;
    public static final int OCStmt = 372;
    public static final int ExprT6 = 373;
    public static final int ExprT8 = 374;
    public static final int Expr7 = 375;
    public static final int ClassList = 376;
    public static final int Oper4 = 377;
    public static final int Field = 378;
    
    /* start symbol */
    public final int start = Program;
    
    /**
      * Judge if a symbol (within valid range) is non-terminal.
      *
      * @param symbol the symbol to be judged.
      * @return true if and only if the symbol is non-terminal.
      */
        
    public boolean isNonTerminal(int symbol) {
        return symbol >= 296;
    }
    
    private final String[] allSymbols = {
        "VOID", "BOOL", "INT", "STRING", "CLASS",
        "NULL", "EXTENDS", "THIS", "WHILE", "FOR",
        "IF", "ELSE", "RETURN", "BREAK", "NEW",
        "PRINT", "READ_INTEGER", "READ_LINE", "LITERAL", "IDENTIFIER",
        "AND", "OR", "STATIC", "INSTANCEOF", "LESS_EQUAL",
        "GREATER_EQUAL", "EQUAL", "NOT_EQUAL", "SEALED", "TOR",
        "DMOD", "SCOPY", "IN", "VAR", "FOREACH",
        "DADD", "DEFAULT", "LOR", "ROR", "ExprDAdd",
        "VariableDef", "ExprT5", "GuardedCont", "BoundVariable", "Oper3",
        "Oper6", "VariableList", "Formals", "Oper7", "IfSubStmt",
        "Expr8", "AfterSimpleTypeExpr", "Constants", "Expr2", "Oper2",
        "SealedOpt", "ExprDMod", "MoreConstants", "OperDAdd", "IfBranchs",
        "ExprT8_2", "Expr6", "BreakStmt", "ExprT2", "StmtList",
        "Constant", "SubVariableList", "PrintStmt", "ForStmt", "Expr9",
        "Expr1", "ExprT8_1", "ForeachStmt", "ArrayConstant", "GuardedStmt",
        "Oper1", "ElseClause", "ExprDAddT", "FieldList", "IfBranch",
        "SubExprList", "ExprDModT", "AfterParenExpr", "ClassDef", "ReturnStmt",
        "ExprList", "StmtBlock", "FunctionField", "AfterIdentExpr", "Program",
        "Expr", "Type", "Expr5", "AfterNewExpr", "Assignment",
        "ExtendsClause", "IfExpr", "Oper5", "ArrayType", "Expr3",
        "Actuals", "Variable", "ExprT3", "Stmt", "SimpleStmt",
        "SimpleType", "WhileStmt", "ExprT1", "IfSuf", "Expr4",
        "ExprT4", "ReturnExpr", "whileExpr", "OperDMod", "IfStmt",
        "OCStmt", "ExprT6", "ExprT8", "Expr7", "ClassList",
        "Oper4", "Field",
    };
    
    /**
      * Debugging function (pretty print).
      * Get string presentation of some token or symbol.
      *
      * @param symbol either terminal or non-terminal.
      * @return its string presentation.
      */
        
    public String name(int symbol) {
        if (symbol == eof) return "<eof>";
        if (symbol == eos) return "<eos>";
        if (symbol > 0 && symbol <= 256) return "'" + (char) symbol + "'";
        return allSymbols[symbol - 257];
    }
    
    /* begin lookahead symbols */
    private ArrayList<Set<Integer>> begin = new ArrayList<Set<Integer>>();
    private final Integer[][] beginRaw = {
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('+'), Integer.valueOf('-'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DADD, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), DMOD, Integer.valueOf('>')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, Integer.valueOf('}')},
        {VAR, VOID, CLASS, INT, STRING, BOOL},
        {EQUAL, NOT_EQUAL},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%')},
        {VOID, CLASS, INT, STRING, BOOL},
        {VOID, CLASS, INT, STRING, BOOL, Integer.valueOf(')')},
        {Integer.valueOf('-'), Integer.valueOf('!')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf(']'), Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {LITERAL, NULL, Integer.valueOf('['), Integer.valueOf(']')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {AND},
        {SEALED, CLASS},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf(','), Integer.valueOf(']')},
        {DADD},
        {TOR, Integer.valueOf('}')},
        {DEFAULT, Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {BREAK},
        {AND, Integer.valueOf(']'), FOR, ROR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, IF, Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, IDENTIFIER, NEW, LOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{'), Integer.valueOf('}')},
        {LITERAL, NULL, Integer.valueOf('[')},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {PRINT},
        {FOR},
        {LITERAL, NULL, Integer.valueOf('['), READ_INTEGER, READ_LINE, THIS, NEW, INSTANCEOF, Integer.valueOf('('), IDENTIFIER, LOR},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf(':'), Integer.valueOf(']')},
        {FOREACH},
        {Integer.valueOf('[')},
        {Integer.valueOf('{')},
        {OR},
        {ELSE, PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, TOR, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, LOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {DADD, LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {VOID, CLASS, INT, STRING, STATIC, BOOL, Integer.valueOf('}')},
        {TOR},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {DMOD, LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DADD, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, CLASS},
        {SEALED, CLASS},
        {RETURN},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('{')},
        {Integer.valueOf('('), Integer.valueOf(';')},
        {Integer.valueOf('('), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {SEALED, CLASS},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {IDENTIFIER, VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('='), Integer.valueOf(';'), Integer.valueOf(')')},
        {EXTENDS, Integer.valueOf('{')},
        {IF, ROR},
        {Integer.valueOf('+'), Integer.valueOf('-')},
        {Integer.valueOf('['), IDENTIFIER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, Integer.valueOf(')')},
        {VOID, CLASS, INT, STRING, BOOL},
        {EQUAL, NOT_EQUAL, Integer.valueOf(']'), FOR, ROR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {VOID, CLASS, INT, STRING, BOOL, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, VAR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), READ_INTEGER, WHILE, FOR, RETURN, PRINT, BREAK, Integer.valueOf('{'), SCOPY, IF, FOREACH},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, VAR, Integer.valueOf(';'), Integer.valueOf(')')},
        {INT, VOID, BOOL, STRING, CLASS},
        {WHILE},
        {OR, Integer.valueOf(']'), FOR, ROR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), IF, Integer.valueOf(';')},
        {Integer.valueOf('('), Integer.valueOf('{')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf(']'), FOR, ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, Integer.valueOf(';')},
        {WHILE, Integer.valueOf(')')},
        {DMOD},
        {Integer.valueOf('(')},
        {SCOPY},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), DMOD, Integer.valueOf('>')},
        {Integer.valueOf('['), Integer.valueOf('.'), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('-'), Integer.valueOf('!'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {SEALED, CLASS, eof, eos},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>')},
        {STATIC, VOID, CLASS, INT, STRING, BOOL},
    };
    
    /**
      * Get begin lookahead tokens for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its begin lookahead tokens.
      */
        
    public Set<Integer> beginSet(int symbol) {
        return begin.get(symbol - 296);
    }
    
    /* follow set */
    private ArrayList<Set<Integer>> follow = new ArrayList<Set<Integer>>();
    private final Integer[][] followRaw = {
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, TOR, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, LOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DADD, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), DMOD, Integer.valueOf('>')},
        {Integer.valueOf('}')},
        {IN},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf(')')},
        {Integer.valueOf(')')},
        {READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {TOR, Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(']')},
        {Integer.valueOf(']'), FOR, ROR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, IF, Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {CLASS},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DADD, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf(']')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), DMOD, Integer.valueOf('>')},
        {Integer.valueOf(';')},
        {Integer.valueOf(']'), FOR, ROR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, IF, Integer.valueOf(';')},
        {Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(')')},
        {Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, TOR, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, LOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(']'), FOR, ROR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), IF, Integer.valueOf(';')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, TOR, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, LOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, TOR, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, LOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, TOR, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, LOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('}')},
        {TOR, Integer.valueOf('}')},
        {Integer.valueOf(')')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DADD, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {SEALED, CLASS, eof, eos},
        {Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, TOR, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, LOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, STATIC, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {eof, eos},
        {Integer.valueOf(']'), FOR, ROR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), IF, Integer.valueOf(';')},
        {IDENTIFIER},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DADD, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), DMOD, Integer.valueOf('>')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('{')},
        {ROR},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {IDENTIFIER},
        {Integer.valueOf(']'), FOR, ROR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {Integer.valueOf(';'), Integer.valueOf(','), Integer.valueOf(')')},
        {Integer.valueOf(']'), FOR, ROR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, TOR, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, LOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('['), IDENTIFIER},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, TOR, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, LOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']'), FOR, ROR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), IF, Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, TOR, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, LOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']'), FOR, ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf(']'), FOR, ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, TOR, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, LOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(';')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), DMOD, Integer.valueOf('>')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), ROR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), DADD, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), DMOD, Integer.valueOf('>'), Integer.valueOf('%')},
        {eof, eos},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LOR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
    };
    
    /**
      * Get follow set for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its follow set.
      */
        
    public Set<Integer> followSet(int symbol) {
        return follow.get(symbol - 296);
    }
    
    public Table() {
        for (int i = 0; i < 83; i++) {
            begin.add(new HashSet<>(Arrays.asList(beginRaw[i])));
            follow.add(new HashSet<>(Arrays.asList(followRaw[i])));
        }
    }
    
    /**
      * Predictive table `M` query function.
      * `query(A, a)` will return the corresponding term `M(A, a)`, i.e., the target production
      * for non-terminal `A` when the lookahead token is `a`.
      *
      * @param nonTerminal   the non-terminal.
      * @param lookahead     the lookahead symbol.
      * @return a pair `<id, right>` where `right` is the right-hand side of the target
      * production `nonTerminal -> right`, and `id` is the corresponding action id. To execute
      * such action, call `act(id, params)`.
      * If the corresponding term is undefined in the table, `null` will be returned.
      */
        
    public Map.Entry<Integer, List<Integer>> query(int nonTerminal, int lookahead) {
        switch (nonTerminal) {
            //# line 600
            case ExprDAdd: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LOR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(0, Arrays.asList(ExprDMod, ExprDAddT));
                    default: return null;
                }
            }
            //# line 50
            case VariableDef: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(1, Arrays.asList(Variable, Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 680
            case ExprT5: {
                switch (lookahead) {
                    case '+':
                    case '-':
                        return new AbstractMap.SimpleEntry<>(2, Arrays.asList(Oper5, Expr6, ExprT5));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case ROR:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case DADD:
                    case AND:
                    case IF:
                    case ';':
                    case '<':
                    case DMOD:
                    case '>':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 310
            case GuardedCont: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LOR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(4, Arrays.asList(IfSubStmt, IfBranchs));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 269
            case BoundVariable: {
                switch (lookahead) {
                    case VAR:
                        return new AbstractMap.SimpleEntry<>(6, Arrays.asList(VAR, IDENTIFIER));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(7, Arrays.asList(Type, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 388
            case Oper3: {
                switch (lookahead) {
                    case EQUAL:
                        return new AbstractMap.SimpleEntry<>(8, Arrays.asList(EQUAL));
                    case NOT_EQUAL:
                        return new AbstractMap.SimpleEntry<>(9, Arrays.asList(NOT_EQUAL));
                    default: return null;
                }
            }
            //# line 448
            case Oper6: {
                switch (lookahead) {
                    case '*':
                        return new AbstractMap.SimpleEntry<>(10, Arrays.asList(Integer.valueOf('*')));
                    case '/':
                        return new AbstractMap.SimpleEntry<>(11, Arrays.asList(Integer.valueOf('/')));
                    case '%':
                        return new AbstractMap.SimpleEntry<>(12, Arrays.asList(Integer.valueOf('%')));
                    default: return null;
                }
            }
            //# line 176
            case VariableList: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(13, Arrays.asList(Variable, SubVariableList));
                    default: return null;
                }
            }
            //# line 166
            case Formals: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(14, Arrays.asList(VariableList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(15, Arrays.asList());
                    default: return null;
                }
            }
            //# line 465
            case Oper7: {
                switch (lookahead) {
                    case '-':
                        return new AbstractMap.SimpleEntry<>(16, Arrays.asList(Integer.valueOf('-')));
                    case '!':
                        return new AbstractMap.SimpleEntry<>(17, Arrays.asList(Integer.valueOf('!')));
                    default: return null;
                }
            }
            //# line 336
            case IfSubStmt: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LOR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(18, Arrays.asList(Expr, Integer.valueOf(':'), Stmt));
                    default: return null;
                }
            }
            //# line 736
            case Expr8: {
                switch (lookahead) {
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LOR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(19, Arrays.asList(Expr9, ExprT8));
                    default: return null;
                }
            }
            //# line 895
            case AfterSimpleTypeExpr: {
                switch (lookahead) {
                    case ']':
                        return new AbstractMap.SimpleEntry<>(20, Arrays.asList(Integer.valueOf(']'), Integer.valueOf('['), AfterSimpleTypeExpr));
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LOR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(21, Arrays.asList(Expr, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 945
            case Constants: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                    case '[':
                        return new AbstractMap.SimpleEntry<>(22, Arrays.asList(Constant, MoreConstants));
                    case ']':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 513
            case Expr2: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LOR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(24, Arrays.asList(Expr3, ExprT2));
                    default: return null;
                }
            }
            //# line 381
            case Oper2: {
                switch (lookahead) {
                    case AND:
                        return new AbstractMap.SimpleEntry<>(25, Arrays.asList(AND));
                    default: return null;
                }
            }
            //# line 109
            case SealedOpt: {
                switch (lookahead) {
                    case SEALED:
                        return new AbstractMap.SimpleEntry<>(26, Arrays.asList(SEALED));
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(27, Arrays.asList());
                    default: return null;
                }
            }
            //# line 636
            case ExprDMod: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LOR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(28, Arrays.asList(Expr5, ExprDModT));
                    default: return null;
                }
            }
            //# line 953
            case MoreConstants: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(29, Arrays.asList(Integer.valueOf(','), Constant, MoreConstants));
                    case ']':
                        return new AbstractMap.SimpleEntry<>(30, Arrays.asList());
                    default: return null;
                }
            }
            //# line 429
            case OperDAdd: {
                switch (lookahead) {
                    case DADD:
                        return new AbstractMap.SimpleEntry<>(31, Arrays.asList(DADD));
                    default: return null;
                }
            }
            //# line 318
            case IfBranchs: {
                switch (lookahead) {
                    case TOR:
                        return new AbstractMap.SimpleEntry<>(32, Arrays.asList(IfBranch, IfBranchs));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(33, Arrays.asList());
                    default: return null;
                }
            }
            //# line 756
            case ExprT8_2: {
                switch (lookahead) {
                    case DEFAULT:
                        return new AbstractMap.SimpleEntry<>(34, Arrays.asList(DEFAULT, Expr9));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case '.':
                    case '-':
                    case ROR:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case '+':
                    case DADD:
                    case AND:
                    case '*':
                    case IF:
                    case ';':
                    case '<':
                    case '[':
                    case DMOD:
                    case '>':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(35, Arrays.asList(ExprT8));
                    default: return null;
                }
            }
            //# line 697
            case Expr6: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LOR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(36, Arrays.asList(Expr7, ExprT6));
                    default: return null;
                }
            }
            //# line 1007
            case BreakStmt: {
                switch (lookahead) {
                    case BREAK:
                        return new AbstractMap.SimpleEntry<>(37, Arrays.asList(BREAK));
                    default: return null;
                }
            }
            //# line 525
            case ExprT2: {
                switch (lookahead) {
                    case AND:
                        return new AbstractMap.SimpleEntry<>(38, Arrays.asList(Oper2, Expr3, ExprT2));
                    case ']':
                    case FOR:
                    case ROR:
                    case ':':
                    case ')':
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 203
            case StmtList: {
                switch (lookahead) {
                    case PRINT:
                    case VOID:
                    case FOR:
                    case '!':
                    case FOREACH:
                    case '-':
                    case CLASS:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case SCOPY:
                    case IDENTIFIER:
                    case NEW:
                    case LOR:
                    case IF:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case STRING:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '[':
                    case BOOL:
                    case BREAK:
                    case READ_INTEGER:
                    case '{':
                        return new AbstractMap.SimpleEntry<>(40, Arrays.asList(Stmt, StmtList));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 919
            case Constant: {
                switch (lookahead) {
                    case LITERAL:
                        return new AbstractMap.SimpleEntry<>(42, Arrays.asList(LITERAL));
                    case NULL:
                        return new AbstractMap.SimpleEntry<>(43, Arrays.asList(NULL));
                    case '[':
                        return new AbstractMap.SimpleEntry<>(44, Arrays.asList(ArrayConstant));
                    default: return null;
                }
            }
            //# line 186
            case SubVariableList: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(45, Arrays.asList(Integer.valueOf(','), Variable, SubVariableList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 1039
            case PrintStmt: {
                switch (lookahead) {
                    case PRINT:
                        return new AbstractMap.SimpleEntry<>(47, Arrays.asList(PRINT, Integer.valueOf('('), ExprList, Integer.valueOf(')')));
                    default: return null;
                }
            }
            //# line 1001
            case ForStmt: {
                switch (lookahead) {
                    case FOR:
                        return new AbstractMap.SimpleEntry<>(48, Arrays.asList(FOR, Integer.valueOf('('), SimpleStmt, Integer.valueOf(';'), Expr, Integer.valueOf(';'), SimpleStmt, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 823
            case Expr9: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                    case '[':
                        return new AbstractMap.SimpleEntry<>(49, Arrays.asList(Constant));
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(50, Arrays.asList(READ_INTEGER, Integer.valueOf('('), Integer.valueOf(')')));
                    case READ_LINE:
                        return new AbstractMap.SimpleEntry<>(51, Arrays.asList(READ_LINE, Integer.valueOf('('), Integer.valueOf(')')));
                    case THIS:
                        return new AbstractMap.SimpleEntry<>(52, Arrays.asList(THIS));
                    case NEW:
                        return new AbstractMap.SimpleEntry<>(53, Arrays.asList(NEW, AfterNewExpr));
                    case INSTANCEOF:
                        return new AbstractMap.SimpleEntry<>(54, Arrays.asList(INSTANCEOF, Integer.valueOf('('), Expr, Integer.valueOf(','), IDENTIFIER, Integer.valueOf(')')));
                    case '(':
                        return new AbstractMap.SimpleEntry<>(55, Arrays.asList(Integer.valueOf('('), AfterParenExpr));
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(56, Arrays.asList(IDENTIFIER, AfterIdentExpr));
                    case LOR:
                        return new AbstractMap.SimpleEntry<>(57, Arrays.asList(LOR, Expr, FOR, IDENTIFIER, IN, Expr, IfExpr, ROR));
                    default: return null;
                }
            }
            //# line 484
            case Expr1: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LOR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(58, Arrays.asList(Expr2, ExprT1));
                    default: return null;
                }
            }
            //# line 767
            case ExprT8_1: {
                switch (lookahead) {
                    case ':':
                        return new AbstractMap.SimpleEntry<>(59, Arrays.asList(Integer.valueOf(':'), Expr, Integer.valueOf(']')));
                    case ']':
                        return new AbstractMap.SimpleEntry<>(60, Arrays.asList(Integer.valueOf(']'), ExprT8_2));
                    default: return null;
                }
            }
            //# line 261
            case ForeachStmt: {
                switch (lookahead) {
                    case FOREACH:
                        return new AbstractMap.SimpleEntry<>(61, Arrays.asList(FOREACH, Integer.valueOf('('), BoundVariable, IN, Expr, whileExpr, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 933
            case ArrayConstant: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(62, Arrays.asList(Integer.valueOf('['), Constants, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 302
            case GuardedStmt: {
                switch (lookahead) {
                    case '{':
                        return new AbstractMap.SimpleEntry<>(63, Arrays.asList(Integer.valueOf('{'), GuardedCont, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 374
            case Oper1: {
                switch (lookahead) {
                    case OR:
                        return new AbstractMap.SimpleEntry<>(64, Arrays.asList(OR));
                    default: return null;
                }
            }
            //# line 1019
            case ElseClause: {
                switch (lookahead) {
                    case ELSE:
                        return new AbstractMap.SimpleEntry<>(65, Arrays.asList(ELSE, Stmt));
                    case PRINT:
                    case VOID:
                    case FOR:
                    case '!':
                    case FOREACH:
                    case '-':
                    case CLASS:
                    case TOR:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case SCOPY:
                    case '}':
                    case IDENTIFIER:
                    case NEW:
                    case LOR:
                    case IF:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case STRING:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '[':
                    case BOOL:
                    case BREAK:
                    case READ_INTEGER:
                    case '{':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 616
            case ExprDAddT: {
                switch (lookahead) {
                    case DADD:
                        return new AbstractMap.SimpleEntry<>(67, Arrays.asList(OperDAdd, ExprDMod, ExprDAddT));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case ROR:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case AND:
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(68, Arrays.asList());
                    default: return null;
                }
            }
            //# line 126
            case FieldList: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case STATIC:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(69, Arrays.asList(Field, FieldList));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(70, Arrays.asList());
                    default: return null;
                }
            }
            //# line 329
            case IfBranch: {
                switch (lookahead) {
                    case TOR:
                        return new AbstractMap.SimpleEntry<>(71, Arrays.asList(TOR, IfSubStmt));
                    default: return null;
                }
            }
            //# line 982
            case SubExprList: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(72, Arrays.asList(Integer.valueOf(','), Expr, SubExprList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(73, Arrays.asList());
                    default: return null;
                }
            }
            //# line 648
            case ExprDModT: {
                switch (lookahead) {
                    case DMOD:
                        return new AbstractMap.SimpleEntry<>(74, Arrays.asList(OperDMod, Expr5, ExprDModT));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case ROR:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case DADD:
                    case AND:
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(75, Arrays.asList());
                    default: return null;
                }
            }
            //# line 907
            case AfterParenExpr: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LOR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(76, Arrays.asList(Expr, Integer.valueOf(')')));
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(77, Arrays.asList(CLASS, IDENTIFIER, Integer.valueOf(')'), Expr9));
                    default: return null;
                }
            }
            //# line 103
            case ClassDef: {
                switch (lookahead) {
                    case SEALED:
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(78, Arrays.asList(SealedOpt, CLASS, IDENTIFIER, ExtendsClause, Integer.valueOf('{'), FieldList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 1026
            case ReturnStmt: {
                switch (lookahead) {
                    case RETURN:
                        return new AbstractMap.SimpleEntry<>(79, Arrays.asList(RETURN, ReturnExpr));
                    default: return null;
                }
            }
            //# line 974
            case ExprList: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LOR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(80, Arrays.asList(Expr, SubExprList));
                    default: return null;
                }
            }
            //# line 197
            case StmtBlock: {
                switch (lookahead) {
                    case '{':
                        return new AbstractMap.SimpleEntry<>(81, Arrays.asList(Integer.valueOf('{'), StmtList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 158
            case FunctionField: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(82, Arrays.asList(Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case ';':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList(Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 816
            case AfterIdentExpr: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(84, Arrays.asList(Integer.valueOf('('), Actuals, Integer.valueOf(')')));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case '.':
                    case '-':
                    case ROR:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case '+':
                    case DADD:
                    case AND:
                    case '*':
                    case IF:
                    case ';':
                    case '<':
                    case '[':
                    case DMOD:
                    case '>':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 28
            case Program: {
                switch (lookahead) {
                    case SEALED:
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(86, Arrays.asList(ClassDef, ClassList));
                    default: return null;
                }
            }
            //# line 478
            case Expr: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LOR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(87, Arrays.asList(Expr1));
                    default: return null;
                }
            }
            //# line 84
            case Type: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(88, Arrays.asList(SimpleType, ArrayType));
                    default: return null;
                }
            }
            //# line 668
            case Expr5: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LOR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(89, Arrays.asList(Expr6, ExprT5));
                    default: return null;
                }
            }
            //# line 881
            case AfterNewExpr: {
                switch (lookahead) {
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(90, Arrays.asList(IDENTIFIER, Integer.valueOf('('), Integer.valueOf(')')));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(91, Arrays.asList(SimpleType, Integer.valueOf('['), AfterSimpleTypeExpr));
                    default: return null;
                }
            }
            //# line 365
            case Assignment: {
                switch (lookahead) {
                    case '=':
                        return new AbstractMap.SimpleEntry<>(92, Arrays.asList(Integer.valueOf('='), Expr));
                    case ';':
                    case ')':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 119
            case ExtendsClause: {
                switch (lookahead) {
                    case EXTENDS:
                        return new AbstractMap.SimpleEntry<>(94, Arrays.asList(EXTENDS, IDENTIFIER));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 870
            case IfExpr: {
                switch (lookahead) {
                    case IF:
                        return new AbstractMap.SimpleEntry<>(96, Arrays.asList(IF, Expr));
                    case ROR:
                        return new AbstractMap.SimpleEntry<>(97, Arrays.asList());
                    default: return null;
                }
            }
            //# line 436
            case Oper5: {
                switch (lookahead) {
                    case '+':
                        return new AbstractMap.SimpleEntry<>(98, Arrays.asList(Integer.valueOf('+')));
                    case '-':
                        return new AbstractMap.SimpleEntry<>(99, Arrays.asList(Integer.valueOf('-')));
                    default: return null;
                }
            }
            //# line 93
            case ArrayType: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(100, Arrays.asList(Integer.valueOf('['), Integer.valueOf(']'), ArrayType));
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(101, Arrays.asList());
                    default: return null;
                }
            }
            //# line 542
            case Expr3: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LOR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(102, Arrays.asList(Expr4, ExprT3));
                    default: return null;
                }
            }
            //# line 964
            case Actuals: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LOR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(103, Arrays.asList(ExprList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(104, Arrays.asList());
                    default: return null;
                }
            }
            //# line 56
            case Variable: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(105, Arrays.asList(Type, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 554
            case ExprT3: {
                switch (lookahead) {
                    case EQUAL:
                    case NOT_EQUAL:
                        return new AbstractMap.SimpleEntry<>(106, Arrays.asList(Oper3, Expr4, ExprT3));
                    case ']':
                    case FOR:
                    case ROR:
                    case ':':
                    case ')':
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case AND:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 211
            case Stmt: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(108, Arrays.asList(VariableDef));
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LOR:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(109, Arrays.asList(SimpleStmt, Integer.valueOf(';')));
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(110, Arrays.asList(WhileStmt));
                    case FOR:
                        return new AbstractMap.SimpleEntry<>(111, Arrays.asList(ForStmt));
                    case RETURN:
                        return new AbstractMap.SimpleEntry<>(112, Arrays.asList(ReturnStmt, Integer.valueOf(';')));
                    case PRINT:
                        return new AbstractMap.SimpleEntry<>(113, Arrays.asList(PrintStmt, Integer.valueOf(';')));
                    case BREAK:
                        return new AbstractMap.SimpleEntry<>(114, Arrays.asList(BreakStmt, Integer.valueOf(';')));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(115, Arrays.asList(StmtBlock));
                    case SCOPY:
                        return new AbstractMap.SimpleEntry<>(116, Arrays.asList(OCStmt, Integer.valueOf(';')));
                    case IF:
                        return new AbstractMap.SimpleEntry<>(117, Arrays.asList(IF, IfSuf));
                    case FOREACH:
                        return new AbstractMap.SimpleEntry<>(118, Arrays.asList(ForeachStmt));
                    default: return null;
                }
            }
            //# line 350
            case SimpleStmt: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LOR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(119, Arrays.asList(Expr, Assignment));
                    case VAR:
                        return new AbstractMap.SimpleEntry<>(120, Arrays.asList(VAR, IDENTIFIER, Integer.valueOf('='), Expr));
                    case ';':
                    case ')':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 62
            case SimpleType: {
                switch (lookahead) {
                    case INT:
                        return new AbstractMap.SimpleEntry<>(122, Arrays.asList(INT));
                    case VOID:
                        return new AbstractMap.SimpleEntry<>(123, Arrays.asList(VOID));
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(124, Arrays.asList(BOOL));
                    case STRING:
                        return new AbstractMap.SimpleEntry<>(125, Arrays.asList(STRING));
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(126, Arrays.asList(CLASS, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 995
            case WhileStmt: {
                switch (lookahead) {
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(127, Arrays.asList(WHILE, Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 496
            case ExprT1: {
                switch (lookahead) {
                    case OR:
                        return new AbstractMap.SimpleEntry<>(128, Arrays.asList(Oper1, Expr2, ExprT1));
                    case ']':
                    case FOR:
                    case ROR:
                    case ':':
                    case ')':
                    case ',':
                    case WHILE:
                    case '=':
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 292
            case IfSuf: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(130, Arrays.asList(IfStmt));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(131, Arrays.asList(GuardedStmt));
                    default: return null;
                }
            }
            //# line 571
            case Expr4: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LOR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(132, Arrays.asList(ExprDAdd, ExprT4));
                    default: return null;
                }
            }
            //# line 583
            case ExprT4: {
                switch (lookahead) {
                    case LESS_EQUAL:
                    case GREATER_EQUAL:
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(133, Arrays.asList(Oper4, ExprDAdd, ExprT4));
                    case ']':
                    case FOR:
                    case ROR:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case AND:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 1032
            case ReturnExpr: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LOR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(135, Arrays.asList(Expr));
                    case ';':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 281
            case whileExpr: {
                switch (lookahead) {
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(137, Arrays.asList(WHILE, Expr));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(138, Arrays.asList());
                    default: return null;
                }
            }
            //# line 422
            case OperDMod: {
                switch (lookahead) {
                    case DMOD:
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList(DMOD));
                    default: return null;
                }
            }
            //# line 1013
            case IfStmt: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(140, Arrays.asList(Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt, ElseClause));
                    default: return null;
                }
            }
            //# line 343
            case OCStmt: {
                switch (lookahead) {
                    case SCOPY:
                        return new AbstractMap.SimpleEntry<>(141, Arrays.asList(SCOPY, Integer.valueOf('('), IDENTIFIER, Integer.valueOf(','), Expr, Integer.valueOf(')')));
                    default: return null;
                }
            }
            //# line 709
            case ExprT6: {
                switch (lookahead) {
                    case '*':
                    case '/':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(142, Arrays.asList(Oper6, Expr7, ExprT6));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case '-':
                    case ROR:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case '+':
                    case DADD:
                    case AND:
                    case IF:
                    case ';':
                    case '<':
                    case DMOD:
                    case '>':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 781
            case ExprT8: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(144, Arrays.asList(Integer.valueOf('['), Expr, ExprT8_1));
                    case '.':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList(Integer.valueOf('.'), IDENTIFIER, AfterIdentExpr, ExprT8));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case '-':
                    case ROR:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case '+':
                    case DADD:
                    case AND:
                    case '*':
                    case IF:
                    case ';':
                    case '<':
                    case DMOD:
                    case '>':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 726
            case Expr7: {
                switch (lookahead) {
                    case '-':
                    case '!':
                        return new AbstractMap.SimpleEntry<>(147, Arrays.asList(Oper7, Expr8));
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LOR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(148, Arrays.asList(Expr8));
                    default: return null;
                }
            }
            //# line 39
            case ClassList: {
                switch (lookahead) {
                    case SEALED:
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList(ClassDef, ClassList));
                    case eof:
                    case eos:
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 400
            case Oper4: {
                switch (lookahead) {
                    case LESS_EQUAL:
                        return new AbstractMap.SimpleEntry<>(151, Arrays.asList(LESS_EQUAL));
                    case GREATER_EQUAL:
                        return new AbstractMap.SimpleEntry<>(152, Arrays.asList(GREATER_EQUAL));
                    case '<':
                        return new AbstractMap.SimpleEntry<>(153, Arrays.asList(Integer.valueOf('<')));
                    case '>':
                        return new AbstractMap.SimpleEntry<>(154, Arrays.asList(Integer.valueOf('>')));
                    default: return null;
                }
            }
            //# line 142
            case Field: {
                switch (lookahead) {
                    case STATIC:
                        return new AbstractMap.SimpleEntry<>(155, Arrays.asList(STATIC, Type, IDENTIFIER, Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(156, Arrays.asList(Type, IDENTIFIER, FunctionField));
                    default: return null;
                }
            }
            default: return null;
        }
    }
    
    /**
      * Execute some user-defined semantic action on the specification file.
      * Note that `$$ = params[0], $1 = params[1], ...`. Nothing will be returned, so please
      * do not forget to store the parsed AST result in `params[0]`.
      *
      * @param id      the action id.
      * @param params  parameter array.
      */
        
    public void act(int id, SemValue[] params) {
        switch (id) {
            case 0: {
                //# line 601
                if(params[2].svec==null) params[0].expr = params[1].expr ;
                else{
                	int len=params[2].svec.size() ;
                	params[0].expr = params[2].evec.get(len-1);
                	for(int i = len-2 ; i>=0; --i){
                		params[0].expr = new Tree.Binary(params[2].svec.get(i+1), params[2].evec.get(i),
                		 		params[0].expr, params[2].lvec.get(i+1));
                	}
                	params[0].expr = new Tree.Binary(params[2].svec.get(0), params[1].expr,
                				params[0].expr, params[2].lvec.get(0)) ;
                }
                return;
            }
            case 1: {
                //# line 51
                params[0].vdef = params[1].vdef;
                return;
            }
            case 2: {
                //# line 681
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 3: {
                /* no action */
                return;
            }
            case 4: {
                //# line 311
                params[0].gif = new GuardedIf(params[2].glist, params[2].loc) ;
                params[0].gif.fields.add(0, new IfSubStmt(params[1].expr, params[1].stmt, params[1].loc)) ;
                return;
            }
            case 5: {
                /* no action */
                return;
            }
            case 6: {
                //# line 270
                params[0].type = new Tree.TypeIdent(Tree.VAR, params[1].loc) ;
                params[0].ident = params[2].ident ;
                return;
            }
            case 7: {
                //# line 275
                params[0].type = params[1].type ;
                params[0].ident = params[2].ident ;
                return;
            }
            case 8: {
                //# line 389
                params[0].counter = Tree.EQ;
                params[0].loc = params[1].loc;
                return;
            }
            case 9: {
                //# line 394
                params[0].counter = Tree.NE;
                params[0].loc = params[1].loc;
                return;
            }
            case 10: {
                //# line 449
                params[0].counter = Tree.MUL;
                params[0].loc = params[1].loc;
                return;
            }
            case 11: {
                //# line 454
                params[0].counter = Tree.DIV;
                params[0].loc = params[1].loc;
                return;
            }
            case 12: {
                //# line 459
                params[0].counter = Tree.MOD;
                params[0].loc = params[1].loc;
                return;
            }
            case 13: {
                //# line 177
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[1].vdef);
                if (params[2].vlist != null) {
                    params[0].vlist.addAll(params[2].vlist);
                }
                return;
            }
            case 14: {
                //# line 167
                params[0].vlist = params[1].vlist;
                return;
            }
            case 15: {
                //# line 171
                params[0].vlist = new ArrayList<VarDef>();
                return;
            }
            case 16: {
                //# line 466
                params[0].counter = Tree.NEG;
                params[0].loc = params[1].loc;
                return;
            }
            case 17: {
                //# line 471
                params[0].counter = Tree.NOT;
                params[0].loc = params[1].loc;
                return;
            }
            case 18: {
                //# line 337
                params[0].expr = params[1].expr ;
                params[0].stmt = params[3].stmt ;
                return;
            }
            case 19: {
                //# line 737
                params[0].expr = params[1].expr;
                params[0].loc = params[1].loc;
                if (params[2].vec != null) {
                    for (SemValue v : params[2].vec) {
                        if (v.expr != null) {
                            params[0].expr = new Tree.Indexed(params[0].expr, v.expr, params[0].loc);
                        } else if (v.elist != null) {
                            params[0].expr = new Tree.CallExpr(params[0].expr, v.ident, v.elist, v.loc);
                            params[0].loc = v.loc;
                        } else {
                            params[0].expr = new Tree.Ident(false, params[0].expr, v.ident, v.loc);
                            params[0].loc = v.loc;
                        }
                    }
                }
                return;
            }
            case 20: {
                //# line 896
                params[0].expr = params[3].expr;
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 21: {
                //# line 901
                params[0].expr = params[1].expr;
                params[0].counter = 0;
                return;
            }
            case 22: {
                //# line 946
                params[0].elist = params[2].elist ;
                params[0].elist.add(0, params[1].expr) ;
                return;
            }
            case 23: {
                /* no action */
                return;
            }
            case 24: {
                //# line 514
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 25: {
                //# line 382
                params[0].counter = Tree.AND;
                params[0].loc = params[1].loc;
                return;
            }
            case 26: {
                //# line 110
                params[0] = params[1] ;
                return;
            }
            case 27: {
                //# line 114
                params[0] = new SemValue() ;
                return;
            }
            case 28: {
                //# line 637
                params[0].expr = params[1].expr ;
                if (params[2].svec != null) {
                                      for (int i = 0; i < params[2].svec.size(); ++i) {
                                          params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                                              params[2].evec.get(i), params[2].lvec.get(i));
                                      }
                                  }
                return;
            }
            case 29: {
                //# line 954
                params[0].elist = params[3].elist ;
                params[0].elist.add(0, params[2].expr) ;
                return;
            }
            case 30: {
                //# line 959
                params[0].elist = new ArrayList<Tree.Expr>() ;
                return;
            }
            case 31: {
                //# line 430
                params[0].counter = Tree.DADD;
                params[0].loc = params[1].loc;
                return;
            }
            case 32: {
                //# line 319
                params[0].glist=params[2].glist ;
                params[0].glist.add(0, new IfSubStmt(params[1].expr, params[1].stmt, params[1].loc)) ;
                return;
            }
            case 33: {
                //# line 324
                params[0].glist = new ArrayList<IfSubStmt>() ;
                return;
            }
            case 34: {
                //# line 757
                params[0].expr=params[2].expr ;
                params[0].myType=2 ;
                return;
            }
            case 35: {
                //# line 762
                params[0].vec=params[1].vec;
                return;
            }
            case 36: {
                //# line 698
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 37: {
                //# line 1008
                params[0].stmt = new Tree.Break(params[1].loc);
                return;
            }
            case 38: {
                //# line 526
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 39: {
                /* no action */
                return;
            }
            case 40: {
                //# line 204
                params[0].slist.add(params[1].stmt);
                params[0].slist.addAll(params[2].slist);
                return;
            }
            case 41: {
                /* no action */
                return;
            }
            case 42: {
                //# line 920
                params[0].expr = new Tree.Literal(params[1].typeTag, params[1].literal, params[1].loc);
                return;
            }
            case 43: {
                //# line 924
                params[0].expr = new Null(params[1].loc);
                return;
            }
            case 44: {
                //# line 928
                params[0].expr = params[1].acons ;
                return;
            }
            case 45: {
                //# line 187
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[2].vdef);
                if (params[3].vlist != null) {
                    params[0].vlist.addAll(params[3].vlist);
                }
                return;
            }
            case 46: {
                /* no action */
                return;
            }
            case 47: {
                //# line 1040
                params[0].stmt = new Tree.Print(params[3].elist, params[1].loc);
                return;
            }
            case 48: {
                //# line 1002
                params[0].stmt = new Tree.ForLoop(params[3].stmt, params[5].expr, params[7].stmt, params[9].stmt, params[1].loc);
                return;
            }
            case 49: {
                //# line 824
                params[0].expr = params[1].expr;
                return;
            }
            case 50: {
                //# line 828
                params[0].expr = new Tree.ReadIntExpr(params[1].loc);
                return;
            }
            case 51: {
                //# line 832
                params[0].expr = new Tree.ReadLineExpr(params[1].loc);
                return;
            }
            case 52: {
                //# line 836
                params[0].expr = new Tree.ThisExpr(params[1].loc);
                return;
            }
            case 53: {
                //# line 840
                if (params[2].ident != null) {
                    params[0].expr = new Tree.NewClass(params[2].ident, params[1].loc);
                } else {
                    params[0].expr = new Tree.NewArray(params[2].type, params[2].expr, params[1].loc);
                }
                return;
            }
            case 54: {
                //# line 848
                params[0].expr = new Tree.TypeTest(params[3].expr, params[5].ident, params[1].loc);
                return;
            }
            case 55: {
                //# line 852
                params[0].expr = params[2].expr;
                return;
            }
            case 56: {
                //# line 856
                if (params[2].elist != null) {
                    params[0].expr = new Tree.CallExpr(null, params[1].ident, params[2].elist, params[1].loc);
                } else {
                    params[0].expr = new Tree.Ident(false, null, params[1].ident, params[1].loc);
                }
                return;
            }
            case 57: {
                //# line 864
                if(params[7].expr==null) params[7].expr = new Tree.Literal(Tree.BOOL, true, params[1].loc) ;
                params[0].expr = new Tree.CompArrayExpr(params[2].expr, params[4].ident, params[6].expr, params[7].expr, params[1].loc) ;
                return;
            }
            case 58: {
                //# line 485
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 59: {
                //# line 768
                params[0].myType = 1 ;
                params[0].expr = params[2].expr ;
                return;
            }
            case 60: {
                //# line 773
                params[0].vec = params[2].vec ;
                params[0].expr = params[2].expr ;
                if(params[2].myType==2) params[0].myType=3 ;
                else params[0].myType=4 ;
                return;
            }
            case 61: {
                //# line 262
                if(params[6].expr==null)
                	params[6].expr = new Tree.Literal(Tree.BOOL, true, params[7].loc) ;
                params[0].stmt = new Tree.Foreach(params[3].type, params[3].ident, params[5].expr, params[6].expr, params[8].stmt, params[1].loc) ;
                return;
            }
            case 62: {
                //# line 934
                if(params[2].elist != null){
                	params[0].acons = new Tree.ArrayConstant(params[2].elist, params[2].loc) ;
                }
                else{
                	params[0].acons = new Tree.ArrayConstant(new ArrayList<Tree.Expr>(), params[2].loc) ;
                }
                return;
            }
            case 63: {
                //# line 303
                params[0].stmt = params[2].gif ;
                if(params[0].stmt==null)
                	params[0].stmt = new GuardedIf(new ArrayList<IfSubStmt>() , params[1].loc) ;
                return;
            }
            case 64: {
                //# line 375
                params[0].counter = Tree.OR;
                params[0].loc = params[1].loc;
                return;
            }
            case 65: {
                //# line 1020
                params[0].stmt = params[2].stmt;
                return;
            }
            case 66: {
                /* no action */
                return;
            }
            case 67: {
                //# line 617
                params[0].svec = new Vector<Integer>() ;
                params[0].lvec = new Vector<Location>() ;
                params[0].evec = new Vector<Expr>() ;
                params[0].svec.add(params[1].counter) ;
                params[0].lvec.add(params[1].loc) ;
                params[0].evec.add(params[2].expr) ;
                if(params[3].svec!=null){
                	params[0].svec.addAll(params[3].svec) ;
                	params[0].lvec.addAll(params[3].lvec) ;
                	params[0].evec.addAll(params[3].evec) ;
                }
                return;
            }
            case 68: {
                //# line 631
                params[0].svec = null ;
                return;
            }
            case 69: {
                //# line 127
                params[0].flist = new ArrayList<Tree>();
                if (params[1].vdef != null) {
                    params[0].flist.add(params[1].vdef);
                } else {
                    params[0].flist.add(params[1].fdef);
                }
                params[0].flist.addAll(params[2].flist);
                return;
            }
            case 70: {
                //# line 137
                params[0].flist = new ArrayList<Tree>();
                return;
            }
            case 71: {
                //# line 330
                params[0].expr = params[2].expr;
                params[0].stmt = params[2].stmt;
                return;
            }
            case 72: {
                //# line 983
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[2].expr);
                params[0].elist.addAll(params[3].elist);
                return;
            }
            case 73: {
                //# line 989
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 74: {
                //# line 649
                params[0].svec = new Vector<Integer>() ;
                params[0].lvec = new Vector<Location>() ;
                params[0].evec = new Vector<Expr>() ;
                params[0].svec.add(params[1].counter) ;
                params[0].lvec.add(params[1].loc) ;
                params[0].evec.add(params[2].expr) ;
                if(params[3].svec!=null){
                	params[0].svec.addAll(params[3].svec) ;
                	params[0].lvec.addAll(params[3].lvec) ;
                	params[0].evec.addAll(params[3].evec) ;
                }
                return;
            }
            case 75: {
                //# line 663
                params[0].svec = null ;
                return;
            }
            case 76: {
                //# line 908
                params[0].expr = params[1].expr;
                return;
            }
            case 77: {
                //# line 912
                params[0].expr = new Tree.TypeCast(params[2].ident, params[4].expr, params[4].loc);
                return;
            }
            case 78: {
                //# line 104
                params[0].cdef = new Tree.ClassDef(params[1].code==SEALED, params[3].ident, params[4].ident, params[6].flist, params[2].loc);
                return;
            }
            case 79: {
                //# line 1027
                params[0].stmt = new Tree.Return(params[2].expr, params[1].loc);
                return;
            }
            case 80: {
                //# line 975
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[1].expr);
                params[0].elist.addAll(params[2].elist);
                return;
            }
            case 81: {
                //# line 198
                params[0].stmt = new Tree.Block(params[2].slist, params[1].loc);
                return;
            }
            case 82: {
                //# line 159
                params[0].vlist = params[2].vlist;
                params[0].stmt = params[4].stmt;
                return;
            }
            case 83: {
                /* no action */
                return;
            }
            case 84: {
                //# line 817
                params[0].elist = params[2].elist;
                return;
            }
            case 85: {
                /* no action */
                return;
            }
            case 86: {
                //# line 29
                params[0].clist = new ArrayList<ClassDef>(	);
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                params[0].prog = new Tree.TopLevel(params[0].clist, params[0].loc);
                return;
            }
            case 87: {
                //# line 479
                params[0].expr = params[1].expr;
                return;
            }
            case 88: {
                //# line 85
                params[0].type = params[1].type;
                for (int i = 0; i < params[2].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                return;
            }
            case 89: {
                //# line 669
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 90: {
                //# line 882
                params[0].ident = params[1].ident;
                return;
            }
            case 91: {
                //# line 886
                params[0].type = params[1].type;
                for (int i = 0; i < params[3].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                params[0].expr = params[3].expr;
                return;
            }
            case 92: {
                //# line 366
                params[0].loc = params[1].loc;
                params[0].expr = params[2].expr;
                return;
            }
            case 93: {
                /* no action */
                return;
            }
            case 94: {
                //# line 120
                params[0].ident = params[2].ident;
                return;
            }
            case 95: {
                /* no action */
                return;
            }
            case 96: {
                //# line 871
                params[0].expr = params[2].expr ;
                return;
            }
            case 97: {
                //# line 875
                params[0] = new SemValue() ;
                params[0].expr = null ;
                return;
            }
            case 98: {
                //# line 437
                params[0].counter = Tree.PLUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 99: {
                //# line 442
                params[0].counter = Tree.MINUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 100: {
                //# line 94
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 101: {
                //# line 98
                params[0].counter = 0;
                return;
            }
            case 102: {
                //# line 543
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 103: {
                //# line 965
                params[0].elist = params[1].elist;
                return;
            }
            case 104: {
                //# line 969
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 105: {
                //# line 57
                params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                return;
            }
            case 106: {
                //# line 555
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 107: {
                /* no action */
                return;
            }
            case 108: {
                //# line 212
                params[0].stmt = params[1].vdef;
                return;
            }
            case 109: {
                //# line 216
                if (params[1].stmt == null) {
                    params[0].stmt = new Tree.Skip(params[2].loc);
                } else {
                    params[0].stmt = params[1].stmt;
                }
                return;
            }
            case 110: {
                //# line 224
                params[0].stmt = params[1].stmt;
                return;
            }
            case 111: {
                //# line 228
                params[0].stmt = params[1].stmt;
                return;
            }
            case 112: {
                //# line 232
                params[0].stmt = params[1].stmt;
                return;
            }
            case 113: {
                //# line 236
                params[0].stmt = params[1].stmt;
                return;
            }
            case 114: {
                //# line 240
                params[0].stmt = params[1].stmt;
                return;
            }
            case 115: {
                //# line 244
                params[0].stmt = params[1].stmt;
                return;
            }
            case 116: {
                //# line 248
                params[0].stmt = params[1].stmt;
                return;
            }
            case 117: {
                //# line 252
                params[0].stmt = params[2].stmt;
                return;
            }
            case 118: {
                //# line 256
                params[0].stmt = params[1].stmt;
                return;
            }
            case 119: {
                //# line 351
                if (params[2].expr == null) {
                    params[0].stmt = new Tree.Calculate(params[1].expr, params[1].loc);
                } else {
                    params[0].stmt = new Tree.Assign(params[1].expr, params[2].expr, params[2].loc);
                }
                return;
            }
            case 120: {
                //# line 359
                params[0].stmt = new Tree.Assign(new Tree.Ident(true, null, params[2].ident, params[2].loc), params[4].expr, params[1].loc);
                return;
            }
            case 121: {
                /* no action */
                return;
            }
            case 122: {
                //# line 63
                params[0].type = new Tree.TypeIdent(Tree.INT, params[1].loc);
                return;
            }
            case 123: {
                //# line 67
                params[0].type = new Tree.TypeIdent(Tree.VOID, params[1].loc);
                return;
            }
            case 124: {
                //# line 71
                params[0].type = new Tree.TypeIdent(Tree.BOOL, params[1].loc);
                return;
            }
            case 125: {
                //# line 75
                params[0].type = new Tree.TypeIdent(Tree.STRING, params[1].loc);
                return;
            }
            case 126: {
                //# line 79
                params[0].type = new Tree.TypeClass(params[2].ident, params[1].loc);
                return;
            }
            case 127: {
                //# line 996
                params[0].stmt = new Tree.WhileLoop(params[3].expr, params[5].stmt, params[1].loc);
                return;
            }
            case 128: {
                //# line 497
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 129: {
                /* no action */
                return;
            }
            case 130: {
                //# line 293
                params[0].stmt = params[1].stmt ;
                return;
            }
            case 131: {
                //# line 297
                params[0].stmt = params[1].stmt ;					
                return;
            }
            case 132: {
                //# line 572
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 133: {
                //# line 584
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 134: {
                /* no action */
                return;
            }
            case 135: {
                //# line 1033
                params[0].expr = params[1].expr;
                return;
            }
            case 136: {
                /* no action */
                return;
            }
            case 137: {
                //# line 282
                params[0].expr = params[2].expr ;
                return;
            }
            case 138: {
                //# line 286
                params[0] = new SemValue() ;
                params[0].expr = null ;
                return;
            }
            case 139: {
                //# line 423
                params[0].counter = Tree.DMOD;
                params[0].loc = params[1].loc;
                return;
            }
            case 140: {
                //# line 1014
                params[0].stmt = new Tree.If(params[2].expr, params[4].stmt, params[5].stmt, params[1].loc);
                return;
            }
            case 141: {
                //# line 344
                params[0].stmt = new Tree.Scopy(params[3].ident, params[5].expr , params[3].loc) ;
                return;
            }
            case 142: {
                //# line 710
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 143: {
                /* no action */
                return;
            }
            case 144: {
                //# line 782
                SemValue sem = new SemValue();
                params[0].vec = new Vector<SemValue>();
                if(params[3].myType == 1){
                	sem.expr = new Tree.ArrayRange(params[2].expr, params[3].expr, params[1].loc) ;
                	params[0].vec.add(sem);
                }
                else if(params[3].myType==3){
                	sem.expr = new Tree.DefaultArrayRef(params[2].expr, params[3].expr, params[1].loc) ;
                	params[0].vec.add(sem);
                }
                else if(params[3].myType==4){ 
                	sem.expr = params[2].expr;
                	params[0].vec.add(sem);
                	if (params[3].vec != null) {
                	    params[0].vec.addAll(params[3].vec);
                	}
                }
                return;
            }
            case 145: {
                //# line 802
                SemValue sem = new SemValue();
                sem.ident = params[2].ident;
                sem.loc = params[2].loc;
                sem.elist = params[3].elist;
                params[0].vec = new Vector<SemValue>();
                params[0].vec.add(sem);
                if (params[4].vec != null) {
                    params[0].vec.addAll(params[4].vec);
                }
                return;
            }
            case 146: {
                /* no action */
                return;
            }
            case 147: {
                //# line 727
                params[0].expr = new Tree.Unary(params[1].counter, params[2].expr, params[1].loc);
                return;
            }
            case 148: {
                //# line 731
                params[0].expr = params[1].expr;
                return;
            }
            case 149: {
                //# line 40
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                return;
            }
            case 150: {
                /* no action */
                return;
            }
            case 151: {
                //# line 401
                params[0].counter = Tree.LE;
                params[0].loc = params[1].loc;
                return;
            }
            case 152: {
                //# line 406
                params[0].counter = Tree.GE;
                params[0].loc = params[1].loc;
                return;
            }
            case 153: {
                //# line 411
                params[0].counter = Tree.LT;
                params[0].loc = params[1].loc;
                return;
            }
            case 154: {
                //# line 416
                params[0].counter = Tree.GT;
                params[0].loc = params[1].loc;
                return;
            }
            case 155: {
                //# line 143
                params[0].fdef = new Tree.MethodDef(true, params[3].ident, params[2].type, params[5].vlist,
                    (Block) params[7].stmt, params[3].loc);
                return;
            }
            case 156: {
                //# line 148
                if (params[3].vlist != null) {
                    params[0].fdef = new Tree.MethodDef(false, params[2].ident, params[1].type, params[3].vlist,
                        (Block) params[3].stmt, params[2].loc);
                } else {
                    params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                }
                return;
            }
        }
    }
}
/* end of file */
