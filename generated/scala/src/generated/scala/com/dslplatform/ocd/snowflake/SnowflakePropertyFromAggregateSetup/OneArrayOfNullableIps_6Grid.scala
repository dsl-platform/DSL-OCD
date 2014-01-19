package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfNullableIps_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfNullableIps: Array[Option[java.net.InetAddress]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableIps") oneArrayOfNullableIps: Array[Option[java.net.InetAddress]]
  ) =
    this(URI = URI, oneArrayOfNullableIps = if (oneArrayOfNullableIps == null) Array.empty else oneArrayOfNullableIps)

}

object OneArrayOfNullableIps_6Grid
