package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfNullableImagesValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableImages: Set[Option[java.awt.image.BufferedImage]] = Set.empty
  ) {

    require(oneSetOfNullableImages ne null, "Null value was provided for property \"oneSetOfNullableImages\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableImages)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableImages") oneSetOfNullableImages: Set[Option[java.awt.image.BufferedImage]]
  ) =
    this( oneSetOfNullableImages = if (oneSetOfNullableImages == null) Set.empty else oneSetOfNullableImages)

}
