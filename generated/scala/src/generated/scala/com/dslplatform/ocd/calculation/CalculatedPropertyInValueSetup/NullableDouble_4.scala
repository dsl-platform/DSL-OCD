package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableDouble_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableDouble: Option[Double] = None,
     calculatedNullableDouble: Option[Double] = None,
     persistedNullableDouble: Option[Double] = None
  ) {

    require(nullableDouble ne null, "Null value was provided for property \"nullableDouble\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableDouble") nullableDouble: Option[Double]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableDouble") calculatedNullableDouble: Option[Double]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableDouble") persistedNullableDouble: Option[Double]
  ) =
    this( nullableDouble = nullableDouble, calculatedNullableDouble = calculatedNullableDouble, persistedNullableDouble = persistedNullableDouble)

}
