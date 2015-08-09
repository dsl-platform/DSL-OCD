package com.dslplatform.ocd
package javas

import kinds._
import types._
import boxes._

trait OcdJavaBoxKind
    extends OcdKind
    with OcdBox

trait OcdJavaBoxType
    extends OcdJavaBoxKind
    with types.OcdType {

  val javaClass: String
  val javaType: JavaType
  val javaDescription: String

  def defaultValue: JavaValue
  def nonDefaultValues: IndexedSeq[JavaValue]
  def borderValues = defaultValue +: nonDefaultValues

  val isPrecise: Boolean
  val isPrimitive: Boolean
  val hasGenerics: Boolean
  val isEqualable: Boolean

  protected val Stable = JavaStability.Stable
  protected val Unstable = JavaStability.Unstable
}

object OcdJavaBoxType
    extends OcdJavaBoxTypeValues
    with OcdJavaBoxTypeResolver
