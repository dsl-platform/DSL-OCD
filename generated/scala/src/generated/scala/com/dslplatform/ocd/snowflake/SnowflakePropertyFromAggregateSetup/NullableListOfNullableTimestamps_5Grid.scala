package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableListOfNullableTimestamps_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableListOfNullableTimestamps: Option[IndexedSeq[Option[org.joda.time.DateTime]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableTimestamps") nullableListOfNullableTimestamps: Option[IndexedSeq[Option[org.joda.time.DateTime]]]
  ) =
    this(URI = URI, nullableListOfNullableTimestamps = nullableListOfNullableTimestamps)

}

object NullableListOfNullableTimestamps_5Grid
