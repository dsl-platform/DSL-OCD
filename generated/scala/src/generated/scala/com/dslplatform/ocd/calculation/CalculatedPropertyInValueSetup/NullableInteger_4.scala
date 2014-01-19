package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableInteger_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableInteger: Option[Int] = None,
     calculatedNullableInteger: Option[Int] = None,
     persistedNullableInteger: Option[Int] = None
  ) {

    require(nullableInteger ne null, "Null value was provided for property \"nullableInteger\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableInteger") nullableInteger: Option[Int]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableInteger") calculatedNullableInteger: Option[Int]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableInteger") persistedNullableInteger: Option[Int]
  ) =
    this( nullableInteger = nullableInteger, calculatedNullableInteger = calculatedNullableInteger, persistedNullableInteger = persistedNullableInteger)

}
