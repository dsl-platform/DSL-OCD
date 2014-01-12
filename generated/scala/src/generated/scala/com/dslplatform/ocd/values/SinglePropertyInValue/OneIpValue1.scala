package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneIpValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneIp: java.net.InetAddress = null
  ) {

    require(oneIp ne null, "Null value was provided for property \"oneIp\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneIp") oneIp: java.net.InetAddress
  ) =
    this( oneIp = if (oneIp == null) null else oneIp)

}
