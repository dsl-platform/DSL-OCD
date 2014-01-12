package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableImageValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableImage: Option[java.awt.image.BufferedImage] = None
  ) {

    require(nullableImage ne null, "Null value was provided for property \"nullableImage\"")
    if (nullableImage.isDefined) require(nullableImage.get ne null, "Null value was provided for property \"nullableImage\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableImage") nullableImage: Option[java.awt.image.BufferedImage]
  ) =
    this( nullableImage = nullableImage)

}
