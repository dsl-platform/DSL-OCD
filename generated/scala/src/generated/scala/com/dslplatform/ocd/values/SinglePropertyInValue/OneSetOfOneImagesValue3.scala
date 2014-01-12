package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfOneImagesValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneImages: Set[java.awt.image.BufferedImage] = Set.empty
  ) {

    require(oneSetOfOneImages ne null, "Null value was provided for property \"oneSetOfOneImages\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneImages)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneImages") oneSetOfOneImages: Set[java.awt.image.BufferedImage]
  ) =
    this( oneSetOfOneImages = if (oneSetOfOneImages == null) Set.empty else oneSetOfOneImages)

}
