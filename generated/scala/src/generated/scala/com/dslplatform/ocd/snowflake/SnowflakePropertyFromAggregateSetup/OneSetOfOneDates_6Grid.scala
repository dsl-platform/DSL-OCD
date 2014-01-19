package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfOneDates_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfOneDates: Set[org.joda.time.LocalDate]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneDates") oneSetOfOneDates: Set[org.joda.time.LocalDate]
  ) =
    this(URI = URI, oneSetOfOneDates = if (oneSetOfOneDates == null) Set.empty else oneSetOfOneDates)

}

object OneSetOfOneDates_6Grid
