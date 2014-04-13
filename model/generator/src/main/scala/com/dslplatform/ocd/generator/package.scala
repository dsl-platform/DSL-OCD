package com.dslplatform.ocd

package object generator {
  val Pi = "3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679"

  val Stable = Stability.Stable
  val Unstable = Stability.Unstable
}

package generator {
   sealed trait Stability {
     def isStable = this == Stability.Stable
   }

   object Stability {
     case object Stable extends Stability
     case object Unstable extends Stability

     val values = IndexedSeq(Stable, Unstable)

     def getStable(stable: Boolean) =
       if (stable) Stable else Unstable
   }

   trait TestValue {
     def stability: Stability
   }

   trait TestValueContainer extends TestValue {
     def values: Seq[TestValue]

     def stability = Stability.getStable(
         values.forall(_.stability.isStable))
   }

   trait TestEntryContainer extends TestValue {
     def values: Map[TestValue, TestValue]

     def stability = Stability.getStable(
         values.forall{ case (k, v) => k.stability.isStable && v.stability.isStable })
   }
}
