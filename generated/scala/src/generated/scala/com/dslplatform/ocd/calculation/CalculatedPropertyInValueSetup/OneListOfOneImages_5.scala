package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfOneImages_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneImages: IndexedSeq[java.awt.image.BufferedImage] = IndexedSeq.empty,
     calculatedOneListOfOneImages: IndexedSeq[java.awt.image.BufferedImage] = IndexedSeq.empty,
     persistedOneListOfOneImages: IndexedSeq[java.awt.image.BufferedImage] = IndexedSeq.empty
  ) {

    require(oneListOfOneImages ne null, "Null value was provided for property \"oneListOfOneImages\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneImages)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneImages") oneListOfOneImages: IndexedSeq[java.awt.image.BufferedImage]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneImages") calculatedOneListOfOneImages: IndexedSeq[java.awt.image.BufferedImage]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneImages") persistedOneListOfOneImages: IndexedSeq[java.awt.image.BufferedImage]
  ) =
    this( oneListOfOneImages = if (oneListOfOneImages == null) IndexedSeq.empty else oneListOfOneImages, calculatedOneListOfOneImages = calculatedOneListOfOneImages, persistedOneListOfOneImages = persistedOneListOfOneImages)

}
