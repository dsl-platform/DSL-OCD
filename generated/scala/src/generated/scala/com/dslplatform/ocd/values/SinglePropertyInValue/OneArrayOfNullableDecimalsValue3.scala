package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfNullableDecimalsValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableDecimals: Array[Option[BigDecimal]] = Array.empty
  ) {

    require(oneArrayOfNullableDecimals ne null, "Null value was provided for property \"oneArrayOfNullableDecimals\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableDecimals)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableDecimals") oneArrayOfNullableDecimals: Array[Option[BigDecimal]]
  ) =
    this( oneArrayOfNullableDecimals = if (oneArrayOfNullableDecimals == null) Array.empty else oneArrayOfNullableDecimals)

}
