package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfOneTexts_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneTexts: Array[String] = Array.empty,
     calculatedOneArrayOfOneTexts: Array[String] = Array.empty,
     persistedOneArrayOfOneTexts: Array[String] = Array.empty
  ) {

    require(oneArrayOfOneTexts ne null, "Null value was provided for property \"oneArrayOfOneTexts\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneTexts)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneTexts") oneArrayOfOneTexts: Array[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneTexts") calculatedOneArrayOfOneTexts: Array[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneTexts") persistedOneArrayOfOneTexts: Array[String]
  ) =
    this( oneArrayOfOneTexts = if (oneArrayOfOneTexts == null) Array.empty else oneArrayOfOneTexts, calculatedOneArrayOfOneTexts = calculatedOneArrayOfOneTexts, persistedOneArrayOfOneTexts = persistedOneArrayOfOneTexts)

}
