package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneLong_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneLong: Long = 0,
     calculatedOneLong: Long = 0,
     persistedOneLong: Long = 0
  ) {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneLong") oneLong: Long
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneLong") calculatedOneLong: Long
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneLong") persistedOneLong: Long
  ) =
    this( oneLong = oneLong, calculatedOneLong = calculatedOneLong, persistedOneLong = persistedOneLong)

}
