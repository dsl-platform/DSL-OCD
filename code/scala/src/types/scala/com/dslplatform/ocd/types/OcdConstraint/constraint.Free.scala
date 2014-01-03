package com.dslplatform.ocd
package types

import tipe._

trait `constraint.Free`
    extends OcdConstraint
    with TipeUnconstrainedType {
  def constraintDesc = "Free"
}

object `constraint.Free` extends `constraint.Free`
