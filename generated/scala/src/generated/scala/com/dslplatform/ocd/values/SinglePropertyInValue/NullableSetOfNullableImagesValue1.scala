package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableSetOfNullableImagesValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableImages: Option[Set[Option[java.awt.image.BufferedImage]]] = None
  ) {

    require(nullableSetOfNullableImages ne null, "Null value was provided for property \"nullableSetOfNullableImages\"")
    if (nullableSetOfNullableImages.isDefined) require(nullableSetOfNullableImages.get ne null, "Null value was provided for property \"nullableSetOfNullableImages\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableImages)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableImages") nullableSetOfNullableImages: Option[Set[Option[java.awt.image.BufferedImage]]]
  ) =
    this( nullableSetOfNullableImages = nullableSetOfNullableImages)

}
