package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait JavaUUIDStub
    extends JavaImpl
    with `tipe.Guid`
    with TipeUnconstrainedType
    with TipeEqualsComparableType
    with TipeUnstableType {

  def javaDesc = "UUID"
}

case object `java.UUID` extends JavaUUIDStub with JavaOne {
  def javaClass = "java.util.UUID"
  def defaultValue = "java.util.UUID.randomUUID()"
}

case object `java.UUID?` extends JavaUUIDStub with JavaOpt {
  def javaClass = "java.util.UUID"
  def defaultValue = "null"
}

case object `java.UUID[]` extends JavaUUIDStub with JavaArray {
  def javaClass = "java.util.UUID[]"
  def defaultValue = "new java.util.UUID[0]"
}

case object `java.UUID?[]` extends JavaUUIDStub with JavaArrayOpt {
  def javaClass = "java.util.UUID[]"
  def defaultValue = "new java.util.UUID[0]"
}

case object `java.UUID[]?` extends JavaUUIDStub with JavaOptArray {
  def javaClass = "java.util.UUID[]"
  def defaultValue = "null"
}

case object `java.UUID?[]?` extends JavaUUIDStub with JavaOptArrayOpt {
  def javaClass = "java.util.UUID[]"
  def defaultValue = "null"
}

case object `java.List<UUID>` extends JavaUUIDStub with JavaList {
  def javaClass = "List<java.util.UUID>"
  def defaultValue = "new ArrayList<java.util.UUID>(0)"
}

case object `java.List<UUID?>` extends JavaUUIDStub with JavaListOpt {
  def javaClass = "List<java.util.UUID>"
  def defaultValue = "new ArrayList<java.util.UUID>(0)"
}

case object `java.List<UUID>?` extends JavaUUIDStub with JavaOptList {
  def javaClass = "List<java.util.UUID>"
  def defaultValue = "null"
}

case object `java.List<UUID?>?` extends JavaUUIDStub with JavaOptListOpt {
  def javaClass = "List<java.util.UUID>"
  def defaultValue = "null"
}

case object `java.Set<UUID>` extends JavaUUIDStub with JavaSet {
  def javaClass = "Set<java.util.UUID>"
  def defaultValue = "new HashSet<java.util.UUID>(0)"
}

case object `java.Set<UUID?>` extends JavaUUIDStub with JavaSetOpt {
  def javaClass = "Set<java.util.UUID>"
  def defaultValue = "new HashSet<java.util.UUID>(0)"
}

case object `java.Set<UUID>?` extends JavaUUIDStub with JavaOptSet {
  def javaClass = "Set<java.util.UUID>"
  def defaultValue = "null"
}

case object `java.Set<UUID?>?` extends JavaUUIDStub with JavaOptSetOpt {
  def javaClass = "Set<java.util.UUID>"
  def defaultValue = "null"
}
