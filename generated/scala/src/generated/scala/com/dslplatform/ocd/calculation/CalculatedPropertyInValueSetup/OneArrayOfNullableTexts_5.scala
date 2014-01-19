package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfNullableTexts_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableTexts: Array[Option[String]] = Array.empty,
     calculatedOneArrayOfNullableTexts: Array[Option[String]] = Array.empty,
     persistedOneArrayOfNullableTexts: Array[Option[String]] = Array.empty
  ) {

    require(oneArrayOfNullableTexts ne null, "Null value was provided for property \"oneArrayOfNullableTexts\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableTexts)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableTexts") oneArrayOfNullableTexts: Array[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableTexts") calculatedOneArrayOfNullableTexts: Array[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableTexts") persistedOneArrayOfNullableTexts: Array[Option[String]]
  ) =
    this( oneArrayOfNullableTexts = if (oneArrayOfNullableTexts == null) Array.empty else oneArrayOfNullableTexts, calculatedOneArrayOfNullableTexts = calculatedOneArrayOfNullableTexts, persistedOneArrayOfNullableTexts = persistedOneArrayOfNullableTexts)

}
