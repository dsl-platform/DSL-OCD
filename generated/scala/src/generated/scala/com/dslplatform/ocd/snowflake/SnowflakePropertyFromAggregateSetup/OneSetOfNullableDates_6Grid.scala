package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfNullableDates_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfNullableDates: Set[Option[org.joda.time.LocalDate]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableDates") oneSetOfNullableDates: Set[Option[org.joda.time.LocalDate]]
  ) =
    this(URI = URI, oneSetOfNullableDates = if (oneSetOfNullableDates == null) Set.empty else oneSetOfNullableDates)

}

object OneSetOfNullableDates_6Grid
