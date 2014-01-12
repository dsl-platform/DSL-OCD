package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneListOfNullableDecimalsValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableDecimals: IndexedSeq[Option[BigDecimal]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableDecimals ne null, "Null value was provided for property \"oneListOfNullableDecimals\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableDecimals)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableDecimals") oneListOfNullableDecimals: IndexedSeq[Option[BigDecimal]]
  ) =
    this( oneListOfNullableDecimals = if (oneListOfNullableDecimals == null) IndexedSeq.empty else oneListOfNullableDecimals)

}
