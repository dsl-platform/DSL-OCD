package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfNullableDecimalsWithScaleOf9_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableDecimalsWithScaleOf9: Option[Set[Option[BigDecimal]]] = None,
     calculatedNullableSetOfNullableDecimalsWithScaleOf9: Option[Set[Option[BigDecimal]]] = None,
     persistedNullableSetOfNullableDecimalsWithScaleOf9: Option[Set[Option[BigDecimal]]] = None
  ) {

    require(nullableSetOfNullableDecimalsWithScaleOf9 ne null, "Null value was provided for property \"nullableSetOfNullableDecimalsWithScaleOf9\"")
    if (nullableSetOfNullableDecimalsWithScaleOf9.isDefined) require(nullableSetOfNullableDecimalsWithScaleOf9.get ne null, "Null value was provided for property \"nullableSetOfNullableDecimalsWithScaleOf9\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableDecimalsWithScaleOf9)
    com.dslplatform.api.Guards.checkCollectionOptionScale(nullableSetOfNullableDecimalsWithScaleOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableDecimalsWithScaleOf9") nullableSetOfNullableDecimalsWithScaleOf9: Option[Set[Option[BigDecimal]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableDecimalsWithScaleOf9") calculatedNullableSetOfNullableDecimalsWithScaleOf9: Option[Set[Option[BigDecimal]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableDecimalsWithScaleOf9") persistedNullableSetOfNullableDecimalsWithScaleOf9: Option[Set[Option[BigDecimal]]]
  ) =
    this( nullableSetOfNullableDecimalsWithScaleOf9 = nullableSetOfNullableDecimalsWithScaleOf9, calculatedNullableSetOfNullableDecimalsWithScaleOf9 = calculatedNullableSetOfNullableDecimalsWithScaleOf9, persistedNullableSetOfNullableDecimalsWithScaleOf9 = persistedNullableSetOfNullableDecimalsWithScaleOf9)

}
