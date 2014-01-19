package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfOneImages_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneImages: Option[Array[java.awt.image.BufferedImage]] = None,
     calculatedNullableArrayOfOneImages: Option[Array[java.awt.image.BufferedImage]] = None,
     persistedNullableArrayOfOneImages: Option[Array[java.awt.image.BufferedImage]] = None
  ) {

    require(nullableArrayOfOneImages ne null, "Null value was provided for property \"nullableArrayOfOneImages\"")
    if (nullableArrayOfOneImages.isDefined) require(nullableArrayOfOneImages.get ne null, "Null value was provided for property \"nullableArrayOfOneImages\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneImages)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneImages") nullableArrayOfOneImages: Option[Array[java.awt.image.BufferedImage]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneImages") calculatedNullableArrayOfOneImages: Option[Array[java.awt.image.BufferedImage]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneImages") persistedNullableArrayOfOneImages: Option[Array[java.awt.image.BufferedImage]]
  ) =
    this( nullableArrayOfOneImages = nullableArrayOfOneImages, calculatedNullableArrayOfOneImages = calculatedNullableArrayOfOneImages, persistedNullableArrayOfOneImages = persistedNullableArrayOfOneImages)

}
