package com.dslplatform.ocd

trait DslTypeImplStub
    extends OcdImpl
    with TipeConstrainnessType
    with BoxOnenessType
    with BoxNullnessType
    with DslTypeImplPrinter
    with LangDslType {
  def dslType: String
  def boxType: String
}

// ------------------------------------

trait DslOneImpl
    extends DslTypeImplStub
    with BoxOneType
    with BoxNonNullableType {
  def boxType = "One"
}

trait DslOptImpl
    extends DslTypeImplStub
    with BoxOneType
    with BoxNullableType {
  def boxType = "Opt"
}

trait DslArrImpl
    extends DslTypeImplStub
    with BoxArrayType
    with BoxNonNullableType
    with BoxElementsNonNullableType {
  def boxType = "Arr"
}

trait DslListImpl
    extends DslTypeImplStub
    with BoxListType
    with BoxNonNullableType
    with BoxElementsNonNullableType {
  def boxType = "List"
}

trait DslSetImpl
    extends DslTypeImplStub
    with BoxSetType
    with BoxNonNullableType
    with BoxElementsNonNullableType {
  def boxType = "Set"
}

trait DslOptArrImpl
    extends DslTypeImplStub
    with BoxArrayType
    with BoxNullableType
    with BoxElementsNonNullableType {
  def boxType = "OptArr"
}

trait DslOptListImpl
    extends DslTypeImplStub
    with BoxListType
    with BoxNullableType
    with BoxElementsNonNullableType {
  def boxType = "OptList"
}

trait DslOptSetImpl
    extends DslTypeImplStub
    with BoxSetType
    with BoxNullableType
    with BoxElementsNonNullableType {
  def boxType = "OptSet"
}

trait DslArrOptImpl
    extends DslTypeImplStub
    with BoxArrayType
    with BoxNonNullableType
    with BoxElementsNullableType {
  def boxType = "ArrOpt"
}

trait DslListOptImpl
    extends DslTypeImplStub
    with BoxListType
    with BoxNonNullableType
    with BoxElementsNullableType {
  def boxType = "ListOpt"
}

trait DslSetOptImpl
    extends DslTypeImplStub
    with BoxSetType
    with BoxNonNullableType
    with BoxElementsNullableType {
  def boxType = "SetOpt"
}

trait DslOptArrOptImpl
    extends DslTypeImplStub
    with BoxArrayType
    with BoxNullableType
    with BoxElementsNullableType {
  def boxType = "OptArrOpt"
}

trait DslOptListOptImpl
    extends DslTypeImplStub
    with BoxListType
    with BoxNullableType
    with BoxElementsNullableType {
  def boxType = "OptListOpt"
}

trait DslOptSetOptImpl
    extends DslTypeImplStub
    with BoxSetType
    with BoxNullableType
    with BoxElementsNullableType {
  def boxType = "OptSetOpt"
}
