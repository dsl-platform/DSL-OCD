package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableSetOfNullableTimestamps_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableSetOfNullableTimestamps: Option[Set[Option[org.joda.time.DateTime]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableTimestamps") nullableSetOfNullableTimestamps: Option[Set[Option[org.joda.time.DateTime]]]
  ) =
    this(URI = URI, nullableSetOfNullableTimestamps = nullableSetOfNullableTimestamps)

}

object NullableSetOfNullableTimestamps_5Grid
