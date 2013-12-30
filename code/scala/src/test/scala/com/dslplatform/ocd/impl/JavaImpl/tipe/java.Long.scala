package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait JavaLongStub
    extends JavaImpl
    with `tipe.Long`
    with TipeUnconstrainedType
    with TipePrimitiveType
    with TipeStableType {

  def javaDesc = "Long"
}

case object `java.Long` extends JavaLongStub with JavaOne {
  def javaClass = "long"
  def defaultValue = "0L"
}

case object `java.Long?` extends JavaLongStub with JavaOpt {
  def javaClass = "Long"
  def defaultValue = "null"
}

case object `java.Long[]` extends JavaLongStub with JavaArray {
  def javaClass = "long[]"
  def defaultValue = "new long[0]"
}

case object `java.Long?[]` extends JavaLongStub with JavaArrayOpt {
  def javaClass = "Long[]"
  def defaultValue = "new Long[0]"
}

case object `java.Long[]?` extends JavaLongStub with JavaOptArray {
  def javaClass = "long[]"
  def defaultValue = "null"
}

case object `java.Long?[]?` extends JavaLongStub with JavaOptArrayOpt {
  def javaClass = "Long[]"
  def defaultValue = "null"
}

case object `java.List<Long>` extends JavaLongStub with JavaList {
  def javaClass = "List<Long>"
  def defaultValue = "new ArrayList<Long>(0)"
}

case object `java.List<Long?>` extends JavaLongStub with JavaListOpt {
  def javaClass = "List<Long>"
  def defaultValue = "new ArrayList<Long>(0)"
}

case object `java.List<Long>?` extends JavaLongStub with JavaOptList {
  def javaClass = "List<Long>"
  def defaultValue = "null"
}

case object `java.List<Long?>?` extends JavaLongStub with JavaOptListOpt {
  def javaClass = "List<Long>"
  def defaultValue = "null"
}

case object `java.Set<Long>` extends JavaLongStub with JavaSet {
  def javaClass = "Set<Long>"
  def defaultValue = "new HashSet<Long>(0)"
}

case object `java.Set<Long?>` extends JavaLongStub with JavaSetOpt {
  def javaClass = "Set<Long>"
  def defaultValue = "new HashSet<Long>(0)"
}

case object `java.Set<Long>?` extends JavaLongStub with JavaOptSet {
  def javaClass = "Set<Long>"
  def defaultValue = "null"
}

case object `java.Set<Long?>?` extends JavaLongStub with JavaOptSetOpt {
  def javaClass = "Set<Long>"
  def defaultValue = "null"
}
