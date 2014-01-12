package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfNullableImagesValue11 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableImages: Array[Option[java.awt.image.BufferedImage]] = Array.empty
  ) {

    require(oneArrayOfNullableImages ne null, "Null value was provided for property \"oneArrayOfNullableImages\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableImages)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableImages") oneArrayOfNullableImages: Array[Option[java.awt.image.BufferedImage]]
  ) =
    this( oneArrayOfNullableImages = if (oneArrayOfNullableImages == null) Array.empty else oneArrayOfNullableImages)

}
