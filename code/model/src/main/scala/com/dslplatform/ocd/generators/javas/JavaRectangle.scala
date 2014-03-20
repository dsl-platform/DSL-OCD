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
      "new java.awt.geom.Rectangle2D(Integer.MIN_VALUE, Integer.MAX_VALUE)"
    , "new java.awt.geom.Rectangle2D(1000000000, Integer.MAX_VALUE)"
    , "new java.awt.geom.Rectangle2D(Integer.MIN_VALUE, 1000000000)"
    , "new java.awt.geom.Rectangle2D(1,1,1000000000, Integer.MAX_VALUE)"
      /* Double */
    , "new java.awt.geom.Rectangle2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)"
    , "new java.awt.geom.Rectangle2D.Double(0.0, 0.1, Double.MIN_VALUE, Double.MAX_VALUE)"
    , "new java.awt.geom.Rectangle2D.Double(0.0, 1000.10)"
    , "new java.awt.geom.Rectangle2D.Double(0.01, 0.02)"
      /* Float */
    , "new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MAX_VALUE)"
    , "new java.awt.geom.Rectangle2D.Float(0.0, 0.1, Float.MIN_VALUE, Float.MAX_VALUE)"
    , "new java.awt.geom.Rectangle2D.Float(0.0f, 1000.10f)"
    , "new java.awt.geom.Rectangle2D.Float(0.1f, 0.2f)"
  )
}
