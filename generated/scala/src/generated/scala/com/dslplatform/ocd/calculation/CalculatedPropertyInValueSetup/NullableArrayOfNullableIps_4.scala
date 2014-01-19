package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfNullableIps_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableIps: Option[Array[Option[java.net.InetAddress]]] = None,
     calculatedNullableArrayOfNullableIps: Option[Array[Option[java.net.InetAddress]]] = None,
     persistedNullableArrayOfNullableIps: Option[Array[Option[java.net.InetAddress]]] = None
  ) {

    require(nullableArrayOfNullableIps ne null, "Null value was provided for property \"nullableArrayOfNullableIps\"")
    if (nullableArrayOfNullableIps.isDefined) require(nullableArrayOfNullableIps.get ne null, "Null value was provided for property \"nullableArrayOfNullableIps\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableIps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableIps") nullableArrayOfNullableIps: Option[Array[Option[java.net.InetAddress]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableIps") calculatedNullableArrayOfNullableIps: Option[Array[Option[java.net.InetAddress]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableIps") persistedNullableArrayOfNullableIps: Option[Array[Option[java.net.InetAddress]]]
  ) =
    this( nullableArrayOfNullableIps = nullableArrayOfNullableIps, calculatedNullableArrayOfNullableIps = calculatedNullableArrayOfNullableIps, persistedNullableArrayOfNullableIps = persistedNullableArrayOfNullableIps)

}
