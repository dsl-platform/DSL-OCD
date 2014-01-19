package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneBoolean_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneBoolean: Boolean = false,
     calculatedOneBoolean: Boolean = false,
     persistedOneBoolean: Boolean = false
  ) {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneBoolean") oneBoolean: Boolean
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneBoolean") calculatedOneBoolean: Boolean
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneBoolean") persistedOneBoolean: Boolean
  ) =
    this( oneBoolean = oneBoolean, calculatedOneBoolean = calculatedOneBoolean, persistedOneBoolean = persistedOneBoolean)

}
