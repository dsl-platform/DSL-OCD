package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableArrayOfOneIpsValue4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneIps: Option[Array[java.net.InetAddress]] = None
  ) {

    require(nullableArrayOfOneIps ne null, "Null value was provided for property \"nullableArrayOfOneIps\"")
    if (nullableArrayOfOneIps.isDefined) require(nullableArrayOfOneIps.get ne null, "Null value was provided for property \"nullableArrayOfOneIps\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneIps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneIps") nullableArrayOfOneIps: Option[Array[java.net.InetAddress]]
  ) =
    this( nullableArrayOfOneIps = nullableArrayOfOneIps)

}
