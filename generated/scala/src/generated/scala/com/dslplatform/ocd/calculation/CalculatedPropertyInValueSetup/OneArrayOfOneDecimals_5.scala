package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfOneDecimals_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneDecimals: Array[BigDecimal] = Array.empty,
     calculatedOneArrayOfOneDecimals: Array[BigDecimal] = Array.empty,
     persistedOneArrayOfOneDecimals: Array[BigDecimal] = Array.empty
  ) {

    require(oneArrayOfOneDecimals ne null, "Null value was provided for property \"oneArrayOfOneDecimals\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneDecimals)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneDecimals") oneArrayOfOneDecimals: Array[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneDecimals") calculatedOneArrayOfOneDecimals: Array[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneDecimals") persistedOneArrayOfOneDecimals: Array[BigDecimal]
  ) =
    this( oneArrayOfOneDecimals = if (oneArrayOfOneDecimals == null) Array.empty else oneArrayOfOneDecimals, calculatedOneArrayOfOneDecimals = calculatedOneArrayOfOneDecimals, persistedOneArrayOfOneDecimals = persistedOneArrayOfOneDecimals)

}
