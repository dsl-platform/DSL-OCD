package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfNullableDecimalsWithScaleOf9_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableDecimalsWithScaleOf9: IndexedSeq[Option[BigDecimal]] = IndexedSeq.empty,
     calculatedOneListOfNullableDecimalsWithScaleOf9: IndexedSeq[Option[BigDecimal]] = IndexedSeq.empty,
     persistedOneListOfNullableDecimalsWithScaleOf9: IndexedSeq[Option[BigDecimal]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableDecimalsWithScaleOf9 ne null, "Null value was provided for property \"oneListOfNullableDecimalsWithScaleOf9\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableDecimalsWithScaleOf9)
    com.dslplatform.api.Guards.checkCollectionOptionScale(oneListOfNullableDecimalsWithScaleOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableDecimalsWithScaleOf9") oneListOfNullableDecimalsWithScaleOf9: IndexedSeq[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableDecimalsWithScaleOf9") calculatedOneListOfNullableDecimalsWithScaleOf9: IndexedSeq[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableDecimalsWithScaleOf9") persistedOneListOfNullableDecimalsWithScaleOf9: IndexedSeq[Option[BigDecimal]]
  ) =
    this( oneListOfNullableDecimalsWithScaleOf9 = if (oneListOfNullableDecimalsWithScaleOf9 == null) IndexedSeq.empty else oneListOfNullableDecimalsWithScaleOf9, calculatedOneListOfNullableDecimalsWithScaleOf9 = calculatedOneListOfNullableDecimalsWithScaleOf9, persistedOneListOfNullableDecimalsWithScaleOf9 = persistedOneListOfNullableDecimalsWithScaleOf9)

}
