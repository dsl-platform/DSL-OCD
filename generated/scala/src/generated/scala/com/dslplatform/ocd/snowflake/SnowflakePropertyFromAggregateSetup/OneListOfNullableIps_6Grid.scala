package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfNullableIps_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfNullableIps: IndexedSeq[Option[java.net.InetAddress]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableIps") oneListOfNullableIps: IndexedSeq[Option[java.net.InetAddress]]
  ) =
    this(URI = URI, oneListOfNullableIps = if (oneListOfNullableIps == null) IndexedSeq.empty else oneListOfNullableIps)

}

object OneListOfNullableIps_6Grid
