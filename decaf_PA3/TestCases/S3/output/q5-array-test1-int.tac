VTABLE(_Main) {
    <empty>
    Main
}

FUNCTION(_Main_New) {
memo ''
_Main_New:
    _T0 = 4
    parm _T0
    _T1 =  call _Alloc
    _T2 = VTBL <_Main>
    *(_T1 + 0) = _T2
    return _T1
}

FUNCTION(main) {
memo ''
main:
    _T4 = 3
    _T5 = 6
    _T6 = 1
    _T7 = 4
    _T8 = 0
    _T9 = (_T5 < _T8)
    if (_T9 == 0) branch _L10
    _T10 = "Decaf runtime error: The length of the created array should not be less than 0.\n"
    parm _T10
    call _PrintString
    call _Halt
_L10:
    _T11 = 4
    _T12 = (_T11 * _T5)
    _T13 = (_T11 + _T12)
    parm _T13
    _T14 =  call _Alloc
    *(_T14 + 0) = _T5
    _T15 = 0
    _T14 = (_T14 + _T13)
_L11:
    _T13 = (_T13 - _T11)
    if (_T13 == 0) branch _L12
    _T14 = (_T14 - _T11)
    *(_T14 + 0) = _T15
    branch _L11
_L12:
    _T16 = _T5
    _T17 = _T14
_L13:
    if (_T16 == 0) branch _L14
    *(_T17 + 0) = _T4
    _T17 = (_T17 + _T7)
    _T16 = (_T16 - _T6)
    branch _L13
_L14:
    _T3 = _T14
    _T18 = 1
    _T19 = *(_T3 - 4)
    _T20 = (_T18 < _T19)
    if (_T20 == 0) branch _L15
    _T21 = 0
    _T22 = (_T18 < _T21)
    if (_T22 == 0) branch _L16
_L15:
    _T23 = "Decaf runtime error: Array subscript out of bounds\n"
    parm _T23
    call _PrintString
    call _Halt
_L16:
    _T24 = 4
    _T25 = (_T18 * _T24)
    _T26 = (_T3 + _T25)
    _T27 = *(_T26 + 0)
    _T28 = 1
    _T29 = *(_T3 - 4)
    _T30 = (_T28 < _T29)
    if (_T30 == 0) branch _L17
    _T31 = 0
    _T32 = (_T28 < _T31)
    if (_T32 == 0) branch _L18
_L17:
    _T33 = "Decaf runtime error: Array subscript out of bounds\n"
    parm _T33
    call _PrintString
    call _Halt
_L18:
    _T34 = 4
    _T35 = (_T28 * _T34)
    _T36 = (_T3 + _T35)
    _T37 = *(_T36 + 0)
    _T38 = 1
    _T39 = (_T37 + _T38)
    _T40 = 4
    _T41 = (_T18 * _T40)
    _T42 = (_T3 + _T41)
    *(_T42 + 0) = _T39
    _T43 = 0
    _T44 = *(_T3 - 4)
    _T45 = (_T43 < _T44)
    if (_T45 == 0) branch _L19
    _T46 = 0
    _T47 = (_T43 < _T46)
    if (_T47 == 0) branch _L20
_L19:
    _T48 = "Decaf runtime error: Array subscript out of bounds\n"
    parm _T48
    call _PrintString
    call _Halt
_L20:
    _T49 = 4
    _T50 = (_T43 * _T49)
    _T51 = (_T3 + _T50)
    _T52 = *(_T51 + 0)
    parm _T52
    call _PrintInt
    _T53 = "\n"
    parm _T53
    call _PrintString
    _T54 = 1
    _T55 = *(_T3 - 4)
    _T56 = (_T54 < _T55)
    if (_T56 == 0) branch _L21
    _T57 = 0
    _T58 = (_T54 < _T57)
    if (_T58 == 0) branch _L22
_L21:
    _T59 = "Decaf runtime error: Array subscript out of bounds\n"
    parm _T59
    call _PrintString
    call _Halt
_L22:
    _T60 = 4
    _T61 = (_T54 * _T60)
    _T62 = (_T3 + _T61)
    _T63 = *(_T62 + 0)
    parm _T63
    call _PrintInt
    _T64 = "\n"
    parm _T64
    call _PrintString
}

