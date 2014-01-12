package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfOneImagesValue5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneImages: Option[IndexedSeq[java.awt.image.BufferedImage]] = None
  ) {

    require(nullableListOfOneImages ne null, "Null value was provided for property \"nullableListOfOneImages\"")
    if (nullableListOfOneImages.isDefined) require(nullableListOfOneImages.get ne null, "Null value was provided for property \"nullableListOfOneImages\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneImages)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneImages") nullableListOfOneImages: Option[IndexedSeq[java.awt.image.BufferedImage]]
  ) =
    this( nullableListOfOneImages = nullableListOfOneImages)

}
