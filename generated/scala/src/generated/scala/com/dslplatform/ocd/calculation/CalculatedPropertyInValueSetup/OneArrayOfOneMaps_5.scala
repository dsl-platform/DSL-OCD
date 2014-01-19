package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfOneMaps_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneMaps: Array[Map[String, String]] = Array.empty,
     calculatedOneArrayOfOneMaps: Array[Map[String, String]] = Array.empty,
     persistedOneArrayOfOneMaps: Array[Map[String, String]] = Array.empty
  ) {

    require(oneArrayOfOneMaps ne null, "Null value was provided for property \"oneArrayOfOneMaps\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneMaps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneMaps") oneArrayOfOneMaps: Array[Map[String, String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneMaps") calculatedOneArrayOfOneMaps: Array[Map[String, String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneMaps") persistedOneArrayOfOneMaps: Array[Map[String, String]]
  ) =
    this( oneArrayOfOneMaps = if (oneArrayOfOneMaps == null) Array.empty else oneArrayOfOneMaps, calculatedOneArrayOfOneMaps = calculatedOneArrayOfOneMaps, persistedOneArrayOfOneMaps = persistedOneArrayOfOneMaps)

}
