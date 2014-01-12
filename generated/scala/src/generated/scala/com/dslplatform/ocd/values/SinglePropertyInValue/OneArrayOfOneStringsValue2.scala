package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfOneStringsValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneStrings: Array[String] = Array.empty
  ) {

    require(oneArrayOfOneStrings ne null, "Null value was provided for property \"oneArrayOfOneStrings\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneStrings)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneStrings") oneArrayOfOneStrings: Array[String]
  ) =
    this( oneArrayOfOneStrings = if (oneArrayOfOneStrings == null) Array.empty else oneArrayOfOneStrings)

}
