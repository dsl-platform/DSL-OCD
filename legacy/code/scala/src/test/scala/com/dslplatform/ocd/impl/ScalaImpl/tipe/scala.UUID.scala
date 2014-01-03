package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait ScalaUUIDStub
    extends ScalaImpl
    with `tipe.Guid`
    with TipeUnconstrainedType
    with TipeEqualsComparableType
    with TipeUnstableType {

  def scalaDesc = "UUID"
}

case object `scala.UUID` extends ScalaUUIDStub with ScalaOne {
  def scalaClass = "java.util.UUID"
  def defaultValue = "java.util.UUID.randomUUID"
}

case object `scala.UUID?` extends ScalaUUIDStub with ScalaOpt {
  def scalaClass = "Option[java.util.UUID]"
  def defaultValue = "None"
}

case object `scala.UUID[]` extends ScalaUUIDStub with ScalaArray {
  def scalaClass = "Array[java.util.UUID]"
  def defaultValue = "Array.empty[java.util.UUID]"
}

case object `scala.UUID?[]` extends ScalaUUIDStub with ScalaArrayOpt {
  def scalaClass = "Array[Option[java.util.UUID]]"
  def defaultValue = "Array.empty[Option[java.util.UUID]]"
}

case object `scala.UUID[]?` extends ScalaUUIDStub with ScalaOptArray {
  def scalaClass = "Option[Array[java.util.UUID]]"
  def defaultValue = "None"
}

case object `scala.UUID?[]?` extends ScalaUUIDStub with ScalaOptArrayOpt {
  def scalaClass = "Option[Array[Option[java.util.UUID]]]"
  def defaultValue = "None"
}

case object `scala.List<UUID>` extends ScalaUUIDStub with ScalaList {
  def scalaClass = "IndexedSeq[java.util.UUID]"
  def defaultValue = "IndexedSeq.empty[java.util.UUID]"
}

case object `scala.List<UUID?>` extends ScalaUUIDStub with ScalaListOpt {
  def scalaClass = "IndexedSeq[Option[java.util.UUID]]"
  def defaultValue = "IndexedSeq.empty[Option[java.util.UUID]]"
}

case object `scala.List<UUID>?` extends ScalaUUIDStub with ScalaOptList {
  def scalaClass = "Option[IndexedSeq[java.util.UUID]]"
  def defaultValue = "None"
}

case object `scala.List<UUID?>?` extends ScalaUUIDStub with ScalaOptListOpt {
  def scalaClass = "Option[IndexedSeq[Option[java.util.UUID]]]"
  def defaultValue = "None"
}

case object `scala.Set<UUID>` extends ScalaUUIDStub with ScalaSet {
  def scalaClass = "Set[java.util.UUID]"
  def defaultValue = "Set.empty[java.util.UUID]"
}

case object `scala.Set<UUID?>` extends ScalaUUIDStub with ScalaSetOpt {
  def scalaClass = "Set[Option[java.util.UUID]]"
  def defaultValue = "Set.empty[Option[java.util.UUID]]"
}

case object `scala.Set<UUID>?` extends ScalaUUIDStub with ScalaOptSet {
  def scalaClass = "Option[Set[java.util.UUID]]"
  def defaultValue = "None"
}

case object `scala.Set<UUID?>?` extends ScalaUUIDStub with ScalaOptSetOpt {
  def scalaClass = "Option[Set[Option[java.util.UUID]]]"
  def defaultValue = "None"
}
