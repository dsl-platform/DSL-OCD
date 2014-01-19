package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfNullableBooleans_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableBooleans: Set[Option[Boolean]] = Set.empty,
     calculatedOneSetOfNullableBooleans: Set[Option[Boolean]] = Set.empty,
     persistedOneSetOfNullableBooleans: Set[Option[Boolean]] = Set.empty
  ) {

    require(oneSetOfNullableBooleans ne null, "Null value was provided for property \"oneSetOfNullableBooleans\"")
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneSetOfNullableBooleans)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableBooleans") oneSetOfNullableBooleans: Set[Option[Boolean]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableBooleans") calculatedOneSetOfNullableBooleans: Set[Option[Boolean]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableBooleans") persistedOneSetOfNullableBooleans: Set[Option[Boolean]]
  ) =
    this( oneSetOfNullableBooleans = if (oneSetOfNullableBooleans == null) Set.empty else oneSetOfNullableBooleans, calculatedOneSetOfNullableBooleans = calculatedOneSetOfNullableBooleans, persistedOneSetOfNullableBooleans = persistedOneSetOfNullableBooleans)

}
