package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait JavaIntStub
    extends JavaImpl
    with `tipe.Integer`
    with TipeUnconstrainedType
    with TipeScalarnessType
    with TipeStableType {

  def javaDesc = "Integer"
}

case object `java.Integer` extends JavaIntStub with JavaOne
    with TipeScalarType {
  def javaClass = "int"
  def defaultValue = "0"
}

case object `java.Integer?` extends JavaIntStub with JavaOpt
    with TipeReferenceType {
  def javaClass = "Integer"
  def defaultValue = "null"
}

case object `java.Integer[]` extends JavaIntStub with JavaArray
    with TipeReferenceType {
  def javaClass = "int[]"
  def defaultValue = "new int[0]"
}

case object `java.Integer?[]` extends JavaIntStub with JavaArrayOpt
    with TipeReferenceType {
  def javaClass = "Integer[]"
  def defaultValue = "new Integer[0]"
}

case object `java.Integer[]?` extends JavaIntStub with JavaOptArray
    with TipeReferenceType {
  def javaClass = "int[]"
  def defaultValue = "null"
}

case object `java.Integer?[]?` extends JavaIntStub with JavaOptArrayOpt
    with TipeReferenceType {
  def javaClass = "Integer[]"
  def defaultValue = "null"
}

case object `java.List<Integer>` extends JavaIntStub with JavaList
    with TipeReferenceType {
  def javaClass = "List<Integer>"
  def defaultValue = "new ArrayList<Integer>(0)"
}

case object `java.List<Integer?>` extends JavaIntStub with JavaListOpt
    with TipeReferenceType {
  def javaClass = "List<Integer>"
  def defaultValue = "new ArrayList<Integer>(0)"
}

case object `java.List<Integer>?` extends JavaIntStub with JavaOptList
    with TipeReferenceType {
  def javaClass = "List<Integer>"
  def defaultValue = "null"
}

case object `java.List<Integer?>?` extends JavaIntStub with JavaOptListOpt
    with TipeReferenceType {
  def javaClass = "List<Integer>"
  def defaultValue = "null"
}

case object `java.Set<Integer>` extends JavaIntStub with JavaSet
    with TipeReferenceType {
  def javaClass = "Set<Integer>"
  def defaultValue = "new HashSet<Integer>(0)"
}

case object `java.Set<Integer?>` extends JavaIntStub with JavaSetOpt
    with TipeReferenceType {
  def javaClass = "Set<Integer>"
  def defaultValue = "new HashSet<Integer>(0)"
}

case object `java.Set<Integer>?` extends JavaIntStub with JavaOptSet
    with TipeReferenceType {
  def javaClass = "Set<Integer>"
  def defaultValue = "null"
}

case object `java.Set<Integer?>?` extends JavaIntStub with JavaOptSetOpt
    with TipeReferenceType {
  def javaClass = "Set<Integer>"
  def defaultValue = "null"
}
