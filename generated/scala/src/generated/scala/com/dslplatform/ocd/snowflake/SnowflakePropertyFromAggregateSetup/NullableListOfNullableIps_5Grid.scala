package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableListOfNullableIps_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableListOfNullableIps: Option[IndexedSeq[Option[java.net.InetAddress]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableIps") nullableListOfNullableIps: Option[IndexedSeq[Option[java.net.InetAddress]]]
  ) =
    this(URI = URI, nullableListOfNullableIps = nullableListOfNullableIps)

}

object NullableListOfNullableIps_5Grid
