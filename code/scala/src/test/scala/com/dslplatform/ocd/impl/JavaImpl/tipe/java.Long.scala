package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait JavaLongStub
    extends JavaImpl
    with `tipe.Long`
    with TipeUnconstrainedType
    with TipeScalarnessType
    with TipeStableType {

  def javaDesc = "Long"
}

case object `java.Long` extends JavaLongStub with JavaOne
    with TipeScalarType {
  def javaClass = "long"
  def defaultValue = "0L"
}

case object `java.Long?` extends JavaLongStub with JavaOpt
    with TipeReferenceType {
  def javaClass = "Long"
  def defaultValue = "null"
}

case object `java.Long[]` extends JavaLongStub with JavaArray
    with TipeReferenceType {
  def javaClass = "long[]"
  def defaultValue = "new long[0]"
}

case object `java.Long?[]` extends JavaLongStub with JavaArrayOpt
    with TipeReferenceType {
  def javaClass = "Long[]"
  def defaultValue = "new Long[0]"
}

case object `java.Long[]?` extends JavaLongStub with JavaOptArray
    with TipeReferenceType {
  def javaClass = "long[]"
  def defaultValue = "null"
}

case object `java.Long?[]?` extends JavaLongStub with JavaOptArrayOpt
    with TipeReferenceType {
  def javaClass = "Long[]"
  def defaultValue = "null"
}

case object `java.List<Long>` extends JavaLongStub with JavaList
    with TipeReferenceType {
  def javaClass = "List<Long>"
  def defaultValue = "new ArrayList<Long>(0)"
}

case object `java.List<Long?>` extends JavaLongStub with JavaListOpt
    with TipeReferenceType {
  def javaClass = "List<Long>"
  def defaultValue = "new ArrayList<Long>(0)"
}

case object `java.List<Long>?` extends JavaLongStub with JavaOptList
    with TipeReferenceType {
  def javaClass = "List<Long>"
  def defaultValue = "null"
}

case object `java.List<Long?>?` extends JavaLongStub with JavaOptListOpt
    with TipeReferenceType {
  def javaClass = "List<Long>"
  def defaultValue = "null"
}

case object `java.Set<Long>` extends JavaLongStub with JavaSet
    with TipeReferenceType {
  def javaClass = "Set<Long>"
  def defaultValue = "new HashSet<Long>(0)"
}

case object `java.Set<Long?>` extends JavaLongStub with JavaSetOpt
    with TipeReferenceType {
  def javaClass = "Set<Long>"
  def defaultValue = "new HashSet<Long>(0)"
}

case object `java.Set<Long>?` extends JavaLongStub with JavaOptSet
    with TipeReferenceType {
  def javaClass = "Set<Long>"
  def defaultValue = "null"
}

case object `java.Set<Long?>?` extends JavaLongStub with JavaOptSetOpt
    with TipeReferenceType {
  def javaClass = "Set<Long>"
  def defaultValue = "null"
}
