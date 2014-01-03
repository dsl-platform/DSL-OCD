package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait JavaBooleanStub
    extends JavaImpl
    with `tipe.Bool`
    with TipeUnconstrainedType
    with TipeScalarnessType
    with TipeStableType {

  def javaDesc = "Boolean"
}

case object `java.Boolean` extends JavaBooleanStub with JavaOne
    with TipeScalarType {
  def javaClass = "boolean"
  def defaultValue = "false"
}

case object `java.Boolean?` extends JavaBooleanStub with JavaOpt
    with TipeReferenceType {
  def javaClass = "Boolean"
  def defaultValue = "null"
}

case object `java.Boolean[]` extends JavaBooleanStub with JavaArray
    with TipeReferenceType {
  def javaClass = "boolean[]"
  def defaultValue = "new boolean[0]"
}

case object `java.Boolean?[]` extends JavaBooleanStub with JavaArrayOpt
    with TipeReferenceType {
  def javaClass = "Boolean[]"
  def defaultValue = "new Boolean[0]"
}

case object `java.Boolean[]?` extends JavaBooleanStub with JavaOptArray
    with TipeReferenceType {
  def javaClass = "boolean[]"
  def defaultValue = "null"
}

case object `java.Boolean?[]?` extends JavaBooleanStub with JavaOptArrayOpt
    with TipeReferenceType {
  def javaClass = "Boolean[]"
  def defaultValue = "null"
}

case object `java.List<Boolean>` extends JavaBooleanStub with JavaList
    with TipeReferenceType {
  def javaClass = "List<Boolean>"
  def defaultValue = "new ArrayList<Boolean>(0)"
}

case object `java.List<Boolean?>` extends JavaBooleanStub with JavaListOpt
    with TipeReferenceType {
  def javaClass = "List<Boolean>"
  def defaultValue = "new ArrayList<Boolean>(0)"
}

case object `java.List<Boolean>?` extends JavaBooleanStub with JavaOptList
    with TipeReferenceType {
  def javaClass = "List<Boolean>"
  def defaultValue = "null"
}

case object `java.List<Boolean?>?` extends JavaBooleanStub with JavaOptListOpt
    with TipeReferenceType {
  def javaClass = "List<Boolean>"
  def defaultValue = "null"
}

case object `java.Set<Boolean>` extends JavaBooleanStub with JavaSet
    with TipeReferenceType {
  def javaClass = "Set<Boolean>"
  def defaultValue = "new HashSet<Boolean>(0)"
}

case object `java.Set<Boolean?>` extends JavaBooleanStub with JavaSetOpt
    with TipeReferenceType {
  def javaClass = "Set<Boolean>"
  def defaultValue = "new HashSet<Boolean>(0)"
}

case object `java.Set<Boolean>?` extends JavaBooleanStub with JavaOptSet
    with TipeReferenceType {
  def javaClass = "Set<Boolean>"
  def defaultValue = "null"
}

case object `java.Set<Boolean?>?` extends JavaBooleanStub with JavaOptSetOpt
    with TipeReferenceType {
  def javaClass = "Set<Boolean>"
  def defaultValue = "null"
}
