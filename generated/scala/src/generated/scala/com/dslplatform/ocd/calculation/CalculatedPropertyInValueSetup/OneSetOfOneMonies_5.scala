package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfOneMonies_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneMonies: Set[BigDecimal] = Set.empty,
     calculatedOneSetOfOneMonies: Set[BigDecimal] = Set.empty,
     persistedOneSetOfOneMonies: Set[BigDecimal] = Set.empty
  ) {

    require(oneSetOfOneMonies ne null, "Null value was provided for property \"oneSetOfOneMonies\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneMonies)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneMonies") oneSetOfOneMonies: Set[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneMonies") calculatedOneSetOfOneMonies: Set[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneMonies") persistedOneSetOfOneMonies: Set[BigDecimal]
  ) =
    this( oneSetOfOneMonies = if (oneSetOfOneMonies == null) Set.empty else oneSetOfOneMonies, calculatedOneSetOfOneMonies = calculatedOneSetOfOneMonies, persistedOneSetOfOneMonies = persistedOneSetOfOneMonies)

}
