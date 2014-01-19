package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfNullableDecimals_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableDecimals: Set[Option[BigDecimal]] = Set.empty,
     calculatedOneSetOfNullableDecimals: Set[Option[BigDecimal]] = Set.empty,
     persistedOneSetOfNullableDecimals: Set[Option[BigDecimal]] = Set.empty
  ) {

    require(oneSetOfNullableDecimals ne null, "Null value was provided for property \"oneSetOfNullableDecimals\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableDecimals)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableDecimals") oneSetOfNullableDecimals: Set[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableDecimals") calculatedOneSetOfNullableDecimals: Set[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableDecimals") persistedOneSetOfNullableDecimals: Set[Option[BigDecimal]]
  ) =
    this( oneSetOfNullableDecimals = if (oneSetOfNullableDecimals == null) Set.empty else oneSetOfNullableDecimals, calculatedOneSetOfNullableDecimals = calculatedOneSetOfNullableDecimals, persistedOneSetOfNullableDecimals = persistedOneSetOfNullableDecimals)

}
