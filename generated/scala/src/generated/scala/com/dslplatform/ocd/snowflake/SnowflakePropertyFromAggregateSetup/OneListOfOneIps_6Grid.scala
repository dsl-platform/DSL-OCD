package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfOneIps_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfOneIps: IndexedSeq[java.net.InetAddress]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneIps") oneListOfOneIps: IndexedSeq[java.net.InetAddress]
  ) =
    this(URI = URI, oneListOfOneIps = if (oneListOfOneIps == null) IndexedSeq.empty else oneListOfOneIps)

}

object OneListOfOneIps_6Grid
