package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfNullableIps_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfNullableIps: Set[Option[java.net.InetAddress]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableIps") oneSetOfNullableIps: Set[Option[java.net.InetAddress]]
  ) =
    this(URI = URI, oneSetOfNullableIps = if (oneSetOfNullableIps == null) Set.empty else oneSetOfNullableIps)

}

object OneSetOfNullableIps_6Grid
