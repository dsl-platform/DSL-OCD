package com.dslplatform.ocd
package generator
package javas
package javatypes

import types._
import boxes._

object JavaLocation
    extends JavaStub {

  val classReference = "java.awt.geom.Point2D"

  val defaultSingle: TestValue = "new java.awt.geom.Point2D.Float()"

  val nonDefaultValues: Seq[TestValue] = Seq(
    /* Integer */
    "new java.awt.Point(Integer.MIN_VALUE, Integer.MAX_VALUE)"
  , "new java.awt.Point(-1000000000, 1000000000)"
    /* Float */
  , "new java.awt.geom.Point2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)"
  , "new java.awt.geom.Point2D.Float(-1.0000001f, 1.0000001f)"
    /* Double */
//  , "new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)"  // Location is a PointF value in Revenj and cannot support values > E38
  , "new java.awt.geom.Point2D.Double(-2.000000000000345, 1.000000000000234)" // Will probably be rounded down to (-2, 1)
  )
}
