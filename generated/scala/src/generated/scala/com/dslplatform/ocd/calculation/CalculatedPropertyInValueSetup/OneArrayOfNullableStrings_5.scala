package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfNullableStrings_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableStrings: Array[Option[String]] = Array.empty,
     calculatedOneArrayOfNullableStrings: Array[Option[String]] = Array.empty,
     persistedOneArrayOfNullableStrings: Array[Option[String]] = Array.empty
  ) {

    require(oneArrayOfNullableStrings ne null, "Null value was provided for property \"oneArrayOfNullableStrings\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableStrings)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableStrings") oneArrayOfNullableStrings: Array[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableStrings") calculatedOneArrayOfNullableStrings: Array[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableStrings") persistedOneArrayOfNullableStrings: Array[Option[String]]
  ) =
    this( oneArrayOfNullableStrings = if (oneArrayOfNullableStrings == null) Array.empty else oneArrayOfNullableStrings, calculatedOneArrayOfNullableStrings = calculatedOneArrayOfNullableStrings, persistedOneArrayOfNullableStrings = persistedOneArrayOfNullableStrings)

}
