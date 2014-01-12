package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableIpValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableIp: Option[java.net.InetAddress] = None
  ) {

    require(nullableIp ne null, "Null value was provided for property \"nullableIp\"")
    if (nullableIp.isDefined) require(nullableIp.get ne null, "Null value was provided for property \"nullableIp\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableIp") nullableIp: Option[java.net.InetAddress]
  ) =
    this( nullableIp = nullableIp)

}
