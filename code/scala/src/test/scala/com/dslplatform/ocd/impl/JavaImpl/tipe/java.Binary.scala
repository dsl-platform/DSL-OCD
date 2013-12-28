package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait JavaBinaryStub
    extends JavaImpl
    with `tipe.Binary`
    with TipeUnconstrainedType
    with TipeSpecialEqualsType
    with TipeStableType {

  def javaDesc = "byte[]"
}

case object `java.Binary` extends JavaBinaryStub with JavaOne {
  def javaClass = "boolean"
  def underlying = None
}

case object `java.Binary?` extends JavaBinaryStub with JavaOpt {
  def javaClass = "Binary"
  def underlying = None
}

case object `java.Binary[]` extends JavaBinaryStub with JavaArray {
  def javaClass = "boolean[]"
  def underlying = None
}

case object `java.Binary?[]` extends JavaBinaryStub with JavaArrayOpt {
  def javaClass = "Binary[]"
  def underlying = None
}

case object `java.Binary[]?` extends JavaBinaryStub with JavaOptArray {
  def javaClass = "boolean[]"
  def underlying = None
}

case object `java.Binary?[]?` extends JavaBinaryStub with JavaOptArrayOpt {
  def javaClass = "Binary[]"
  def underlying = None
}

case object `java.List<Binary>` extends JavaBinaryStub with JavaList {
  def javaClass = "List"
  def underlying = Some("Binary")
}

case object `java.List<Binary?>` extends JavaBinaryStub with JavaListOpt {
  def javaClass = "List"
  def underlying = Some("Binary")
}

case object `java.List<Binary>?` extends JavaBinaryStub with JavaOptList {
  def javaClass = "List"
  def underlying = Some("Binary")
}

case object `java.List<Binary?>?` extends JavaBinaryStub with JavaOptListOpt {
  def javaClass = "List"
  def underlying = Some("Binary")
}

case object `java.Set<Binary>` extends JavaBinaryStub with JavaSet {
  def javaClass = "Set"
  def underlying = Some("Binary")
}

case object `java.Set<Binary?>` extends JavaBinaryStub with JavaSetOpt {
  def javaClass = "Set"
  def underlying = Some("Binary")
}

case object `java.Set<Binary>?` extends JavaBinaryStub with JavaOptSet {
  def javaClass = "Set"
  def underlying = Some("Binary")
}

case object `java.Set<Binary?>?` extends JavaBinaryStub with JavaOptSetOpt {
  def javaClass = "Set"
  def underlying = Some("Binary")
}
