package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfOneMonies_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneMonies: Option[Set[BigDecimal]] = None,
     calculatedNullableSetOfOneMonies: Option[Set[BigDecimal]] = None,
     persistedNullableSetOfOneMonies: Option[Set[BigDecimal]] = None
  ) {

    require(nullableSetOfOneMonies ne null, "Null value was provided for property \"nullableSetOfOneMonies\"")
    if (nullableSetOfOneMonies.isDefined) require(nullableSetOfOneMonies.get ne null, "Null value was provided for property \"nullableSetOfOneMonies\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneMonies)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneMonies") nullableSetOfOneMonies: Option[Set[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneMonies") calculatedNullableSetOfOneMonies: Option[Set[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneMonies") persistedNullableSetOfOneMonies: Option[Set[BigDecimal]]
  ) =
    this( nullableSetOfOneMonies = nullableSetOfOneMonies, calculatedNullableSetOfOneMonies = calculatedNullableSetOfOneMonies, persistedNullableSetOfOneMonies = persistedNullableSetOfOneMonies)

}