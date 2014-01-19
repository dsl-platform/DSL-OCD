package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableListOfNullableDates_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableListOfNullableDates: Option[IndexedSeq[Option[org.joda.time.LocalDate]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableDates") nullableListOfNullableDates: Option[IndexedSeq[Option[org.joda.time.LocalDate]]]
  ) =
    this(URI = URI, nullableListOfNullableDates = nullableListOfNullableDates)

}

object NullableListOfNullableDates_5Grid
