package com.dslplatform.ocd
package generator
package javas
package javatypes

import types._
import boxes._

object JavaPoint
    extends JavaStub {

  val classReference = "java.awt.Point"

  val defaultSingle: TestValue = "new java.awt.Point()"

  val nonDefaultValues: Seq[TestValue] = Seq(
    "new java.awt.Point(Integer.MIN_VALUE, Integer.MIN_VALUE)"
  , "new java.awt.Point(Integer.MAX_VALUE, Integer.MAX_VALUE)"
  , "new java.awt.Point(0, -1000000000)"
  , "new java.awt.Point(0, 1000000000)"
  )
}
