package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneFloat_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneFloat: Float = 0.0f,
     calculatedOneFloat: Float = 0.0f,
     persistedOneFloat: Float = 0.0f
  ) {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneFloat") oneFloat: Float
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneFloat") calculatedOneFloat: Float
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneFloat") persistedOneFloat: Float
  ) =
    this( oneFloat = oneFloat, calculatedOneFloat = calculatedOneFloat, persistedOneFloat = persistedOneFloat)

}
