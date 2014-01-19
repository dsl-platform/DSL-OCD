package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfNullableImages_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableImages: Set[Option[java.awt.image.BufferedImage]] = Set.empty,
     calculatedOneSetOfNullableImages: Set[Option[java.awt.image.BufferedImage]] = Set.empty,
     persistedOneSetOfNullableImages: Set[Option[java.awt.image.BufferedImage]] = Set.empty
  ) {

    require(oneSetOfNullableImages ne null, "Null value was provided for property \"oneSetOfNullableImages\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableImages)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableImages") oneSetOfNullableImages: Set[Option[java.awt.image.BufferedImage]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableImages") calculatedOneSetOfNullableImages: Set[Option[java.awt.image.BufferedImage]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableImages") persistedOneSetOfNullableImages: Set[Option[java.awt.image.BufferedImage]]
  ) =
    this( oneSetOfNullableImages = if (oneSetOfNullableImages == null) Set.empty else oneSetOfNullableImages, calculatedOneSetOfNullableImages = calculatedOneSetOfNullableImages, persistedOneSetOfNullableImages = persistedOneSetOfNullableImages)

}
