package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaImage
    extends JavaStub {

  val classReference = "java.awt.image.BufferedImage"

  val defaultSingle: TestValue = "new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)"

  // FIXME
  val nonDefaultValues: Seq[TestValue] = Seq(
    "new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_3BYTE_BGR)"
  , "new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR_PRE)"
  , "new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_BYTE_BINARY)"
  , "new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_BYTE_GRAY)"
  , "new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_BYTE_INDEXED)"
  , "new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_CUSTOM)"
  , "new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_INT_ARGB)"
  , "new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_INT_ARGB_PRE)"
  , "new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_INT_BGR)"
  , "new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_INT_RGB)"
  , "new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_USHORT_555_RGB)"
  , "new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_USHORT_565_RGB)"
  , "new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_USHORT_GRAY)"
  )
}
