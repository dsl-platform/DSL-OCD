package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfNullableDecimalsWithScaleOf9_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullableDecimalsWithScaleOf9: Option[IndexedSeq[Option[BigDecimal]]] = None,
     calculatedNullableListOfNullableDecimalsWithScaleOf9: Option[IndexedSeq[Option[BigDecimal]]] = None,
     persistedNullableListOfNullableDecimalsWithScaleOf9: Option[IndexedSeq[Option[BigDecimal]]] = None
  ) {

    require(nullableListOfNullableDecimalsWithScaleOf9 ne null, "Null value was provided for property \"nullableListOfNullableDecimalsWithScaleOf9\"")
    if (nullableListOfNullableDecimalsWithScaleOf9.isDefined) require(nullableListOfNullableDecimalsWithScaleOf9.get ne null, "Null value was provided for property \"nullableListOfNullableDecimalsWithScaleOf9\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableDecimalsWithScaleOf9)
    com.dslplatform.api.Guards.checkCollectionOptionScale(nullableListOfNullableDecimalsWithScaleOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableDecimalsWithScaleOf9") nullableListOfNullableDecimalsWithScaleOf9: Option[IndexedSeq[Option[BigDecimal]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableDecimalsWithScaleOf9") calculatedNullableListOfNullableDecimalsWithScaleOf9: Option[IndexedSeq[Option[BigDecimal]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableDecimalsWithScaleOf9") persistedNullableListOfNullableDecimalsWithScaleOf9: Option[IndexedSeq[Option[BigDecimal]]]
  ) =
    this( nullableListOfNullableDecimalsWithScaleOf9 = nullableListOfNullableDecimalsWithScaleOf9, calculatedNullableListOfNullableDecimalsWithScaleOf9 = calculatedNullableListOfNullableDecimalsWithScaleOf9, persistedNullableListOfNullableDecimalsWithScaleOf9 = persistedNullableListOfNullableDecimalsWithScaleOf9)

}
