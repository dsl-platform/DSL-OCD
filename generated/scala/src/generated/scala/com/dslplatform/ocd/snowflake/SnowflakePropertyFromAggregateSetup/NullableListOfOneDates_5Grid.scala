package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableListOfOneDates_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableListOfOneDates: Option[IndexedSeq[org.joda.time.LocalDate]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneDates") nullableListOfOneDates: Option[IndexedSeq[org.joda.time.LocalDate]]
  ) =
    this(URI = URI, nullableListOfOneDates = nullableListOfOneDates)

}

object NullableListOfOneDates_5Grid
