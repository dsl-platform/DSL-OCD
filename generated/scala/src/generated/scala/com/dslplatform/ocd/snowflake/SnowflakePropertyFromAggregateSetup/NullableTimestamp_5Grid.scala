package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableTimestamp_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableTimestamp: Option[org.joda.time.DateTime]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableTimestamp") nullableTimestamp: Option[org.joda.time.DateTime]
  ) =
    this(URI = URI, nullableTimestamp = nullableTimestamp)

}

object NullableTimestamp_5Grid
