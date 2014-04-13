package com.dslplatform.ocd
package generator
package javas
package javatypes

import types._
import boxes._

object JavaImage
    extends JavaStub {

  val classReference = "java.awt.image.BufferedImage"

  val defaultSingle: TestValue = "new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)"

  // FIXME
  val nonDefaultValues: Seq[TestValue] = Seq(
    "new java.awt.image.BufferedImage(2, 2, java.awt.image.BufferedImage.TYPE_3BYTE_BGR)"
  , "new java.awt.image.BufferedImage(3, 3, java.awt.image.BufferedImage.TYPE_BYTE_BINARY)"
  , "new java.awt.image.BufferedImage(4, 4, java.awt.image.BufferedImage.TYPE_BYTE_GRAY)"
  , "new java.awt.image.BufferedImage(5, 5, java.awt.image.BufferedImage.TYPE_BYTE_INDEXED)"
  , "new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)"
  )
}
