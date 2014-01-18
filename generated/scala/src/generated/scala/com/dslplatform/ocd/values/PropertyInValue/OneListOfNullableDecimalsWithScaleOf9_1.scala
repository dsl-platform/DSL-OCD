package com.dslplatform.ocd.values.PropertyInValue

case class OneListOfNullableDecimalsWithScaleOf9_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableDecimalsWithScaleOf9: IndexedSeq[Option[BigDecimal]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableDecimalsWithScaleOf9 ne null, "Null value was provided for property \"oneListOfNullableDecimalsWithScaleOf9\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableDecimalsWithScaleOf9)
    com.dslplatform.api.Guards.checkCollectionOptionScale(oneListOfNullableDecimalsWithScaleOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableDecimalsWithScaleOf9") oneListOfNullableDecimalsWithScaleOf9: IndexedSeq[Option[BigDecimal]]
  ) =
    this( oneListOfNullableDecimalsWithScaleOf9 = if (oneListOfNullableDecimalsWithScaleOf9 == null) IndexedSeq.empty else oneListOfNullableDecimalsWithScaleOf9)

}
