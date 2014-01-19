package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfOneDates_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfOneDates: IndexedSeq[org.joda.time.LocalDate]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneDates") oneListOfOneDates: IndexedSeq[org.joda.time.LocalDate]
  ) =
    this(URI = URI, oneListOfOneDates = if (oneListOfOneDates == null) IndexedSeq.empty else oneListOfOneDates)

}

object OneListOfOneDates_6Grid
