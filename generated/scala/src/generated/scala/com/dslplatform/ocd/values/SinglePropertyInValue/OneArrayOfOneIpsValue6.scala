package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfOneIpsValue6 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneIps: Array[java.net.InetAddress] = Array.empty
  ) {

    require(oneArrayOfOneIps ne null, "Null value was provided for property \"oneArrayOfOneIps\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneIps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneIps") oneArrayOfOneIps: Array[java.net.InetAddress]
  ) =
    this( oneArrayOfOneIps = if (oneArrayOfOneIps == null) Array.empty else oneArrayOfOneIps)

}
