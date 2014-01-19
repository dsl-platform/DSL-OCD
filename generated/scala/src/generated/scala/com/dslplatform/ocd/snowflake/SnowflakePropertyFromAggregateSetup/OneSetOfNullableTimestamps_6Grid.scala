package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfNullableTimestamps_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfNullableTimestamps: Set[Option[org.joda.time.DateTime]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableTimestamps") oneSetOfNullableTimestamps: Set[Option[org.joda.time.DateTime]]
  ) =
    this(URI = URI, oneSetOfNullableTimestamps = if (oneSetOfNullableTimestamps == null) Set.empty else oneSetOfNullableTimestamps)

}

object OneSetOfNullableTimestamps_6Grid
