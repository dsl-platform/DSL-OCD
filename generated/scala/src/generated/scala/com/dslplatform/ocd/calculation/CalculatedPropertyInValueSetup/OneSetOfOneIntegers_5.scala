package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfOneIntegers_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneIntegers: Set[Int] = Set.empty,
     calculatedOneSetOfOneIntegers: Set[Int] = Set.empty,
     persistedOneSetOfOneIntegers: Set[Int] = Set.empty
  ) {

    require(oneSetOfOneIntegers ne null, "Null value was provided for property \"oneSetOfOneIntegers\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneIntegers") oneSetOfOneIntegers: Set[Int]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneIntegers") calculatedOneSetOfOneIntegers: Set[Int]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneIntegers") persistedOneSetOfOneIntegers: Set[Int]
  ) =
    this( oneSetOfOneIntegers = if (oneSetOfOneIntegers == null) Set.empty else oneSetOfOneIntegers, calculatedOneSetOfOneIntegers = calculatedOneSetOfOneIntegers, persistedOneSetOfOneIntegers = persistedOneSetOfOneIntegers)

}
