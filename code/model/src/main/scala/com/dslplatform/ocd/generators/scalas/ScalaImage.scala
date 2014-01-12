package com.dslplatform.ocd.generators
package scalas

import Types._
import Boxes._

object ScalaImage
    extends ScalaStub {

  val clazz = "java.awt.image.BufferedImage"

  val defaultSingle = "new java.awt.image.BufferedImage(0, 0, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)"
}
