package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfOneDoubles_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneDoubles: Option[Array[Double]] = None,
     calculatedNullableArrayOfOneDoubles: Option[Array[Double]] = None,
     persistedNullableArrayOfOneDoubles: Option[Array[Double]] = None
  ) {

    require(nullableArrayOfOneDoubles ne null, "Null value was provided for property \"nullableArrayOfOneDoubles\"")
    if (nullableArrayOfOneDoubles.isDefined) require(nullableArrayOfOneDoubles.get ne null, "Null value was provided for property \"nullableArrayOfOneDoubles\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneDoubles") nullableArrayOfOneDoubles: Option[Array[Double]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneDoubles") calculatedNullableArrayOfOneDoubles: Option[Array[Double]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneDoubles") persistedNullableArrayOfOneDoubles: Option[Array[Double]]
  ) =
    this( nullableArrayOfOneDoubles = nullableArrayOfOneDoubles, calculatedNullableArrayOfOneDoubles = calculatedNullableArrayOfOneDoubles, persistedNullableArrayOfOneDoubles = persistedNullableArrayOfOneDoubles)

}
