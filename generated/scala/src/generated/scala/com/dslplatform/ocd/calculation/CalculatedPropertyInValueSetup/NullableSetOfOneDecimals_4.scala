package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfOneDecimals_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneDecimals: Option[Set[BigDecimal]] = None,
     calculatedNullableSetOfOneDecimals: Option[Set[BigDecimal]] = None,
     persistedNullableSetOfOneDecimals: Option[Set[BigDecimal]] = None
  ) {

    require(nullableSetOfOneDecimals ne null, "Null value was provided for property \"nullableSetOfOneDecimals\"")
    if (nullableSetOfOneDecimals.isDefined) require(nullableSetOfOneDecimals.get ne null, "Null value was provided for property \"nullableSetOfOneDecimals\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneDecimals)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneDecimals") nullableSetOfOneDecimals: Option[Set[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneDecimals") calculatedNullableSetOfOneDecimals: Option[Set[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneDecimals") persistedNullableSetOfOneDecimals: Option[Set[BigDecimal]]
  ) =
    this( nullableSetOfOneDecimals = nullableSetOfOneDecimals, calculatedNullableSetOfOneDecimals = calculatedNullableSetOfOneDecimals, persistedNullableSetOfOneDecimals = persistedNullableSetOfOneDecimals)

}
