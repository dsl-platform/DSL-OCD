package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneDouble_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneDouble: Double = 0,
     calculatedOneDouble: Double = 0,
     persistedOneDouble: Double = 0
  ) {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneDouble") oneDouble: Double
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneDouble") calculatedOneDouble: Double
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneDouble") persistedOneDouble: Double
  ) =
    this( oneDouble = oneDouble, calculatedOneDouble = calculatedOneDouble, persistedOneDouble = persistedOneDouble)

}
