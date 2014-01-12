package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableArrayOfNullableIpsValue6 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableIps: Option[Array[Option[java.net.InetAddress]]] = None
  ) {

    require(nullableArrayOfNullableIps ne null, "Null value was provided for property \"nullableArrayOfNullableIps\"")
    if (nullableArrayOfNullableIps.isDefined) require(nullableArrayOfNullableIps.get ne null, "Null value was provided for property \"nullableArrayOfNullableIps\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableIps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableIps") nullableArrayOfNullableIps: Option[Array[Option[java.net.InetAddress]]]
  ) =
    this( nullableArrayOfNullableIps = nullableArrayOfNullableIps)

}
