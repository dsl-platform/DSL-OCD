package com.dslplatform.ocd
package generator
package javas
package javatypes

import types._
import boxes._

object JavaRectangle
    extends JavaStub {

  val classReference = "java.awt.geom.Rectangle2D"

  val defaultSingle: TestValue = "new java.awt.geom.Rectangle2D.Float()"

  val nonDefaultValues: Seq[TestValue] = Seq(
    /* Integer */
    "new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)"
  , "new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)"
    /* Float */
  , "new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)"
  , "new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)"
    /* Double */
//  , "new java.awt.geom.Rectangle2D.Double(Double.MIN_VALUE, Double.MIN_VALUE, Double.MAX_VALUE, Double.MAX_VALUE)"     // Rectangle is a RectangleF value in Revenj and cannot support values > E38
  , "new java.awt.geom.Rectangle2D.Double(-2.000000000000123, -2.000000000000234, 1.000000000000345, 1.000000000000456)" // Will probably be rounded down to (-2, -2, 1, 1)
  )
}
