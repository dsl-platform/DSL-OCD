package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfNullableIntegers_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableIntegers: Option[Set[Option[Int]]] = None,
     calculatedNullableSetOfNullableIntegers: Option[Set[Option[Int]]] = None,
     persistedNullableSetOfNullableIntegers: Option[Set[Option[Int]]] = None
  ) {

    require(nullableSetOfNullableIntegers ne null, "Null value was provided for property \"nullableSetOfNullableIntegers\"")
    if (nullableSetOfNullableIntegers.isDefined) require(nullableSetOfNullableIntegers.get ne null, "Null value was provided for property \"nullableSetOfNullableIntegers\"")
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(nullableSetOfNullableIntegers)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableIntegers") nullableSetOfNullableIntegers: Option[Set[Option[Int]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableIntegers") calculatedNullableSetOfNullableIntegers: Option[Set[Option[Int]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableIntegers") persistedNullableSetOfNullableIntegers: Option[Set[Option[Int]]]
  ) =
    this( nullableSetOfNullableIntegers = nullableSetOfNullableIntegers, calculatedNullableSetOfNullableIntegers = calculatedNullableSetOfNullableIntegers, persistedNullableSetOfNullableIntegers = persistedNullableSetOfNullableIntegers)

}
