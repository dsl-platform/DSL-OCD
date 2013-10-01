package com.dslplatform.ocd

sealed trait JavaBoolStub
    extends JavaImplStub
    with TipeBoolType
    with TipeUnconstrainedType
    with TipeStableType

case object `java.Bool`
    extends JavaBoolStub
    with JavaOneImpl
    with TipeScalarType {
  def javaClass = "boolean"
  def defaultValue = "false"
}

case object `java.Bool?`
    extends JavaBoolStub
    with JavaOptImpl
    with TipeReferenceType {
  def javaClass = "Boolean"
}

case object `java.Bool[]`
    extends JavaBoolStub
    with JavaArrImpl
    with TipeSpecialEqualsType {
  def underlyingClass = "boolean"
}

case object `java.List<Bool>`
    extends JavaBoolStub
    with JavaListImpl
    with TipeEqualsComparableType {
  def underlyingClass = "Boolean"
}

case object `java.Set<Bool>`
    extends JavaBoolStub
    with JavaSetImpl
    with TipeEqualsComparableType {
  def underlyingClass = "Boolean"
}

case object `java.Bool[]?`
    extends JavaBoolStub
    with JavaOptArrImpl
    with TipeSpecialEqualsType {
  def underlyingClass = "Boolean"
}

case object `java.List<Bool>?`
    extends JavaBoolStub
    with JavaOptListImpl
    with TipeEqualsComparableType {
  def underlyingClass = "Boolean"
}

case object `java.Set<Bool>?`
    extends JavaBoolStub
    with JavaOptSetImpl
    with TipeEqualsComparableType {
  def underlyingClass = "Boolean"
}

case object `java.Bool?[]`
    extends JavaBoolStub
    with JavaArrOptImpl
    with TipeSpecialEqualsType {
  def underlyingClass = "Boolean"
}

case object `java.List<Bool?>`
    extends JavaBoolStub
    with JavaListOptImpl
    with TipeEqualsComparableType {
  def underlyingClass = "Boolean"
}

case object `java.Set<Bool?>`
    extends JavaBoolStub
    with JavaSetOptImpl
    with TipeEqualsComparableType {
  def underlyingClass = "Boolean"
}

case object `java.Bool?[]?`
    extends JavaBoolStub
    with JavaOptArrOptImpl
    with TipeSpecialEqualsType {
  def underlyingClass = "Boolean"
}

case object `java.List<Bool?>?`
    extends JavaBoolStub
    with JavaOptListOptImpl
    with TipeEqualsComparableType {
  def underlyingClass = "Boolean"
}

case object `java.Set<Bool?>?`
    extends JavaBoolStub
    with JavaOptSetOptImpl
    with TipeEqualsComparableType {
  def underlyingClass = "Boolean"
}
