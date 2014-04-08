package com.dslplatform.ocd
package javas

sealed trait JavaStability {
  def isStable = this == JavaStability.Stable
}

object JavaStability {
  case object Stable extends JavaStability
  case object Unstable extends JavaStability

  val values = IndexedSeq(Stable, Unstable)

  def getStable(stable: Boolean) =
    if (stable) Stable else Unstable
}
