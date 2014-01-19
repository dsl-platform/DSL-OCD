package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfOneDecimalsWithScaleOf9_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneDecimalsWithScaleOf9: Option[Set[BigDecimal]] = None,
     calculatedNullableSetOfOneDecimalsWithScaleOf9: Option[Set[BigDecimal]] = None,
     persistedNullableSetOfOneDecimalsWithScaleOf9: Option[Set[BigDecimal]] = None
  ) {

    require(nullableSetOfOneDecimalsWithScaleOf9 ne null, "Null value was provided for property \"nullableSetOfOneDecimalsWithScaleOf9\"")
    if (nullableSetOfOneDecimalsWithScaleOf9.isDefined) require(nullableSetOfOneDecimalsWithScaleOf9.get ne null, "Null value was provided for property \"nullableSetOfOneDecimalsWithScaleOf9\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneDecimalsWithScaleOf9)
    com.dslplatform.api.Guards.checkCollectionScale(nullableSetOfOneDecimalsWithScaleOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneDecimalsWithScaleOf9") nullableSetOfOneDecimalsWithScaleOf9: Option[Set[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneDecimalsWithScaleOf9") calculatedNullableSetOfOneDecimalsWithScaleOf9: Option[Set[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneDecimalsWithScaleOf9") persistedNullableSetOfOneDecimalsWithScaleOf9: Option[Set[BigDecimal]]
  ) =
    this( nullableSetOfOneDecimalsWithScaleOf9 = nullableSetOfOneDecimalsWithScaleOf9, calculatedNullableSetOfOneDecimalsWithScaleOf9 = calculatedNullableSetOfOneDecimalsWithScaleOf9, persistedNullableSetOfOneDecimalsWithScaleOf9 = persistedNullableSetOfOneDecimalsWithScaleOf9)

}
