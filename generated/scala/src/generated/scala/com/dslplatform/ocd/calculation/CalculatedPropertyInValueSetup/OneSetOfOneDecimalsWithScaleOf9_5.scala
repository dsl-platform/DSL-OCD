package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfOneDecimalsWithScaleOf9_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneDecimalsWithScaleOf9: Set[BigDecimal] = Set.empty,
     calculatedOneSetOfOneDecimalsWithScaleOf9: Set[BigDecimal] = Set.empty,
     persistedOneSetOfOneDecimalsWithScaleOf9: Set[BigDecimal] = Set.empty
  ) {

    require(oneSetOfOneDecimalsWithScaleOf9 ne null, "Null value was provided for property \"oneSetOfOneDecimalsWithScaleOf9\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneDecimalsWithScaleOf9)
    com.dslplatform.api.Guards.checkCollectionScale(oneSetOfOneDecimalsWithScaleOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneDecimalsWithScaleOf9") oneSetOfOneDecimalsWithScaleOf9: Set[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneDecimalsWithScaleOf9") calculatedOneSetOfOneDecimalsWithScaleOf9: Set[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneDecimalsWithScaleOf9") persistedOneSetOfOneDecimalsWithScaleOf9: Set[BigDecimal]
  ) =
    this( oneSetOfOneDecimalsWithScaleOf9 = if (oneSetOfOneDecimalsWithScaleOf9 == null) Set.empty else oneSetOfOneDecimalsWithScaleOf9, calculatedOneSetOfOneDecimalsWithScaleOf9 = calculatedOneSetOfOneDecimalsWithScaleOf9, persistedOneSetOfOneDecimalsWithScaleOf9 = persistedOneSetOfOneDecimalsWithScaleOf9)

}
