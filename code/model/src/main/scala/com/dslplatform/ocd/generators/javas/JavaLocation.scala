package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

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
    , "new java.awt.geom.Point2D.Double(Double.MIN_VALUE, Double.MAX_VALUE)"
    , "new java.awt.geom.Point2D.Double(-1.000000000000001, 1.000000000000001)"
  )
}
