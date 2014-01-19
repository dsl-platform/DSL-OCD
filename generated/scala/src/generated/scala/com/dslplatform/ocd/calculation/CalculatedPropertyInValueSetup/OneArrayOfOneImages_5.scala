package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfOneImages_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneImages: Array[java.awt.image.BufferedImage] = Array.empty,
     calculatedOneArrayOfOneImages: Array[java.awt.image.BufferedImage] = Array.empty,
     persistedOneArrayOfOneImages: Array[java.awt.image.BufferedImage] = Array.empty
  ) {

    require(oneArrayOfOneImages ne null, "Null value was provided for property \"oneArrayOfOneImages\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneImages)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneImages") oneArrayOfOneImages: Array[java.awt.image.BufferedImage]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneImages") calculatedOneArrayOfOneImages: Array[java.awt.image.BufferedImage]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneImages") persistedOneArrayOfOneImages: Array[java.awt.image.BufferedImage]
  ) =
    this( oneArrayOfOneImages = if (oneArrayOfOneImages == null) Array.empty else oneArrayOfOneImages, calculatedOneArrayOfOneImages = calculatedOneArrayOfOneImages, persistedOneArrayOfOneImages = persistedOneArrayOfOneImages)

}
