package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneIp_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneIp: java.net.InetAddress
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneIp") oneIp: java.net.InetAddress
  ) =
    this(URI = URI, oneIp = if (oneIp == null) null else oneIp)

}

object OneIp_6Grid
