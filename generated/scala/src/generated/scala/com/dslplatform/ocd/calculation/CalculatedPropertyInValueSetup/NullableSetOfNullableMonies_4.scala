package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfNullableMonies_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableMonies: Option[Set[Option[BigDecimal]]] = None,
     calculatedNullableSetOfNullableMonies: Option[Set[Option[BigDecimal]]] = None,
     persistedNullableSetOfNullableMonies: Option[Set[Option[BigDecimal]]] = None
  ) {

    require(nullableSetOfNullableMonies ne null, "Null value was provided for property \"nullableSetOfNullableMonies\"")
    if (nullableSetOfNullableMonies.isDefined) require(nullableSetOfNullableMonies.get ne null, "Null value was provided for property \"nullableSetOfNullableMonies\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableMonies)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableMonies") nullableSetOfNullableMonies: Option[Set[Option[BigDecimal]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableMonies") calculatedNullableSetOfNullableMonies: Option[Set[Option[BigDecimal]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableMonies") persistedNullableSetOfNullableMonies: Option[Set[Option[BigDecimal]]]
  ) =
    this( nullableSetOfNullableMonies = nullableSetOfNullableMonies, calculatedNullableSetOfNullableMonies = calculatedNullableSetOfNullableMonies, persistedNullableSetOfNullableMonies = persistedNullableSetOfNullableMonies)

}
