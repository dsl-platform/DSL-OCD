package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfNullableDecimalsValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableDecimals: Set[Option[BigDecimal]] = Set.empty
  ) {

    require(oneSetOfNullableDecimals ne null, "Null value was provided for property \"oneSetOfNullableDecimals\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableDecimals)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableDecimals") oneSetOfNullableDecimals: Set[Option[BigDecimal]]
  ) =
    this( oneSetOfNullableDecimals = if (oneSetOfNullableDecimals == null) Set.empty else oneSetOfNullableDecimals)

}
