package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfNullableStrings_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableStrings: Set[Option[String]] = Set.empty,
     calculatedOneSetOfNullableStrings: Set[Option[String]] = Set.empty,
     persistedOneSetOfNullableStrings: Set[Option[String]] = Set.empty
  ) {

    require(oneSetOfNullableStrings ne null, "Null value was provided for property \"oneSetOfNullableStrings\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableStrings)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableStrings") oneSetOfNullableStrings: Set[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableStrings") calculatedOneSetOfNullableStrings: Set[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableStrings") persistedOneSetOfNullableStrings: Set[Option[String]]
  ) =
    this( oneSetOfNullableStrings = if (oneSetOfNullableStrings == null) Set.empty else oneSetOfNullableStrings, calculatedOneSetOfNullableStrings = calculatedOneSetOfNullableStrings, persistedOneSetOfNullableStrings = persistedOneSetOfNullableStrings)

}
