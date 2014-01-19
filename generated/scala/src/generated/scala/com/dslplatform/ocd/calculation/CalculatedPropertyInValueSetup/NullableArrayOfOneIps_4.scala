package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfOneIps_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneIps: Option[Array[java.net.InetAddress]] = None,
     calculatedNullableArrayOfOneIps: Option[Array[java.net.InetAddress]] = None,
     persistedNullableArrayOfOneIps: Option[Array[java.net.InetAddress]] = None
  ) {

    require(nullableArrayOfOneIps ne null, "Null value was provided for property \"nullableArrayOfOneIps\"")
    if (nullableArrayOfOneIps.isDefined) require(nullableArrayOfOneIps.get ne null, "Null value was provided for property \"nullableArrayOfOneIps\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneIps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneIps") nullableArrayOfOneIps: Option[Array[java.net.InetAddress]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneIps") calculatedNullableArrayOfOneIps: Option[Array[java.net.InetAddress]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneIps") persistedNullableArrayOfOneIps: Option[Array[java.net.InetAddress]]
  ) =
    this( nullableArrayOfOneIps = nullableArrayOfOneIps, calculatedNullableArrayOfOneIps = calculatedNullableArrayOfOneIps, persistedNullableArrayOfOneIps = persistedNullableArrayOfOneIps)

}
