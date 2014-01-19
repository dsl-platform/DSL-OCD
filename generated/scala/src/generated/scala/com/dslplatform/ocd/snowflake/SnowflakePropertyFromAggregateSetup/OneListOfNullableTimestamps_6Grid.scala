package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfNullableTimestamps_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfNullableTimestamps: IndexedSeq[Option[org.joda.time.DateTime]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableTimestamps") oneListOfNullableTimestamps: IndexedSeq[Option[org.joda.time.DateTime]]
  ) =
    this(URI = URI, oneListOfNullableTimestamps = if (oneListOfNullableTimestamps == null) IndexedSeq.empty else oneListOfNullableTimestamps)

}

object OneListOfNullableTimestamps_6Grid
