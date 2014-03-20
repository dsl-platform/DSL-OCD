package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaPoint
    extends JavaStub {

  val classReference = "java.awt.Point"

  val defaultSingle = "new java.awt.Point()"

  val nonDefaultValues = Seq(
      "new java.awt.Point(Integer.MIN_VALUE, Integer.MIN_VALUE)"
    , "new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)"
    , "new java.awt.Point(Integer.MAX_VALUE, Integer.MIN_VALUE)"
    , "new java.awt.Point(Integer.MAX_VALUE, Integer.MAX_VALUE)"
    , "new java.awt.Point(Integer.MIN_VALUE, 1000000000)"
    , "new java.awt.Point(Integer.MAX_VALUE, 1000000000)"
    , "new java.awt.Point(1000000000, Integer.MIN_VALUE)"
    , "new java.awt.Point(0, 1000000000)"
    , "new java.awt.Point(Integer.MAX_VALUE, 0)"
  )

}
