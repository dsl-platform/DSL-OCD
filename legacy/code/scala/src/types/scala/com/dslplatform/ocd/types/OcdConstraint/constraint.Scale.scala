package com.dslplatform.ocd
package types

import tipe._

trait `constraint.Scale`
    extends OcdConstraint
    with TipeConstrainedType {
  def constraintDesc = "Scale"
  def scale: Int
}

object `constraint.Scale(0)`
    extends `constraint.Scale` {
  def scale = 0
}

object `constraint.Scale(1)`
    extends `constraint.Scale` {
  def scale = 1
}

object `constraint.Scale(256)`
    extends `constraint.Scale` {
  def scale = 256
}
