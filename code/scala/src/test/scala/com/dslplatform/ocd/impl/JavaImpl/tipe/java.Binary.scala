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

  def javaDesc = "Binary"
}

case object `java.Binary` extends JavaBinaryStub with JavaOne {
  def javaClass = "byte[]"
  def defaultValue = "new byte[0]"
}

case object `java.Binary?` extends JavaBinaryStub with JavaOpt {
  def javaClass = "byte[]"
  def defaultValue = "null"
}

case object `java.Binary[]` extends JavaBinaryStub with JavaArray {
  def javaClass = "byte[][]"
  def defaultValue = "new byte[0][]"
}

case object `java.Binary?[]` extends JavaBinaryStub with JavaArrayOpt {
  def javaClass = "byte[][]"
  def defaultValue = "new byte[0][]"
}

case object `java.Binary[]?` extends JavaBinaryStub with JavaOptArray {
  def javaClass = "byte[][]"
  def defaultValue = "null"
}

case object `java.Binary?[]?` extends JavaBinaryStub with JavaOptArrayOpt {
  def javaClass = "byte[][]"
  def defaultValue = "null"
}

case object `java.List<Binary>` extends JavaBinaryStub with JavaList {
  def javaClass = "List<byte[]>"
  def defaultValue = "new ArrayList<byte[]>()"
}

case object `java.List<Binary?>` extends JavaBinaryStub with JavaListOpt {
  def javaClass = "List<byte[]>"
  def defaultValue = "new ArrayList<byte[]>()"
}

case object `java.List<Binary>?` extends JavaBinaryStub with JavaOptList {
  def javaClass = "List<byte[]>"
  def defaultValue = "null"
}

case object `java.List<Binary?>?` extends JavaBinaryStub with JavaOptListOpt {
  def javaClass = "List<byte[]>"
  def defaultValue = "null"
}

case object `java.Set<Binary>` extends JavaBinaryStub with JavaSet {
  def javaClass = "Set<byte[]>"
  def defaultValue = "new HashSet<byte[]>()"
}

case object `java.Set<Binary?>` extends JavaBinaryStub with JavaSetOpt {
  def javaClass = "Set<byte[]>"
  def defaultValue = "new HashSet<byte[]>()"
}

case object `java.Set<Binary>?` extends JavaBinaryStub with JavaOptSet {
  def javaClass = "Set<byte[]>"
  def defaultValue = "null"
}

case object `java.Set<Binary?>?` extends JavaBinaryStub with JavaOptSetOpt {
  def javaClass = "Set<byte[]>"
  def defaultValue = "null"
}
