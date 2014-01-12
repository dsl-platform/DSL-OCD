package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfNullableImagesValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullableImages: Option[IndexedSeq[Option[java.awt.image.BufferedImage]]] = None
  ) {

    require(nullableListOfNullableImages ne null, "Null value was provided for property \"nullableListOfNullableImages\"")
    if (nullableListOfNullableImages.isDefined) require(nullableListOfNullableImages.get ne null, "Null value was provided for property \"nullableListOfNullableImages\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableImages)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableImages") nullableListOfNullableImages: Option[IndexedSeq[Option[java.awt.image.BufferedImage]]]
  ) =
    this( nullableListOfNullableImages = nullableListOfNullableImages)

}
