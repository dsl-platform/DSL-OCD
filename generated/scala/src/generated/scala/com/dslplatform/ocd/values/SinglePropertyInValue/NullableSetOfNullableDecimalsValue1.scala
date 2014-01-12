package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableSetOfNullableDecimalsValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableDecimals: Option[Set[Option[BigDecimal]]] = None
  ) {

    require(nullableSetOfNullableDecimals ne null, "Null value was provided for property \"nullableSetOfNullableDecimals\"")
    if (nullableSetOfNullableDecimals.isDefined) require(nullableSetOfNullableDecimals.get ne null, "Null value was provided for property \"nullableSetOfNullableDecimals\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableDecimals)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableDecimals") nullableSetOfNullableDecimals: Option[Set[Option[BigDecimal]]]
  ) =
    this( nullableSetOfNullableDecimals = nullableSetOfNullableDecimals)

}
