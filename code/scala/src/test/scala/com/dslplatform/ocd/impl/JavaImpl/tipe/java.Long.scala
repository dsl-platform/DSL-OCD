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

  def javaDesc = "long"
}

case object `java.Long` extends JavaLongStub with JavaOne {
  def javaClass = "long"
  def underlying = None
}

case object `java.Long?` extends JavaLongStub with JavaOpt {
  def javaClass = "Long"
  def underlying = None
}

case object `java.Long[]` extends JavaLongStub with JavaArray {
  def javaClass = "long[]"
  def underlying = None
}

case object `java.Long?[]` extends JavaLongStub with JavaArrayOpt {
  def javaClass = "Long[]"
  def underlying = None
}

case object `java.Long[]?` extends JavaLongStub with JavaOptArray {
  def javaClass = "long[]"
  def underlying = None
}

case object `java.Long?[]?` extends JavaLongStub with JavaOptArrayOpt {
  def javaClass = "Long[]"
  def underlying = None
}

case object `java.List<Long>` extends JavaLongStub with JavaList {
  def javaClass = "List"
  def underlying = Some("Long")
}

case object `java.List<Long?>` extends JavaLongStub with JavaListOpt {
  def javaClass = "List"
  def underlying = Some("Long")
}

case object `java.List<Long>?` extends JavaLongStub with JavaOptList {
  def javaClass = "List"
  def underlying = Some("Long")
}

case object `java.List<Long?>?` extends JavaLongStub with JavaOptListOpt {
  def javaClass = "List"
  def underlying = Some("Long")
}

case object `java.Set<Long>` extends JavaLongStub with JavaSet {
  def javaClass = "Set"
  def underlying = Some("Long")
}

case object `java.Set<Long?>` extends JavaLongStub with JavaSetOpt {
  def javaClass = "Set"
  def underlying = Some("Long")
}

case object `java.Set<Long>?` extends JavaLongStub with JavaOptSet {
  def javaClass = "Set"
  def underlying = Some("Long")
}

case object `java.Set<Long?>?` extends JavaLongStub with JavaOptSetOpt {
  def javaClass = "Set"
  def underlying = Some("Long")
}
