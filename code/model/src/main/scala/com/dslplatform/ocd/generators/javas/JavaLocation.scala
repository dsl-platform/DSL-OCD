package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaLocation
    extends JavaStub {

  val classReference = "java.awt.geom.Point2D"

  val defaultSingle = "new java.awt.geom.Point2D.Float()"

  val nonDefaultValues = Seq(
      /* Integer */
      "new java.awt.Point(Integer.MIN_VALUE, 1000000000)"
    , "new java.awt.Point(Integer.MAX_VALUE, 1000000000)"
    , "new java.awt.Point(1000000000, Integer.MIN_VALUE)"
    , "new java.awt.Point(0, Integer.MAX_VALUE)"
    , "new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)"
    , "new java.awt.Point(0, Integer.MAX_VALUE)"
    , "new java.awt.Point(Integer.MAX_VALUE, 0)"
      /* Float */
    , "new java.awt.Point.Float(Float.MIN_VALUE, Float.MAX_VALUE)"
    , "new java.awt.Point.Float(0.0f, 1000.10f)"
    , "new java.awt.Point.Float(0.1f, 0.2f)"
      /* Double */
    , "new java.awt.Point.Double(Double.MIN_VALUE, Double.MAX_VALUE)"
    , "new java.awt.Point.Double(0.0, 1000.1)"
    , "new java.awt.Point.Double(0.01, 0.02)"
  )
}
