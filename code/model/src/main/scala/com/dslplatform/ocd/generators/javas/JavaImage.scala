package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaImage
    extends JavaStub {

  val classReference = "java.awt.image.BufferedImage"

  val defaultSingle = "new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)"

  // FIXME
  val nonDefaultValues = Seq(
    "dinamo"
  , "hajduk"
  )
}
