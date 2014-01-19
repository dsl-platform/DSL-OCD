package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfOneIntegers_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneIntegers: Array[Int] = Array.empty,
     calculatedOneArrayOfOneIntegers: Array[Int] = Array.empty,
     persistedOneArrayOfOneIntegers: Array[Int] = Array.empty
  ) {

    require(oneArrayOfOneIntegers ne null, "Null value was provided for property \"oneArrayOfOneIntegers\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneIntegers") oneArrayOfOneIntegers: Array[Int]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneIntegers") calculatedOneArrayOfOneIntegers: Array[Int]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneIntegers") persistedOneArrayOfOneIntegers: Array[Int]
  ) =
    this( oneArrayOfOneIntegers = if (oneArrayOfOneIntegers == null) Array.empty else oneArrayOfOneIntegers, calculatedOneArrayOfOneIntegers = calculatedOneArrayOfOneIntegers, persistedOneArrayOfOneIntegers = persistedOneArrayOfOneIntegers)

}
