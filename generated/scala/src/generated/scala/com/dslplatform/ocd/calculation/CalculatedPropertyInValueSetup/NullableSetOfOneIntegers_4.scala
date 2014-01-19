package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfOneIntegers_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneIntegers: Option[Set[Int]] = None,
     calculatedNullableSetOfOneIntegers: Option[Set[Int]] = None,
     persistedNullableSetOfOneIntegers: Option[Set[Int]] = None
  ) {

    require(nullableSetOfOneIntegers ne null, "Null value was provided for property \"nullableSetOfOneIntegers\"")
    if (nullableSetOfOneIntegers.isDefined) require(nullableSetOfOneIntegers.get ne null, "Null value was provided for property \"nullableSetOfOneIntegers\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneIntegers") nullableSetOfOneIntegers: Option[Set[Int]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneIntegers") calculatedNullableSetOfOneIntegers: Option[Set[Int]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneIntegers") persistedNullableSetOfOneIntegers: Option[Set[Int]]
  ) =
    this( nullableSetOfOneIntegers = nullableSetOfOneIntegers, calculatedNullableSetOfOneIntegers = calculatedNullableSetOfOneIntegers, persistedNullableSetOfOneIntegers = persistedNullableSetOfOneIntegers)

}
