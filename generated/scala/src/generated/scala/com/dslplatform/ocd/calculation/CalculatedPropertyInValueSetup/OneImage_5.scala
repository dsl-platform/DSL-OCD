package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneImage_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneImage: java.awt.image.BufferedImage = new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR),
     calculatedOneImage: java.awt.image.BufferedImage = new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR),
     persistedOneImage: java.awt.image.BufferedImage = new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)
  ) {

    require(oneImage ne null, "Null value was provided for property \"oneImage\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneImage") oneImage: java.awt.image.BufferedImage
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneImage") calculatedOneImage: java.awt.image.BufferedImage
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneImage") persistedOneImage: java.awt.image.BufferedImage
  ) =
    this( oneImage = if (oneImage == null) new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR) else oneImage, calculatedOneImage = if (calculatedOneImage == null) new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR) else calculatedOneImage, persistedOneImage = if (persistedOneImage == null) new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR) else persistedOneImage)

}
