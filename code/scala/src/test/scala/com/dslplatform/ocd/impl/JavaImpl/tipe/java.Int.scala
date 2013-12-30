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

  def javaDesc = "Integer"
}

case object `java.Integer` extends JavaIntStub with JavaOne {
  def javaClass = "int"
  def defaultValue = "0"
}

case object `java.Integer?` extends JavaIntStub with JavaOpt {
  def javaClass = "Integer"
  def defaultValue = "null"
}

case object `java.Integer[]` extends JavaIntStub with JavaArray {
  def javaClass = "int[]"
  def defaultValue = "new int[0]"
}

case object `java.Integer?[]` extends JavaIntStub with JavaArrayOpt {
  def javaClass = "Integer[]"
  def defaultValue = "new Integer[0]"
}

case object `java.Integer[]?` extends JavaIntStub with JavaOptArray {
  def javaClass = "int[]"
  def defaultValue = "null"
}

case object `java.Integer?[]?` extends JavaIntStub with JavaOptArrayOpt {
  def javaClass = "Integer[]"
  def defaultValue = "null"
}

case object `java.List<Integer>` extends JavaIntStub with JavaList {
  def javaClass = "List<Integer>"
  def defaultValue = "new ArrayList<Integer>(0)"
}

case object `java.List<Integer?>` extends JavaIntStub with JavaListOpt {
  def javaClass = "List<Integer>"
  def defaultValue = "new ArrayList<Integer>(0)"
}

case object `java.List<Integer>?` extends JavaIntStub with JavaOptList {
  def javaClass = "List<Integer>"
  def defaultValue = "null"
}

case object `java.List<Integer?>?` extends JavaIntStub with JavaOptListOpt {
  def javaClass = "List<Integer>"
  def defaultValue = "null"
}

case object `java.Set<Integer>` extends JavaIntStub with JavaSet {
  def javaClass = "Set<Integer>"
  def defaultValue = "new HashSet<Integer>(0)"
}

case object `java.Set<Integer?>` extends JavaIntStub with JavaSetOpt {
  def javaClass = "Set<Integer>"
  def defaultValue = "new HashSet<Integer>(0)"
}

case object `java.Set<Integer>?` extends JavaIntStub with JavaOptSet {
  def javaClass = "Set<Integer>"
  def defaultValue = "null"
}

case object `java.Set<Integer?>?` extends JavaIntStub with JavaOptSetOpt {
  def javaClass = "Set<Integer>"
  def defaultValue = "null"
}
