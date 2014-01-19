package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfNullableDoubles_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableDoubles: Option[Array[Option[Double]]] = None,
     calculatedNullableArrayOfNullableDoubles: Option[Array[Option[Double]]] = None,
     persistedNullableArrayOfNullableDoubles: Option[Array[Option[Double]]] = None
  ) {

    require(nullableArrayOfNullableDoubles ne null, "Null value was provided for property \"nullableArrayOfNullableDoubles\"")
    if (nullableArrayOfNullableDoubles.isDefined) require(nullableArrayOfNullableDoubles.get ne null, "Null value was provided for property \"nullableArrayOfNullableDoubles\"")
    com.dslplatform.api.Guards.checkArrayOptionValNulls(nullableArrayOfNullableDoubles)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableDoubles") nullableArrayOfNullableDoubles: Option[Array[Option[Double]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableDoubles") calculatedNullableArrayOfNullableDoubles: Option[Array[Option[Double]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableDoubles") persistedNullableArrayOfNullableDoubles: Option[Array[Option[Double]]]
  ) =
    this( nullableArrayOfNullableDoubles = nullableArrayOfNullableDoubles, calculatedNullableArrayOfNullableDoubles = calculatedNullableArrayOfNullableDoubles, persistedNullableArrayOfNullableDoubles = persistedNullableArrayOfNullableDoubles)

}
