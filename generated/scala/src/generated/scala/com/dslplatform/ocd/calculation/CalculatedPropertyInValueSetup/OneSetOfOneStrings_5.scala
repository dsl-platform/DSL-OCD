package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfOneStrings_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneStrings: Set[String] = Set.empty,
     calculatedOneSetOfOneStrings: Set[String] = Set.empty,
     persistedOneSetOfOneStrings: Set[String] = Set.empty
  ) {

    require(oneSetOfOneStrings ne null, "Null value was provided for property \"oneSetOfOneStrings\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneStrings)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneStrings") oneSetOfOneStrings: Set[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneStrings") calculatedOneSetOfOneStrings: Set[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneStrings") persistedOneSetOfOneStrings: Set[String]
  ) =
    this( oneSetOfOneStrings = if (oneSetOfOneStrings == null) Set.empty else oneSetOfOneStrings, calculatedOneSetOfOneStrings = calculatedOneSetOfOneStrings, persistedOneSetOfOneStrings = persistedOneSetOfOneStrings)

}
