package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfOneIps_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneIps: Set[java.net.InetAddress] = Set.empty,
     calculatedOneSetOfOneIps: Set[java.net.InetAddress] = Set.empty,
     persistedOneSetOfOneIps: Set[java.net.InetAddress] = Set.empty
  ) {

    require(oneSetOfOneIps ne null, "Null value was provided for property \"oneSetOfOneIps\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneIps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneIps") oneSetOfOneIps: Set[java.net.InetAddress]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneIps") calculatedOneSetOfOneIps: Set[java.net.InetAddress]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneIps") persistedOneSetOfOneIps: Set[java.net.InetAddress]
  ) =
    this( oneSetOfOneIps = if (oneSetOfOneIps == null) Set.empty else oneSetOfOneIps, calculatedOneSetOfOneIps = calculatedOneSetOfOneIps, persistedOneSetOfOneIps = persistedOneSetOfOneIps)

}
