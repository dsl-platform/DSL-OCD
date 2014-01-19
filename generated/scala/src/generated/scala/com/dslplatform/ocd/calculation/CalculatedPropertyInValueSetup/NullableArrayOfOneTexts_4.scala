package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfOneTexts_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneTexts: Option[Array[String]] = None,
     calculatedNullableArrayOfOneTexts: Option[Array[String]] = None,
     persistedNullableArrayOfOneTexts: Option[Array[String]] = None
  ) {

    require(nullableArrayOfOneTexts ne null, "Null value was provided for property \"nullableArrayOfOneTexts\"")
    if (nullableArrayOfOneTexts.isDefined) require(nullableArrayOfOneTexts.get ne null, "Null value was provided for property \"nullableArrayOfOneTexts\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneTexts)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneTexts") nullableArrayOfOneTexts: Option[Array[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneTexts") calculatedNullableArrayOfOneTexts: Option[Array[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneTexts") persistedNullableArrayOfOneTexts: Option[Array[String]]
  ) =
    this( nullableArrayOfOneTexts = nullableArrayOfOneTexts, calculatedNullableArrayOfOneTexts = calculatedNullableArrayOfOneTexts, persistedNullableArrayOfOneTexts = persistedNullableArrayOfOneTexts)

}
