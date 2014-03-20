package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaLocation
    extends JavaStub {

  val classReference = "java.awt.geom.Point2D"

  val defaultSingle = "new java.awt.geom.Point2D.Float()"

  //TODO:
  val nonDefaultValues = Seq(
    "dinamo"
  , "hajduk"
  )
}
