package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfNullableMonies_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableMonies: Set[Option[BigDecimal]] = Set.empty,
     calculatedOneSetOfNullableMonies: Set[Option[BigDecimal]] = Set.empty,
     persistedOneSetOfNullableMonies: Set[Option[BigDecimal]] = Set.empty
  ) {

    require(oneSetOfNullableMonies ne null, "Null value was provided for property \"oneSetOfNullableMonies\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableMonies)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableMonies") oneSetOfNullableMonies: Set[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableMonies") calculatedOneSetOfNullableMonies: Set[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableMonies") persistedOneSetOfNullableMonies: Set[Option[BigDecimal]]
  ) =
    this( oneSetOfNullableMonies = if (oneSetOfNullableMonies == null) Set.empty else oneSetOfNullableMonies, calculatedOneSetOfNullableMonies = calculatedOneSetOfNullableMonies, persistedOneSetOfNullableMonies = persistedOneSetOfNullableMonies)

}
