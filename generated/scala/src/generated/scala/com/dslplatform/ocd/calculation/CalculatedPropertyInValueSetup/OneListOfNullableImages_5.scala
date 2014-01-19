package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfNullableImages_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableImages: IndexedSeq[Option[java.awt.image.BufferedImage]] = IndexedSeq.empty,
     calculatedOneListOfNullableImages: IndexedSeq[Option[java.awt.image.BufferedImage]] = IndexedSeq.empty,
     persistedOneListOfNullableImages: IndexedSeq[Option[java.awt.image.BufferedImage]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableImages ne null, "Null value was provided for property \"oneListOfNullableImages\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableImages)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableImages") oneListOfNullableImages: IndexedSeq[Option[java.awt.image.BufferedImage]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableImages") calculatedOneListOfNullableImages: IndexedSeq[Option[java.awt.image.BufferedImage]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableImages") persistedOneListOfNullableImages: IndexedSeq[Option[java.awt.image.BufferedImage]]
  ) =
    this( oneListOfNullableImages = if (oneListOfNullableImages == null) IndexedSeq.empty else oneListOfNullableImages, calculatedOneListOfNullableImages = calculatedOneListOfNullableImages, persistedOneListOfNullableImages = persistedOneListOfNullableImages)

}
