package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfNullableDecimalsWithScaleOf9Value2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableDecimalsWithScaleOf9: Array[Option[BigDecimal]] = Array.empty
  ) {

    require(oneArrayOfNullableDecimalsWithScaleOf9 ne null, "Null value was provided for property \"oneArrayOfNullableDecimalsWithScaleOf9\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableDecimalsWithScaleOf9)
    com.dslplatform.api.Guards.checkArrayOptionScale(oneArrayOfNullableDecimalsWithScaleOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableDecimalsWithScaleOf9") oneArrayOfNullableDecimalsWithScaleOf9: Array[Option[BigDecimal]]
  ) =
    this( oneArrayOfNullableDecimalsWithScaleOf9 = if (oneArrayOfNullableDecimalsWithScaleOf9 == null) Array.empty else oneArrayOfNullableDecimalsWithScaleOf9)

}
