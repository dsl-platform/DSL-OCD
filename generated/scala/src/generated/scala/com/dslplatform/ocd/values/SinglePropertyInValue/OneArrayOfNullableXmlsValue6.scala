package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfNullableXmlsValue6 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableXmls: Array[Option[scala.xml.Elem]] = Array.empty
  ) {

    require(oneArrayOfNullableXmls ne null, "Null value was provided for property \"oneArrayOfNullableXmls\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableXmls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableXmls") oneArrayOfNullableXmls: Array[Option[scala.xml.Elem]]
  ) =
    this( oneArrayOfNullableXmls = if (oneArrayOfNullableXmls == null) Array.empty else oneArrayOfNullableXmls)

}
