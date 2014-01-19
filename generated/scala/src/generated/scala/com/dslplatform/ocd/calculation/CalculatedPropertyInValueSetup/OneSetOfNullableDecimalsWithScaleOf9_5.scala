package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfNullableDecimalsWithScaleOf9_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableDecimalsWithScaleOf9: Set[Option[BigDecimal]] = Set.empty,
     calculatedOneSetOfNullableDecimalsWithScaleOf9: Set[Option[BigDecimal]] = Set.empty,
     persistedOneSetOfNullableDecimalsWithScaleOf9: Set[Option[BigDecimal]] = Set.empty
  ) {

    require(oneSetOfNullableDecimalsWithScaleOf9 ne null, "Null value was provided for property \"oneSetOfNullableDecimalsWithScaleOf9\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableDecimalsWithScaleOf9)
    com.dslplatform.api.Guards.checkCollectionOptionScale(oneSetOfNullableDecimalsWithScaleOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableDecimalsWithScaleOf9") oneSetOfNullableDecimalsWithScaleOf9: Set[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableDecimalsWithScaleOf9") calculatedOneSetOfNullableDecimalsWithScaleOf9: Set[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableDecimalsWithScaleOf9") persistedOneSetOfNullableDecimalsWithScaleOf9: Set[Option[BigDecimal]]
  ) =
    this( oneSetOfNullableDecimalsWithScaleOf9 = if (oneSetOfNullableDecimalsWithScaleOf9 == null) Set.empty else oneSetOfNullableDecimalsWithScaleOf9, calculatedOneSetOfNullableDecimalsWithScaleOf9 = calculatedOneSetOfNullableDecimalsWithScaleOf9, persistedOneSetOfNullableDecimalsWithScaleOf9 = persistedOneSetOfNullableDecimalsWithScaleOf9)

}
