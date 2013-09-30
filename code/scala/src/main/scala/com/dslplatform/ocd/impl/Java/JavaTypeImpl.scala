package com.dslplatform.ocd

trait JavaImplStub
    extends JavaImpl
    with TipeConstrainnessType
    with BoxOnenessType
    with BoxNullnessType
    with TipeStablenessType
    with TipeComplexityType {

  def javaType: String
  def defaultValue: String
}

trait JavaImplNullableStub
    extends JavaImplStub
    with BoxNullableType {
  def defaultValue = "null"
}

// ------------------------------------

trait JavaOneImpl
    extends JavaImplStub
    with BoxOneType
    with BoxNonNullableType

trait JavaOptImpl
    extends JavaImplNullableStub
    with BoxOneType

trait JavaArrImpl
    extends JavaImplStub
    with BoxArrayType
    with BoxNonNullableType
    with BoxElementsNonNullableType

trait JavaListImpl
    extends JavaImplStub
    with BoxListType
    with BoxNonNullableType
    with BoxElementsNonNullableType

trait JavaSetImpl
    extends JavaImplStub
    with BoxSetType
    with BoxNonNullableType
    with BoxElementsNonNullableType

trait JavaOptArrImpl
    extends JavaImplNullableStub
    with BoxArrayType
    with BoxElementsNonNullableType

trait JavaOptListImpl
    extends JavaImplNullableStub
    with BoxListType
    with BoxElementsNonNullableType

trait JavaOptSetImpl
    extends JavaImplNullableStub
    with BoxSetType
    with BoxElementsNonNullableType

trait JavaArrOptImpl
    extends JavaImplStub
    with BoxArrayType
    with BoxNonNullableType
    with BoxElementsNullableType

trait JavaListOptImpl
    extends JavaImplStub
    with BoxListType
    with BoxNonNullableType
    with BoxElementsNullableType

trait JavaSetOptImpl
    extends JavaImplStub
    with BoxSetType
    with BoxNonNullableType
    with BoxElementsNullableType

trait JavaOptArrOptImpl
    extends JavaImplNullableStub
    with BoxArrayType
    with BoxElementsNullableType

trait JavaOptListOptImpl
    extends JavaImplNullableStub
    with BoxListType
    with BoxElementsNullableType

trait JavaOptSetOptImpl
    extends JavaImplNullableStub
    with BoxSetType
    with BoxElementsNullableType
