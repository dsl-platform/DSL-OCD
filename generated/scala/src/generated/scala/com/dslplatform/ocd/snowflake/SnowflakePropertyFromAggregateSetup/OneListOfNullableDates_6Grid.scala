package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfNullableDates_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfNullableDates: IndexedSeq[Option[org.joda.time.LocalDate]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableDates") oneListOfNullableDates: IndexedSeq[Option[org.joda.time.LocalDate]]
  ) =
    this(URI = URI, oneListOfNullableDates = if (oneListOfNullableDates == null) IndexedSeq.empty else oneListOfNullableDates)

}

object OneListOfNullableDates_6Grid
