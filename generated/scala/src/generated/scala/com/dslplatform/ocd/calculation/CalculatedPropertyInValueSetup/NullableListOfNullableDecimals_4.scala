package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfNullableDecimals_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullableDecimals: Option[IndexedSeq[Option[BigDecimal]]] = None,
     calculatedNullableListOfNullableDecimals: Option[IndexedSeq[Option[BigDecimal]]] = None,
     persistedNullableListOfNullableDecimals: Option[IndexedSeq[Option[BigDecimal]]] = None
  ) {

    require(nullableListOfNullableDecimals ne null, "Null value was provided for property \"nullableListOfNullableDecimals\"")
    if (nullableListOfNullableDecimals.isDefined) require(nullableListOfNullableDecimals.get ne null, "Null value was provided for property \"nullableListOfNullableDecimals\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableDecimals)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableDecimals") nullableListOfNullableDecimals: Option[IndexedSeq[Option[BigDecimal]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableDecimals") calculatedNullableListOfNullableDecimals: Option[IndexedSeq[Option[BigDecimal]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableDecimals") persistedNullableListOfNullableDecimals: Option[IndexedSeq[Option[BigDecimal]]]
  ) =
    this( nullableListOfNullableDecimals = nullableListOfNullableDecimals, calculatedNullableListOfNullableDecimals = calculatedNullableListOfNullableDecimals, persistedNullableListOfNullableDecimals = persistedNullableListOfNullableDecimals)

}
