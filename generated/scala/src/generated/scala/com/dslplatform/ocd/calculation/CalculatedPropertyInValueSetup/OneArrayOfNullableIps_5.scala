package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfNullableIps_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableIps: Array[Option[java.net.InetAddress]] = Array.empty,
     calculatedOneArrayOfNullableIps: Array[Option[java.net.InetAddress]] = Array.empty,
     persistedOneArrayOfNullableIps: Array[Option[java.net.InetAddress]] = Array.empty
  ) {

    require(oneArrayOfNullableIps ne null, "Null value was provided for property \"oneArrayOfNullableIps\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableIps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableIps") oneArrayOfNullableIps: Array[Option[java.net.InetAddress]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableIps") calculatedOneArrayOfNullableIps: Array[Option[java.net.InetAddress]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableIps") persistedOneArrayOfNullableIps: Array[Option[java.net.InetAddress]]
  ) =
    this( oneArrayOfNullableIps = if (oneArrayOfNullableIps == null) Array.empty else oneArrayOfNullableIps, calculatedOneArrayOfNullableIps = calculatedOneArrayOfNullableIps, persistedOneArrayOfNullableIps = persistedOneArrayOfNullableIps)

}
