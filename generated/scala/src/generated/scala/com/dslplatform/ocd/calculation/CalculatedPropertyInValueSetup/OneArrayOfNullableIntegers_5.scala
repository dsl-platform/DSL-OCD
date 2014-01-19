package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfNullableIntegers_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableIntegers: Array[Option[Int]] = Array.empty,
     calculatedOneArrayOfNullableIntegers: Array[Option[Int]] = Array.empty,
     persistedOneArrayOfNullableIntegers: Array[Option[Int]] = Array.empty
  ) {

    require(oneArrayOfNullableIntegers ne null, "Null value was provided for property \"oneArrayOfNullableIntegers\"")
    com.dslplatform.api.Guards.checkArrayOptionValNulls(oneArrayOfNullableIntegers)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableIntegers") oneArrayOfNullableIntegers: Array[Option[Int]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableIntegers") calculatedOneArrayOfNullableIntegers: Array[Option[Int]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableIntegers") persistedOneArrayOfNullableIntegers: Array[Option[Int]]
  ) =
    this( oneArrayOfNullableIntegers = if (oneArrayOfNullableIntegers == null) Array.empty else oneArrayOfNullableIntegers, calculatedOneArrayOfNullableIntegers = calculatedOneArrayOfNullableIntegers, persistedOneArrayOfNullableIntegers = persistedOneArrayOfNullableIntegers)

}
