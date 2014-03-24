package com.dslplatform.ocd
package test
package javatest
package property

import java.lang.reflect.{ Modifier => JMod }

sealed abstract class ModifierStub {
  def name = toString.toLowerCase
  def javaFieldPrefix = name + " "
  def javaModifier = "java.lang.reflect.Modifier." + toString.toUpperCase
}

sealed abstract class Modifier extends ModifierStub

object Modifier {
  case object Static extends Modifier
  case object Final extends Modifier
  case object Volatile extends Modifier
  case object Transient extends Modifier

  val values = IndexedSeq(
    Static: Modifier
  , Final
  , Volatile
  , Transient
  )

  val fieldCombinations = values.toSet.subsets.filter { mods =>
    !(mods.contains(Final) && mods.contains(Volatile))
  }.map(_.toSet).toIndexedSeq

  val methodCombinations = values.toSet.subsets.filter { mods =>
    !mods.contains(Transient) && !mods.contains(Volatile)
  }.map(_.toSet).toIndexedSeq
}

sealed abstract class Visibility extends ModifierStub

object Visibility {
  case object PackagePrivate extends Visibility {
    override def name = "package private"
    override def javaFieldPrefix = ""
    override def javaModifier = "0"
  }
  case object Public extends Visibility
  case object Private extends Visibility
  case object Protected extends Visibility

  val values = IndexedSeq(
    PackagePrivate: Visibility
  , Public
  , Private
  , Protected
  )
}
