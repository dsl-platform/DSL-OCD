package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait JavaStringStub
    extends JavaImpl
    with `tipe.String`
    with TipeUnconstrainedType
    with TipePrimitiveType
    with TipeStableType {

  def javaDesc = "String"
}

case object `java.String` extends JavaStringStub with JavaOne {
  def javaClass = "String"
  def underlying = None
}

case object `java.String?` extends JavaStringStub with JavaOpt {
  def javaClass = "String"
  def underlying = None
}

case object `java.String[]` extends JavaStringStub with JavaArray {
  def javaClass = "String[]"
  def underlying = None
}

case object `java.String?[]` extends JavaStringStub with JavaArrayOpt {
  def javaClass = "String[]"
  def underlying = None
}

case object `java.String[]?` extends JavaStringStub with JavaOptArray {
  def javaClass = "String[]"
  def underlying = None
}

case object `java.String?[]?` extends JavaStringStub with JavaOptArrayOpt {
  def javaClass = "String[]"
  def underlying = None
}

case object `java.List<String>` extends JavaStringStub with JavaList {
  def javaClass = "List"
  def underlying = Some("String")
}

case object `java.List<String?>` extends JavaStringStub with JavaListOpt {
  def javaClass = "List"
  def underlying = Some("String")
}

case object `java.List<String>?` extends JavaStringStub with JavaOptList {
  def javaClass = "List"
  def underlying = Some("String")
}

case object `java.List<String?>?` extends JavaStringStub with JavaOptListOpt {
  def javaClass = "List"
  def underlying = Some("String")
}

case object `java.Set<String>` extends JavaStringStub with JavaSet {
  def javaClass = "Set"
  def underlying = Some("String")
}

case object `java.Set<String?>` extends JavaStringStub with JavaSetOpt {
  def javaClass = "Set"
  def underlying = Some("String")
}

case object `java.Set<String>?` extends JavaStringStub with JavaOptSet {
  def javaClass = "Set"
  def underlying = Some("String")
}

case object `java.Set<String?>?` extends JavaStringStub with JavaOptSetOpt {
  def javaClass = "Set"
  def underlying = Some("String")
}
