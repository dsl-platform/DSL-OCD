package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfOneImages_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneImages: Option[Set[java.awt.image.BufferedImage]] = None,
     calculatedNullableSetOfOneImages: Option[Set[java.awt.image.BufferedImage]] = None,
     persistedNullableSetOfOneImages: Option[Set[java.awt.image.BufferedImage]] = None
  ) {

    require(nullableSetOfOneImages ne null, "Null value was provided for property \"nullableSetOfOneImages\"")
    if (nullableSetOfOneImages.isDefined) require(nullableSetOfOneImages.get ne null, "Null value was provided for property \"nullableSetOfOneImages\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneImages)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneImages") nullableSetOfOneImages: Option[Set[java.awt.image.BufferedImage]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneImages") calculatedNullableSetOfOneImages: Option[Set[java.awt.image.BufferedImage]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneImages") persistedNullableSetOfOneImages: Option[Set[java.awt.image.BufferedImage]]
  ) =
    this( nullableSetOfOneImages = nullableSetOfOneImages, calculatedNullableSetOfOneImages = calculatedNullableSetOfOneImages, persistedNullableSetOfOneImages = persistedNullableSetOfOneImages)

}
