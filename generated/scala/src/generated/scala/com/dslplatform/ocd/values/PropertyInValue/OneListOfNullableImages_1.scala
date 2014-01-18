package com.dslplatform.ocd.values.PropertyInValue

case class OneListOfNullableImages_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableImages: IndexedSeq[Option[java.awt.image.BufferedImage]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableImages ne null, "Null value was provided for property \"oneListOfNullableImages\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableImages)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableImages") oneListOfNullableImages: IndexedSeq[Option[java.awt.image.BufferedImage]]
  ) =
    this( oneListOfNullableImages = if (oneListOfNullableImages == null) IndexedSeq.empty else oneListOfNullableImages)

}
