package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfOneTextsValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneTexts: Array[String] = Array.empty
  ) {

    require(oneArrayOfOneTexts ne null, "Null value was provided for property \"oneArrayOfOneTexts\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneTexts)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneTexts") oneArrayOfOneTexts: Array[String]
  ) =
    this( oneArrayOfOneTexts = if (oneArrayOfOneTexts == null) Array.empty else oneArrayOfOneTexts)

}
