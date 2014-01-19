package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableFloat_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableFloat: Option[Float] = None,
     calculatedNullableFloat: Option[Float] = None,
     persistedNullableFloat: Option[Float] = None
  ) {

    require(nullableFloat ne null, "Null value was provided for property \"nullableFloat\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableFloat") nullableFloat: Option[Float]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableFloat") calculatedNullableFloat: Option[Float]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableFloat") persistedNullableFloat: Option[Float]
  ) =
    this( nullableFloat = nullableFloat, calculatedNullableFloat = calculatedNullableFloat, persistedNullableFloat = persistedNullableFloat)

}
