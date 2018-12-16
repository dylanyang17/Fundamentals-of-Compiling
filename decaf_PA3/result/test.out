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
    _T4 = "pa1"
    _T5 = 2
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
    _T19 = 0
    _T20 = "pa2"
    _T22 = 0
    _T23 = 4
    _T24 = (_T19 >= _T22)
    if (_T24 == 0) branch _L15
    _T25 = *(_T3 - 4)
    _T26 = (_T19 < _T25)
    if (_T26 == 0) branch _L15
    _T27 = (_T19 * _T23)
    _T28 = (_T27 + _T3)
    _T29 = *(_T28 + 0)
    _T21 = _T29
    branch _L16
_L15:
    _T21 = _T20
_L16:
    _T18 = _T21
    _T31 = 2
    _T32 = "pa3"
    _T34 = 0
    _T35 = 4
    _T36 = (_T31 >= _T34)
    if (_T36 == 0) branch _L17
    _T37 = *(_T3 - 4)
    _T38 = (_T31 < _T37)
    if (_T38 == 0) branch _L17
    _T39 = (_T31 * _T35)
    _T40 = (_T39 + _T3)
    _T41 = *(_T40 + 0)
    _T33 = _T41
    branch _L18
_L17:
    _T33 = _T32
_L18:
    _T30 = _T33
    parm _T18
    call _PrintString
    parm _T30
    call _PrintString
}

