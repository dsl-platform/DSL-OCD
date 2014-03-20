package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaRectangle
    extends JavaStub {

  val classReference = "java.awt.geom.Rectangle2D"

  val defaultSingle = "new java.awt.geom.Rectangle2D.Float()"

  // FIXME
  val nonDefaultValues = Seq(
    "dinamo"
  , "hajduk"
  )
}
