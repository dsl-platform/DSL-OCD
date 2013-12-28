package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait JavaUUIDStub
    extends JavaImpl
    with `tipe.Guid`
    with TipeUnconstrainedType
    with TipePrimitiveType
    with TipeStableType {

  def javaDesc = "UUID"
}

case object `java.UUID` extends JavaUUIDStub with JavaOne {
  def javaClass = "UUID"
  def underlying = None
}

case object `java.UUID?` extends JavaUUIDStub with JavaOpt {
  def javaClass = "UUID"
  def underlying = None
}

case object `java.UUID[]` extends JavaUUIDStub with JavaArray {
  def javaClass = "UUID[]"
  def underlying = None
}

case object `java.UUID?[]` extends JavaUUIDStub with JavaArrayOpt {
  def javaClass = "UUID[]"
  def underlying = None
}

case object `java.UUID[]?` extends JavaUUIDStub with JavaOptArray {
  def javaClass = "UUID[]"
  def underlying = None
}

case object `java.UUID?[]?` extends JavaUUIDStub with JavaOptArrayOpt {
  def javaClass = "UUID[]"
  def underlying = None
}

case object `java.List<UUID>` extends JavaUUIDStub with JavaList {
  def javaClass = "List"
  def underlying = Some("UUID")
}

case object `java.List<UUID?>` extends JavaUUIDStub with JavaListOpt {
  def javaClass = "List"
  def underlying = Some("UUID")
}

case object `java.List<UUID>?` extends JavaUUIDStub with JavaOptList {
  def javaClass = "List"
  def underlying = Some("UUID")
}

case object `java.List<UUID?>?` extends JavaUUIDStub with JavaOptListOpt {
  def javaClass = "List"
  def underlying = Some("UUID")
}

case object `java.Set<UUID>` extends JavaUUIDStub with JavaSet {
  def javaClass = "Set"
  def underlying = Some("UUID")
}

case object `java.Set<UUID?>` extends JavaUUIDStub with JavaSetOpt {
  def javaClass = "Set"
  def underlying = Some("UUID")
}

case object `java.Set<UUID>?` extends JavaUUIDStub with JavaOptSet {
  def javaClass = "Set"
  def underlying = Some("UUID")
}

case object `java.Set<UUID?>?` extends JavaUUIDStub with JavaOptSetOpt {
  def javaClass = "Set"
  def underlying = Some("UUID")
}
