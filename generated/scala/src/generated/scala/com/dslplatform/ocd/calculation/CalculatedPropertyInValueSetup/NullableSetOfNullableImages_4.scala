package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfNullableImages_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableImages: Option[Set[Option[java.awt.image.BufferedImage]]] = None,
     calculatedNullableSetOfNullableImages: Option[Set[Option[java.awt.image.BufferedImage]]] = None,
     persistedNullableSetOfNullableImages: Option[Set[Option[java.awt.image.BufferedImage]]] = None
  ) {

    require(nullableSetOfNullableImages ne null, "Null value was provided for property \"nullableSetOfNullableImages\"")
    if (nullableSetOfNullableImages.isDefined) require(nullableSetOfNullableImages.get ne null, "Null value was provided for property \"nullableSetOfNullableImages\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableImages)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableImages") nullableSetOfNullableImages: Option[Set[Option[java.awt.image.BufferedImage]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableImages") calculatedNullableSetOfNullableImages: Option[Set[Option[java.awt.image.BufferedImage]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableImages") persistedNullableSetOfNullableImages: Option[Set[Option[java.awt.image.BufferedImage]]]
  ) =
    this( nullableSetOfNullableImages = nullableSetOfNullableImages, calculatedNullableSetOfNullableImages = calculatedNullableSetOfNullableImages, persistedNullableSetOfNullableImages = persistedNullableSetOfNullableImages)

}
