package com.dslplatform.ocd
package types

import tipe._

trait `constraint.Length`
    extends OcdConstraint
    with TipeConstrainedType {
  def constraintDesc = "Length"
  def maxLength: Int
}

object `constraint.Length(0)`
    extends `constraint.Length` {
  def maxLength = 0
}

object `constraint.Length(1)`
    extends `constraint.Length` {
  def maxLength = 1
}

object `constraint.Length(256)`
    extends `constraint.Length` {
  def maxLength = 256
}
