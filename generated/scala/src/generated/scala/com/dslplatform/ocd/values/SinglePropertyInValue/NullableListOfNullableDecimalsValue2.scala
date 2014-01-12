package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfNullableDecimalsValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullableDecimals: Option[IndexedSeq[Option[BigDecimal]]] = None
  ) {

    require(nullableListOfNullableDecimals ne null, "Null value was provided for property \"nullableListOfNullableDecimals\"")
    if (nullableListOfNullableDecimals.isDefined) require(nullableListOfNullableDecimals.get ne null, "Null value was provided for property \"nullableListOfNullableDecimals\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableDecimals)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableDecimals") nullableListOfNullableDecimals: Option[IndexedSeq[Option[BigDecimal]]]
  ) =
    this( nullableListOfNullableDecimals = nullableListOfNullableDecimals)

}
