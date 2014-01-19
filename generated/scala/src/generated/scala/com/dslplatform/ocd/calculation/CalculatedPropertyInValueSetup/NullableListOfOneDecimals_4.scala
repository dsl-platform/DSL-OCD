package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfOneDecimals_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneDecimals: Option[IndexedSeq[BigDecimal]] = None,
     calculatedNullableListOfOneDecimals: Option[IndexedSeq[BigDecimal]] = None,
     persistedNullableListOfOneDecimals: Option[IndexedSeq[BigDecimal]] = None
  ) {

    require(nullableListOfOneDecimals ne null, "Null value was provided for property \"nullableListOfOneDecimals\"")
    if (nullableListOfOneDecimals.isDefined) require(nullableListOfOneDecimals.get ne null, "Null value was provided for property \"nullableListOfOneDecimals\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneDecimals)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneDecimals") nullableListOfOneDecimals: Option[IndexedSeq[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneDecimals") calculatedNullableListOfOneDecimals: Option[IndexedSeq[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneDecimals") persistedNullableListOfOneDecimals: Option[IndexedSeq[BigDecimal]]
  ) =
    this( nullableListOfOneDecimals = nullableListOfOneDecimals, calculatedNullableListOfOneDecimals = calculatedNullableListOfOneDecimals, persistedNullableListOfOneDecimals = persistedNullableListOfOneDecimals)

}
