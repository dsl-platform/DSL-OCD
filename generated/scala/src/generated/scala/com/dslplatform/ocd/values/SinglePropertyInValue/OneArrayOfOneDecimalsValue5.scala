package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfOneDecimalsValue5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneDecimals: Array[BigDecimal] = Array.empty
  ) {

    require(oneArrayOfOneDecimals ne null, "Null value was provided for property \"oneArrayOfOneDecimals\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneDecimals)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneDecimals") oneArrayOfOneDecimals: Array[BigDecimal]
  ) =
    this( oneArrayOfOneDecimals = if (oneArrayOfOneDecimals == null) Array.empty else oneArrayOfOneDecimals)

}
