package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableSetOfOneImagesValue6 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneImages: Option[Set[java.awt.image.BufferedImage]] = None
  ) {

    require(nullableSetOfOneImages ne null, "Null value was provided for property \"nullableSetOfOneImages\"")
    if (nullableSetOfOneImages.isDefined) require(nullableSetOfOneImages.get ne null, "Null value was provided for property \"nullableSetOfOneImages\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneImages)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneImages") nullableSetOfOneImages: Option[Set[java.awt.image.BufferedImage]]
  ) =
    this( nullableSetOfOneImages = nullableSetOfOneImages)

}
