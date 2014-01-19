package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneInteger_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneInteger: Int = 0,
     calculatedOneInteger: Int = 0,
     persistedOneInteger: Int = 0
  ) {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneInteger") oneInteger: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneInteger") calculatedOneInteger: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneInteger") persistedOneInteger: Int
  ) =
    this( oneInteger = oneInteger, calculatedOneInteger = calculatedOneInteger, persistedOneInteger = persistedOneInteger)

}
