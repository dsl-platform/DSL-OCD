package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfNullableTimestamps_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfNullableTimestamps: Array[Option[org.joda.time.DateTime]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableTimestamps") oneArrayOfNullableTimestamps: Array[Option[org.joda.time.DateTime]]
  ) =
    this(URI = URI, oneArrayOfNullableTimestamps = if (oneArrayOfNullableTimestamps == null) Array.empty else oneArrayOfNullableTimestamps)

}

object OneArrayOfNullableTimestamps_6Grid
