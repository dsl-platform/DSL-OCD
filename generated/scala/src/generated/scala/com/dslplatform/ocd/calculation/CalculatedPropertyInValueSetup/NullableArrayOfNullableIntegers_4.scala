package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfNullableIntegers_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableIntegers: Option[Array[Option[Int]]] = None,
     calculatedNullableArrayOfNullableIntegers: Option[Array[Option[Int]]] = None,
     persistedNullableArrayOfNullableIntegers: Option[Array[Option[Int]]] = None
  ) {

    require(nullableArrayOfNullableIntegers ne null, "Null value was provided for property \"nullableArrayOfNullableIntegers\"")
    if (nullableArrayOfNullableIntegers.isDefined) require(nullableArrayOfNullableIntegers.get ne null, "Null value was provided for property \"nullableArrayOfNullableIntegers\"")
    com.dslplatform.api.Guards.checkArrayOptionValNulls(nullableArrayOfNullableIntegers)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableIntegers") nullableArrayOfNullableIntegers: Option[Array[Option[Int]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableIntegers") calculatedNullableArrayOfNullableIntegers: Option[Array[Option[Int]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableIntegers") persistedNullableArrayOfNullableIntegers: Option[Array[Option[Int]]]
  ) =
    this( nullableArrayOfNullableIntegers = nullableArrayOfNullableIntegers, calculatedNullableArrayOfNullableIntegers = calculatedNullableArrayOfNullableIntegers, persistedNullableArrayOfNullableIntegers = persistedNullableArrayOfNullableIntegers)

}
