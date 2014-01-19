package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfNullableDecimals_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableDecimals: Array[Option[BigDecimal]] = Array.empty,
     calculatedOneArrayOfNullableDecimals: Array[Option[BigDecimal]] = Array.empty,
     persistedOneArrayOfNullableDecimals: Array[Option[BigDecimal]] = Array.empty
  ) {

    require(oneArrayOfNullableDecimals ne null, "Null value was provided for property \"oneArrayOfNullableDecimals\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableDecimals)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableDecimals") oneArrayOfNullableDecimals: Array[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableDecimals") calculatedOneArrayOfNullableDecimals: Array[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableDecimals") persistedOneArrayOfNullableDecimals: Array[Option[BigDecimal]]
  ) =
    this( oneArrayOfNullableDecimals = if (oneArrayOfNullableDecimals == null) Array.empty else oneArrayOfNullableDecimals, calculatedOneArrayOfNullableDecimals = calculatedOneArrayOfNullableDecimals, persistedOneArrayOfNullableDecimals = persistedOneArrayOfNullableDecimals)

}
