package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait JavaBooleanStub
    extends JavaImpl
    with `tipe.Bool`
    with TipeUnconstrainedType
    with TipeStableType
    with JavaPrimitiveType {

  def javaDesc = "boolean"
  def underlying: Option[String]
}

case object `java.Boolean` extends JavaBooleanStub with JavaOne {
  def javaClass = "boolean"
  def underlying = None
}

case object `java.Boolean?` extends JavaBooleanStub with JavaOpt {
  def javaClass = "Boolean"
  def underlying = None
}

case object `java.Boolean[]` extends JavaBooleanStub with JavaArray {
  def javaClass = "boolean[]"
  def underlying = Some("boolean")
}

case object `java.Boolean?[]` extends JavaBooleanStub with JavaArrayOpt {
  def javaClass = "Boolean[]"
  def underlying = Some("Boolean")
}

case object `java.Boolean[]?` extends JavaBooleanStub with JavaOptArray {
  def javaClass = "boolean[]"
  def underlying = Some("boolean")
}

case object `java.Boolean?[]?` extends JavaBooleanStub with JavaOptArrayOpt {
  def javaClass = "Boolean[]"
  def underlying = Some("Boolean")
}

case object `java.List` extends JavaBooleanStub with JavaList {
  def javaClass = "List"
  def underlying = Some("Boolean")
}

case object `java.List<Boolean?>` extends JavaBooleanStub with JavaListOpt {
  def javaClass = "List"
  def underlying = Some("Boolean")
}

case object `java.List?` extends JavaBooleanStub with JavaOptList {
  def javaClass = "List"
  def underlying = Some("Boolean")
}

case object `java.List<Boolean?>?` extends JavaBooleanStub with JavaOptListOpt {
  def javaClass = "List"
  def underlying = Some("Boolean")
}

case object `java.Set` extends JavaBooleanStub with JavaSet {
  def javaClass = "Set"
  def underlying = Some("Boolean")
}

case object `java.Set<Boolean?>` extends JavaBooleanStub with JavaSetOpt {
  def javaClass = "Set"
  def underlying = Some("Boolean")
}

case object `java.Set?` extends JavaBooleanStub with JavaOptSet {
  def javaClass = "Set"
  def underlying = Some("Boolean")
}

case object `java.Set<Boolean?>?` extends JavaBooleanStub with JavaOptSetOpt {
  def javaClass = "Set"
  def underlying = Some("Boolean")
}
