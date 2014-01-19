package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfOneIps_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneIps: Array[java.net.InetAddress] = Array.empty,
     calculatedOneArrayOfOneIps: Array[java.net.InetAddress] = Array.empty,
     persistedOneArrayOfOneIps: Array[java.net.InetAddress] = Array.empty
  ) {

    require(oneArrayOfOneIps ne null, "Null value was provided for property \"oneArrayOfOneIps\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneIps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneIps") oneArrayOfOneIps: Array[java.net.InetAddress]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneIps") calculatedOneArrayOfOneIps: Array[java.net.InetAddress]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneIps") persistedOneArrayOfOneIps: Array[java.net.InetAddress]
  ) =
    this( oneArrayOfOneIps = if (oneArrayOfOneIps == null) Array.empty else oneArrayOfOneIps, calculatedOneArrayOfOneIps = calculatedOneArrayOfOneIps, persistedOneArrayOfOneIps = persistedOneArrayOfOneIps)

}
