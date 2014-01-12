package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfOneMapsValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneMaps: Array[Map[String, String]] = Array.empty
  ) {

    require(oneArrayOfOneMaps ne null, "Null value was provided for property \"oneArrayOfOneMaps\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneMaps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneMaps") oneArrayOfOneMaps: Array[Map[String, String]]
  ) =
    this( oneArrayOfOneMaps = if (oneArrayOfOneMaps == null) Array.empty else oneArrayOfOneMaps)

}
