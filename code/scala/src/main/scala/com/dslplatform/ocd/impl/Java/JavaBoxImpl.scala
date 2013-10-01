package com.dslplatform.ocd

trait JavaBoxImplStub
    extends JavaImpl
    with BoxOnenessType
    with BoxNullnessType {

  def javaClass: String
  def defaultValue: String
}

trait JavaBoxImplNullableStub
    extends JavaBoxImplStub
    with BoxNullableType {
  def defaultValue = "null"
}

// -----------------------------------------------------------------------------

trait JavaBoxImplCollectionStub
    extends JavaBoxImplStub
    with BoxCollectionType {
  def underlyingClass: String
  def collectionClass: String
  def constructor: String
}

trait JavaBoxImplArrayStub
    extends JavaBoxImplCollectionStub
    with BoxArrayType {
  def javaClass = underlyingClass + "[]"
  def collectionClass = underlyingClass + "[]"
  def constructor = "new " + underlyingClass + "[0]"
}

trait JavaBoxImplListStub
    extends JavaBoxImplCollectionStub
    with BoxListType {
  def javaClass = "java.util.List<" + underlyingClass + ">"
  def collectionClass = "java.util.ArrayList"
  def constructor = "new " + collectionClass + "<" + underlyingClass + ">()"
}

trait JavaBoxImplSetStub
    extends JavaBoxImplCollectionStub
    with BoxListType {
  def javaClass = "java.util.Set<" + underlyingClass + ">"
  def collectionClass = "java.util.HashSet"
  def constructor = "new " + collectionClass + "<" + underlyingClass + ">()"
}

// -----------------------------------------------------------------------------

trait JavaBoxOneImpl
    extends JavaBoxImplStub
    with BoxOneType
    with BoxNonNullableType

trait JavaBoxOptImpl
    extends JavaBoxImplNullableStub
    with BoxOneType

trait JavaBoxArrImpl
    extends JavaBoxImplArrayStub
    with BoxNonNullableType
    with BoxElementsNonNullableType {
  def defaultValue = constructor
}

trait JavaBoxListImpl
    extends JavaBoxImplListStub
    with BoxNonNullableType
    with BoxElementsNonNullableType {
  def defaultValue = constructor
}

trait JavaBoxSetImpl
    extends JavaBoxImplSetStub
    with BoxNonNullableType
    with BoxElementsNonNullableType {
  def defaultValue = constructor
}

trait JavaBoxOptArrImpl
    extends JavaBoxImplNullableStub
    with JavaBoxImplArrayStub
    with BoxElementsNonNullableType

trait JavaBoxOptListImpl
    extends JavaBoxImplNullableStub
    with JavaBoxImplListStub
    with BoxElementsNonNullableType

trait JavaBoxOptSetImpl
    extends JavaBoxImplNullableStub
    with JavaBoxImplSetStub
    with BoxElementsNonNullableType

trait JavaBoxArrOptImpl
    extends JavaBoxImplArrayStub
    with BoxNonNullableType
    with BoxElementsNullableType {
  def defaultValue = constructor
}

trait JavaBoxListOptImpl
    extends JavaBoxImplListStub
    with BoxNonNullableType
    with BoxElementsNullableType {
  def defaultValue = constructor
}

trait JavaBoxSetOptImpl
    extends JavaBoxImplSetStub
    with BoxNonNullableType
    with BoxElementsNullableType {
  def defaultValue = constructor
}

trait JavaBoxOptArrOptImpl
    extends JavaBoxImplNullableStub
    with JavaBoxImplArrayStub
    with BoxElementsNullableType

trait JavaBoxOptListOptImpl
    extends JavaBoxImplNullableStub
    with JavaBoxImplListStub
    with BoxElementsNullableType

trait JavaBoxOptSetOptImpl
    extends JavaBoxImplNullableStub
    with JavaBoxImplSetStub
    with BoxElementsNullableType
