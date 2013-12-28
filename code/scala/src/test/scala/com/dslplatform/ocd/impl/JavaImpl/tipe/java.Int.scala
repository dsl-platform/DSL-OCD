package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait JavaIntStub
    extends JavaImpl
    with `tipe.Integer`
    with TipeUnconstrainedType
    with TipePrimitiveType
    with TipeStableType {

  def javaDesc = "int"
}

case object `java.Integer` extends JavaIntStub with JavaOne {
  def javaClass = "int"
  def underlying = None
}

case object `java.Integer?` extends JavaIntStub with JavaOpt {
  def javaClass = "Integer"
  def underlying = None
}

case object `java.Integer[]` extends JavaIntStub with JavaArray {
  def javaClass = "int[]"
  def underlying = None
}

case object `java.Integer?[]` extends JavaIntStub with JavaArrayOpt {
  def javaClass = "Integer[]"
  def underlying = None
}

case object `java.Integer[]?` extends JavaIntStub with JavaOptArray {
  def javaClass = "int[]"
  def underlying = None
}

case object `java.Integer?[]?` extends JavaIntStub with JavaOptArrayOpt {
  def javaClass = "Integer[]"
  def underlying = None
}

case object `java.List<Integer>` extends JavaIntStub with JavaList {
  def javaClass = "List"
  def underlying = Some("Integer")
}

case object `java.List<Integer?>` extends JavaIntStub with JavaListOpt {
  def javaClass = "List"
  def underlying = Some("Integer")
}

case object `java.List<Integer>?` extends JavaIntStub with JavaOptList {
  def javaClass = "List"
  def underlying = Some("Integer")
}

case object `java.List<Integer?>?` extends JavaIntStub with JavaOptListOpt {
  def javaClass = "List"
  def underlying = Some("Integer")
}

case object `java.Set<Integer>` extends JavaIntStub with JavaSet {
  def javaClass = "Set"
  def underlying = Some("Integer")
}

case object `java.Set<Integer?>` extends JavaIntStub with JavaSetOpt {
  def javaClass = "Set"
  def underlying = Some("Integer")
}

case object `java.Set<Integer>?` extends JavaIntStub with JavaOptSet {
  def javaClass = "Set"
  def underlying = Some("Integer")
}

case object `java.Set<Integer?>?` extends JavaIntStub with JavaOptSetOpt {
  def javaClass = "Set"
  def underlying = Some("Integer")
}
