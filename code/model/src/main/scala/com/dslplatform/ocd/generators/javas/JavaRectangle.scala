package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaRectangle
    extends JavaStub {

  val classReference = "java.awt.geom.Rectangle2D"

  val defaultSingle = "new java.awt.geom.Rectangle2D.Float()"


  //TODO:
  override val borderSingleValues = Seq(
        "dinamo"
      , "hajduk"
      )
}
