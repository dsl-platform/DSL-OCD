package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfOneIps_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneIps: Option[Set[java.net.InetAddress]] = None,
     calculatedNullableSetOfOneIps: Option[Set[java.net.InetAddress]] = None,
     persistedNullableSetOfOneIps: Option[Set[java.net.InetAddress]] = None
  ) {

    require(nullableSetOfOneIps ne null, "Null value was provided for property \"nullableSetOfOneIps\"")
    if (nullableSetOfOneIps.isDefined) require(nullableSetOfOneIps.get ne null, "Null value was provided for property \"nullableSetOfOneIps\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneIps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneIps") nullableSetOfOneIps: Option[Set[java.net.InetAddress]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneIps") calculatedNullableSetOfOneIps: Option[Set[java.net.InetAddress]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneIps") persistedNullableSetOfOneIps: Option[Set[java.net.InetAddress]]
  ) =
    this( nullableSetOfOneIps = nullableSetOfOneIps, calculatedNullableSetOfOneIps = calculatedNullableSetOfOneIps, persistedNullableSetOfOneIps = persistedNullableSetOfOneIps)

}
