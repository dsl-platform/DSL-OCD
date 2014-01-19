package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableDecimal_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableDecimal: Option[BigDecimal] = None,
     calculatedNullableDecimal: Option[BigDecimal] = None,
     persistedNullableDecimal: Option[BigDecimal] = None
  ) {

    require(nullableDecimal ne null, "Null value was provided for property \"nullableDecimal\"")
    if (nullableDecimal.isDefined) require(nullableDecimal.get ne null, "Null value was provided for property \"nullableDecimal\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableDecimal") nullableDecimal: Option[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableDecimal") calculatedNullableDecimal: Option[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableDecimal") persistedNullableDecimal: Option[BigDecimal]
  ) =
    this( nullableDecimal = nullableDecimal, calculatedNullableDecimal = calculatedNullableDecimal, persistedNullableDecimal = persistedNullableDecimal)

}
