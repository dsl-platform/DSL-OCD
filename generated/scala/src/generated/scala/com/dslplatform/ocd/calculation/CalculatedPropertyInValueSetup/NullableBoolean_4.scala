package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableBoolean_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableBoolean: Option[Boolean] = None,
     calculatedNullableBoolean: Option[Boolean] = None,
     persistedNullableBoolean: Option[Boolean] = None
  ) {

    require(nullableBoolean ne null, "Null value was provided for property \"nullableBoolean\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableBoolean") nullableBoolean: Option[Boolean]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableBoolean") calculatedNullableBoolean: Option[Boolean]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableBoolean") persistedNullableBoolean: Option[Boolean]
  ) =
    this( nullableBoolean = nullableBoolean, calculatedNullableBoolean = calculatedNullableBoolean, persistedNullableBoolean = persistedNullableBoolean)

}
