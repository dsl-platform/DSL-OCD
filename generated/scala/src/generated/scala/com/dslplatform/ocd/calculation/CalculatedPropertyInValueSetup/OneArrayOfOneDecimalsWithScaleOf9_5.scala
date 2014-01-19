package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfOneDecimalsWithScaleOf9_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneDecimalsWithScaleOf9: Array[BigDecimal] = Array.empty,
     calculatedOneArrayOfOneDecimalsWithScaleOf9: Array[BigDecimal] = Array.empty,
     persistedOneArrayOfOneDecimalsWithScaleOf9: Array[BigDecimal] = Array.empty
  ) {

    require(oneArrayOfOneDecimalsWithScaleOf9 ne null, "Null value was provided for property \"oneArrayOfOneDecimalsWithScaleOf9\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneDecimalsWithScaleOf9)
    com.dslplatform.api.Guards.checkArrayScale(oneArrayOfOneDecimalsWithScaleOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneDecimalsWithScaleOf9") oneArrayOfOneDecimalsWithScaleOf9: Array[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneDecimalsWithScaleOf9") calculatedOneArrayOfOneDecimalsWithScaleOf9: Array[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneDecimalsWithScaleOf9") persistedOneArrayOfOneDecimalsWithScaleOf9: Array[BigDecimal]
  ) =
    this( oneArrayOfOneDecimalsWithScaleOf9 = if (oneArrayOfOneDecimalsWithScaleOf9 == null) Array.empty else oneArrayOfOneDecimalsWithScaleOf9, calculatedOneArrayOfOneDecimalsWithScaleOf9 = calculatedOneArrayOfOneDecimalsWithScaleOf9, persistedOneArrayOfOneDecimalsWithScaleOf9 = persistedOneArrayOfOneDecimalsWithScaleOf9)

}
