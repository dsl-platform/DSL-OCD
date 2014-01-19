package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfNullableIntegers_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullableIntegers: Option[IndexedSeq[Option[Int]]] = None,
     calculatedNullableListOfNullableIntegers: Option[IndexedSeq[Option[Int]]] = None,
     persistedNullableListOfNullableIntegers: Option[IndexedSeq[Option[Int]]] = None
  ) {

    require(nullableListOfNullableIntegers ne null, "Null value was provided for property \"nullableListOfNullableIntegers\"")
    if (nullableListOfNullableIntegers.isDefined) require(nullableListOfNullableIntegers.get ne null, "Null value was provided for property \"nullableListOfNullableIntegers\"")
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(nullableListOfNullableIntegers)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableIntegers") nullableListOfNullableIntegers: Option[IndexedSeq[Option[Int]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableIntegers") calculatedNullableListOfNullableIntegers: Option[IndexedSeq[Option[Int]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableIntegers") persistedNullableListOfNullableIntegers: Option[IndexedSeq[Option[Int]]]
  ) =
    this( nullableListOfNullableIntegers = nullableListOfNullableIntegers, calculatedNullableListOfNullableIntegers = calculatedNullableListOfNullableIntegers, persistedNullableListOfNullableIntegers = persistedNullableListOfNullableIntegers)

}
