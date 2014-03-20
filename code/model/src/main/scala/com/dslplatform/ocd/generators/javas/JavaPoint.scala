package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaPoint
    extends JavaStub {

  val classReference = "java.awt.geom.Point2D"

  val defaultSingle = "new java.awt.Point()"

  // FIXME
  val nonDefaultValues = Seq(
    "dinamo"
  , "hajduk"
  )
}
