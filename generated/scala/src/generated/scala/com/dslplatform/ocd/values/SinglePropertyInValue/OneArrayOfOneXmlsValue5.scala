package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfOneXmlsValue5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneXmls: Array[scala.xml.Elem] = Array.empty
  ) {

    require(oneArrayOfOneXmls ne null, "Null value was provided for property \"oneArrayOfOneXmls\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneXmls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneXmls") oneArrayOfOneXmls: Array[scala.xml.Elem]
  ) =
    this( oneArrayOfOneXmls = if (oneArrayOfOneXmls == null) Array.empty else oneArrayOfOneXmls)

}
