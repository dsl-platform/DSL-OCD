package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableSetOfNullableIps_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableSetOfNullableIps: Option[Set[Option[java.net.InetAddress]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableIps") nullableSetOfNullableIps: Option[Set[Option[java.net.InetAddress]]]
  ) =
    this(URI = URI, nullableSetOfNullableIps = nullableSetOfNullableIps)

}

object NullableSetOfNullableIps_5Grid
