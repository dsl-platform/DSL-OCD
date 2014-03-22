package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaRectangle
    extends JavaStub {

  val classReference = "java.awt.geom.Rectangle2D"

  val defaultSingle = "new java.awt.geom.Rectangle2D.Float()"

  val nonDefaultValues = Seq(
      /* Integer */
      "new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)"
    , "new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)"
      /* Float */
    , "new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)"
    , "new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)"
      /* Double */
    , "new java.awt.geom.Rectangle2D.Double(Double.MIN_VALUE, Double.MIN_VALUE, Double.MAX_VALUE, Double.MAX_VALUE)"
    , "new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001)"
  )
}
