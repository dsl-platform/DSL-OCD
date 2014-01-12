package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfOneImagesValue5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneImages: Array[java.awt.image.BufferedImage] = Array.empty
  ) {

    require(oneArrayOfOneImages ne null, "Null value was provided for property \"oneArrayOfOneImages\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneImages)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneImages") oneArrayOfOneImages: Array[java.awt.image.BufferedImage]
  ) =
    this( oneArrayOfOneImages = if (oneArrayOfOneImages == null) Array.empty else oneArrayOfOneImages)

}
