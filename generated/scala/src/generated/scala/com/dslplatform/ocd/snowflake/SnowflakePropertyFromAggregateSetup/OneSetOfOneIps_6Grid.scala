package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfOneIps_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfOneIps: Set[java.net.InetAddress]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneIps") oneSetOfOneIps: Set[java.net.InetAddress]
  ) =
    this(URI = URI, oneSetOfOneIps = if (oneSetOfOneIps == null) Set.empty else oneSetOfOneIps)

}

object OneSetOfOneIps_6Grid
