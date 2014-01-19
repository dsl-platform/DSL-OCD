package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneUrl_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneUrl: java.net.URI = null,
     calculatedOneUrl: java.net.URI = null,
     persistedOneUrl: java.net.URI = null
  ) {

    require(oneUrl ne null, "Null value was provided for property \"oneUrl\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneUrl") oneUrl: java.net.URI
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneUrl") calculatedOneUrl: java.net.URI
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneUrl") persistedOneUrl: java.net.URI
  ) =
    this( oneUrl = if (oneUrl == null) null else oneUrl, calculatedOneUrl = if (calculatedOneUrl == null) null else calculatedOneUrl, persistedOneUrl = if (persistedOneUrl == null) null else persistedOneUrl)

}
