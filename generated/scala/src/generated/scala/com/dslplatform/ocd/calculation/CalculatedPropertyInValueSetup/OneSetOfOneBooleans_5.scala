package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfOneBooleans_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneBooleans: Set[Boolean] = Set.empty,
     calculatedOneSetOfOneBooleans: Set[Boolean] = Set.empty,
     persistedOneSetOfOneBooleans: Set[Boolean] = Set.empty
  ) {

    require(oneSetOfOneBooleans ne null, "Null value was provided for property \"oneSetOfOneBooleans\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneBooleans") oneSetOfOneBooleans: Set[Boolean]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneBooleans") calculatedOneSetOfOneBooleans: Set[Boolean]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneBooleans") persistedOneSetOfOneBooleans: Set[Boolean]
  ) =
    this( oneSetOfOneBooleans = if (oneSetOfOneBooleans == null) Set.empty else oneSetOfOneBooleans, calculatedOneSetOfOneBooleans = calculatedOneSetOfOneBooleans, persistedOneSetOfOneBooleans = persistedOneSetOfOneBooleans)

}
