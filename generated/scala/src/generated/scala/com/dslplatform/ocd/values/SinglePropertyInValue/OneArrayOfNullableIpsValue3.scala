package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfNullableIpsValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableIps: Array[Option[java.net.InetAddress]] = Array.empty
  ) {

    require(oneArrayOfNullableIps ne null, "Null value was provided for property \"oneArrayOfNullableIps\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableIps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableIps") oneArrayOfNullableIps: Array[Option[java.net.InetAddress]]
  ) =
    this( oneArrayOfNullableIps = if (oneArrayOfNullableIps == null) Array.empty else oneArrayOfNullableIps)

}
