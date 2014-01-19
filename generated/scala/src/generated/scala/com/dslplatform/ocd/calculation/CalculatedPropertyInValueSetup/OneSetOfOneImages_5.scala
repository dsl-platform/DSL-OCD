package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfOneImages_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneImages: Set[java.awt.image.BufferedImage] = Set.empty,
     calculatedOneSetOfOneImages: Set[java.awt.image.BufferedImage] = Set.empty,
     persistedOneSetOfOneImages: Set[java.awt.image.BufferedImage] = Set.empty
  ) {

    require(oneSetOfOneImages ne null, "Null value was provided for property \"oneSetOfOneImages\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneImages)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneImages") oneSetOfOneImages: Set[java.awt.image.BufferedImage]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneImages") calculatedOneSetOfOneImages: Set[java.awt.image.BufferedImage]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneImages") persistedOneSetOfOneImages: Set[java.awt.image.BufferedImage]
  ) =
    this( oneSetOfOneImages = if (oneSetOfOneImages == null) Set.empty else oneSetOfOneImages, calculatedOneSetOfOneImages = calculatedOneSetOfOneImages, persistedOneSetOfOneImages = persistedOneSetOfOneImages)

}
