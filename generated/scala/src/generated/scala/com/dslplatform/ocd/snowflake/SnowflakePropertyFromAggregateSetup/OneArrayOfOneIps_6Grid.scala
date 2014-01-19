package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfOneIps_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfOneIps: Array[java.net.InetAddress]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneIps") oneArrayOfOneIps: Array[java.net.InetAddress]
  ) =
    this(URI = URI, oneArrayOfOneIps = if (oneArrayOfOneIps == null) Array.empty else oneArrayOfOneIps)

}

object OneArrayOfOneIps_6Grid
