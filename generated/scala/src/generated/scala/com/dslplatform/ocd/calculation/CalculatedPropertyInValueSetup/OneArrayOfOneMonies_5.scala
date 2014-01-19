package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfOneMonies_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneMonies: Array[BigDecimal] = Array.empty,
     calculatedOneArrayOfOneMonies: Array[BigDecimal] = Array.empty,
     persistedOneArrayOfOneMonies: Array[BigDecimal] = Array.empty
  ) {

    require(oneArrayOfOneMonies ne null, "Null value was provided for property \"oneArrayOfOneMonies\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneMonies)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneMonies") oneArrayOfOneMonies: Array[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneMonies") calculatedOneArrayOfOneMonies: Array[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneMonies") persistedOneArrayOfOneMonies: Array[BigDecimal]
  ) =
    this( oneArrayOfOneMonies = if (oneArrayOfOneMonies == null) Array.empty else oneArrayOfOneMonies, calculatedOneArrayOfOneMonies = calculatedOneArrayOfOneMonies, persistedOneArrayOfOneMonies = persistedOneArrayOfOneMonies)

}
