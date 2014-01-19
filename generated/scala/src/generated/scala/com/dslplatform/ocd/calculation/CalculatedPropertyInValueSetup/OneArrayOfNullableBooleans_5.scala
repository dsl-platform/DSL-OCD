package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfNullableBooleans_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableBooleans: Array[Option[Boolean]] = Array.empty,
     calculatedOneArrayOfNullableBooleans: Array[Option[Boolean]] = Array.empty,
     persistedOneArrayOfNullableBooleans: Array[Option[Boolean]] = Array.empty
  ) {

    require(oneArrayOfNullableBooleans ne null, "Null value was provided for property \"oneArrayOfNullableBooleans\"")
    com.dslplatform.api.Guards.checkArrayOptionValNulls(oneArrayOfNullableBooleans)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableBooleans") oneArrayOfNullableBooleans: Array[Option[Boolean]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableBooleans") calculatedOneArrayOfNullableBooleans: Array[Option[Boolean]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableBooleans") persistedOneArrayOfNullableBooleans: Array[Option[Boolean]]
  ) =
    this( oneArrayOfNullableBooleans = if (oneArrayOfNullableBooleans == null) Array.empty else oneArrayOfNullableBooleans, calculatedOneArrayOfNullableBooleans = calculatedOneArrayOfNullableBooleans, persistedOneArrayOfNullableBooleans = persistedOneArrayOfNullableBooleans)

}
