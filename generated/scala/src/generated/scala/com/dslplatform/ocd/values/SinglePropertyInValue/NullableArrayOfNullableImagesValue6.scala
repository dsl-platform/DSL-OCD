package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableArrayOfNullableImagesValue6 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableImages: Option[Array[Option[java.awt.image.BufferedImage]]] = None
  ) {

    require(nullableArrayOfNullableImages ne null, "Null value was provided for property \"nullableArrayOfNullableImages\"")
    if (nullableArrayOfNullableImages.isDefined) require(nullableArrayOfNullableImages.get ne null, "Null value was provided for property \"nullableArrayOfNullableImages\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableImages)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableImages") nullableArrayOfNullableImages: Option[Array[Option[java.awt.image.BufferedImage]]]
  ) =
    this( nullableArrayOfNullableImages = nullableArrayOfNullableImages)

}
