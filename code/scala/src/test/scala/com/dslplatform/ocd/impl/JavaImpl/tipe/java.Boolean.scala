package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait JavaBooleanStub
    extends JavaImpl
    with `tipe.Bool`
    with TipeUnconstrainedType
    with TipePrimitiveType
    with TipeStableType {

  def javaDesc = "Boolean"
}

case object `java.Boolean` extends JavaBooleanStub with JavaOne {
  def javaClass = "boolean"
  def defaultValue = "false"
}

case object `java.Boolean?` extends JavaBooleanStub with JavaOpt {
  def javaClass = "Boolean"
  def defaultValue = "null"
}

case object `java.Boolean[]` extends JavaBooleanStub with JavaArray {
  def javaClass = "boolean[]"
  def defaultValue = "new boolean[0]"
}

case object `java.Boolean?[]` extends JavaBooleanStub with JavaArrayOpt {
  def javaClass = "Boolean[]"
  def defaultValue = "new Boolean[0]"
}

case object `java.Boolean[]?` extends JavaBooleanStub with JavaOptArray {
  def javaClass = "boolean[]"
  def defaultValue = "null"
}

case object `java.Boolean?[]?` extends JavaBooleanStub with JavaOptArrayOpt {
  def javaClass = "Boolean[]"
  def defaultValue = "null"
}

case object `java.List<Boolean>` extends JavaBooleanStub with JavaList {
  def javaClass = "List<Boolean>"
  def defaultValue = "new ArrayList<Boolean>(0)"
}

case object `java.List<Boolean?>` extends JavaBooleanStub with JavaListOpt {
  def javaClass = "List<Boolean>"
  def defaultValue = "new ArrayList<Boolean>(0)"
}

case object `java.List<Boolean>?` extends JavaBooleanStub with JavaOptList {
  def javaClass = "List<Boolean>"
  def defaultValue = "null"
}

case object `java.List<Boolean?>?` extends JavaBooleanStub with JavaOptListOpt {
  def javaClass = "List<Boolean>"
  def defaultValue = "null"
}

case object `java.Set<Boolean>` extends JavaBooleanStub with JavaSet {
  def javaClass = "Set<Boolean>"
  def defaultValue = "new HashSet<Boolean>(0)"
}

case object `java.Set<Boolean?>` extends JavaBooleanStub with JavaSetOpt {
  def javaClass = "Set<Boolean>"
  def defaultValue = "new HashSet<Boolean>(0)"
}

case object `java.Set<Boolean>?` extends JavaBooleanStub with JavaOptSet {
  def javaClass = "Set<Boolean>"
  def defaultValue = "null"
}

case object `java.Set<Boolean?>?` extends JavaBooleanStub with JavaOptSetOpt {
  def javaClass = "Set<Boolean>"
  def defaultValue = "null"
}
