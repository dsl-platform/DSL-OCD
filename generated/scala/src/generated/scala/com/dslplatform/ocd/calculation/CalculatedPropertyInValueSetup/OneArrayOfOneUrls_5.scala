package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfOneUrls_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneUrls: Array[java.net.URI] = Array.empty,
     calculatedOneArrayOfOneUrls: Array[java.net.URI] = Array.empty,
     persistedOneArrayOfOneUrls: Array[java.net.URI] = Array.empty
  ) {

    require(oneArrayOfOneUrls ne null, "Null value was provided for property \"oneArrayOfOneUrls\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneUrls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneUrls") oneArrayOfOneUrls: Array[java.net.URI]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneUrls") calculatedOneArrayOfOneUrls: Array[java.net.URI]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneUrls") persistedOneArrayOfOneUrls: Array[java.net.URI]
  ) =
    this( oneArrayOfOneUrls = if (oneArrayOfOneUrls == null) Array.empty else oneArrayOfOneUrls, calculatedOneArrayOfOneUrls = calculatedOneArrayOfOneUrls, persistedOneArrayOfOneUrls = persistedOneArrayOfOneUrls)

}
