package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfOneDecimals_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneDecimals: Set[BigDecimal] = Set.empty,
     calculatedOneSetOfOneDecimals: Set[BigDecimal] = Set.empty,
     persistedOneSetOfOneDecimals: Set[BigDecimal] = Set.empty
  ) {

    require(oneSetOfOneDecimals ne null, "Null value was provided for property \"oneSetOfOneDecimals\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneDecimals)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneDecimals") oneSetOfOneDecimals: Set[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneDecimals") calculatedOneSetOfOneDecimals: Set[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneDecimals") persistedOneSetOfOneDecimals: Set[BigDecimal]
  ) =
    this( oneSetOfOneDecimals = if (oneSetOfOneDecimals == null) Set.empty else oneSetOfOneDecimals, calculatedOneSetOfOneDecimals = calculatedOneSetOfOneDecimals, persistedOneSetOfOneDecimals = persistedOneSetOfOneDecimals)

}
