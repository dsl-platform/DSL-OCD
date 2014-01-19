package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneIp_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneIp: java.net.InetAddress = null,
     calculatedOneIp: java.net.InetAddress = null,
     persistedOneIp: java.net.InetAddress = null
  ) {

    require(oneIp ne null, "Null value was provided for property \"oneIp\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneIp") oneIp: java.net.InetAddress
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneIp") calculatedOneIp: java.net.InetAddress
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneIp") persistedOneIp: java.net.InetAddress
  ) =
    this( oneIp = if (oneIp == null) null else oneIp, calculatedOneIp = if (calculatedOneIp == null) null else calculatedOneIp, persistedOneIp = if (persistedOneIp == null) null else persistedOneIp)

}
