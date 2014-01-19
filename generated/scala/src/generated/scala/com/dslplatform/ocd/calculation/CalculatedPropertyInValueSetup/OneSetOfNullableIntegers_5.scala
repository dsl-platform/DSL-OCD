package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfNullableIntegers_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableIntegers: Set[Option[Int]] = Set.empty,
     calculatedOneSetOfNullableIntegers: Set[Option[Int]] = Set.empty,
     persistedOneSetOfNullableIntegers: Set[Option[Int]] = Set.empty
  ) {

    require(oneSetOfNullableIntegers ne null, "Null value was provided for property \"oneSetOfNullableIntegers\"")
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneSetOfNullableIntegers)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableIntegers") oneSetOfNullableIntegers: Set[Option[Int]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableIntegers") calculatedOneSetOfNullableIntegers: Set[Option[Int]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableIntegers") persistedOneSetOfNullableIntegers: Set[Option[Int]]
  ) =
    this( oneSetOfNullableIntegers = if (oneSetOfNullableIntegers == null) Set.empty else oneSetOfNullableIntegers, calculatedOneSetOfNullableIntegers = calculatedOneSetOfNullableIntegers, persistedOneSetOfNullableIntegers = persistedOneSetOfNullableIntegers)

}
