package com.dslplatform.ocd
package javas

trait OcdJava
  extends types.OcdType
  with boxes.OcdBox {

  val javaClass: String
  val javaType: JavaType

  def defaultValue: JavaValue
  def nonDefaultValues: IndexedSeq[JavaValue]
  def borderValues = defaultValue +: nonDefaultValues

  val isPrecise: Boolean
  val isPrimitive: Boolean
  val hasGenerics: Boolean

  protected val Stable = JavaStability.Stable
  protected val Unstable = JavaStability.Unstable
}

object OcdJava
    extends OcdJavaValues
    with OcdJavaResolver
