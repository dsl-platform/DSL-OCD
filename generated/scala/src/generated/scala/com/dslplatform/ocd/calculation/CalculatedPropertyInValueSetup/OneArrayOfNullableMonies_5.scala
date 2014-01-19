package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfNullableMonies_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableMonies: Array[Option[BigDecimal]] = Array.empty,
     calculatedOneArrayOfNullableMonies: Array[Option[BigDecimal]] = Array.empty,
     persistedOneArrayOfNullableMonies: Array[Option[BigDecimal]] = Array.empty
  ) {

    require(oneArrayOfNullableMonies ne null, "Null value was provided for property \"oneArrayOfNullableMonies\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableMonies)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableMonies") oneArrayOfNullableMonies: Array[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableMonies") calculatedOneArrayOfNullableMonies: Array[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableMonies") persistedOneArrayOfNullableMonies: Array[Option[BigDecimal]]
  ) =
    this( oneArrayOfNullableMonies = if (oneArrayOfNullableMonies == null) Array.empty else oneArrayOfNullableMonies, calculatedOneArrayOfNullableMonies = calculatedOneArrayOfNullableMonies, persistedOneArrayOfNullableMonies = persistedOneArrayOfNullableMonies)

}
