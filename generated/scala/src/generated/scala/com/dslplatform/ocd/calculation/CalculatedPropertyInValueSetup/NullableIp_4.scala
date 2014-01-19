package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableIp_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableIp: Option[java.net.InetAddress] = None,
     calculatedNullableIp: Option[java.net.InetAddress] = None,
     persistedNullableIp: Option[java.net.InetAddress] = None
  ) {

    require(nullableIp ne null, "Null value was provided for property \"nullableIp\"")
    if (nullableIp.isDefined) require(nullableIp.get ne null, "Null value was provided for property \"nullableIp\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableIp") nullableIp: Option[java.net.InetAddress]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableIp") calculatedNullableIp: Option[java.net.InetAddress]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableIp") persistedNullableIp: Option[java.net.InetAddress]
  ) =
    this( nullableIp = nullableIp, calculatedNullableIp = calculatedNullableIp, persistedNullableIp = persistedNullableIp)

}
