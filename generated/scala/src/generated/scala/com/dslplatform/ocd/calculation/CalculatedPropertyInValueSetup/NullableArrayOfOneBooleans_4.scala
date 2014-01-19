package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfOneBooleans_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneBooleans: Option[Array[Boolean]] = None,
     calculatedNullableArrayOfOneBooleans: Option[Array[Boolean]] = None,
     persistedNullableArrayOfOneBooleans: Option[Array[Boolean]] = None
  ) {

    require(nullableArrayOfOneBooleans ne null, "Null value was provided for property \"nullableArrayOfOneBooleans\"")
    if (nullableArrayOfOneBooleans.isDefined) require(nullableArrayOfOneBooleans.get ne null, "Null value was provided for property \"nullableArrayOfOneBooleans\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneBooleans") nullableArrayOfOneBooleans: Option[Array[Boolean]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneBooleans") calculatedNullableArrayOfOneBooleans: Option[Array[Boolean]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneBooleans") persistedNullableArrayOfOneBooleans: Option[Array[Boolean]]
  ) =
    this( nullableArrayOfOneBooleans = nullableArrayOfOneBooleans, calculatedNullableArrayOfOneBooleans = calculatedNullableArrayOfOneBooleans, persistedNullableArrayOfOneBooleans = persistedNullableArrayOfOneBooleans)

}
