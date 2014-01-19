package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfNullableImages_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullableImages: Option[IndexedSeq[Option[java.awt.image.BufferedImage]]] = None,
     calculatedNullableListOfNullableImages: Option[IndexedSeq[Option[java.awt.image.BufferedImage]]] = None,
     persistedNullableListOfNullableImages: Option[IndexedSeq[Option[java.awt.image.BufferedImage]]] = None
  ) {

    require(nullableListOfNullableImages ne null, "Null value was provided for property \"nullableListOfNullableImages\"")
    if (nullableListOfNullableImages.isDefined) require(nullableListOfNullableImages.get ne null, "Null value was provided for property \"nullableListOfNullableImages\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableImages)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableImages") nullableListOfNullableImages: Option[IndexedSeq[Option[java.awt.image.BufferedImage]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableImages") calculatedNullableListOfNullableImages: Option[IndexedSeq[Option[java.awt.image.BufferedImage]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableImages") persistedNullableListOfNullableImages: Option[IndexedSeq[Option[java.awt.image.BufferedImage]]]
  ) =
    this( nullableListOfNullableImages = nullableListOfNullableImages, calculatedNullableListOfNullableImages = calculatedNullableListOfNullableImages, persistedNullableListOfNullableImages = persistedNullableListOfNullableImages)

}
