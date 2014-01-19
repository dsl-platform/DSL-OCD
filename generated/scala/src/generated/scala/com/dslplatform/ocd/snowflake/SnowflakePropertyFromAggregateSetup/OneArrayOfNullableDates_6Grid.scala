package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfNullableDates_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfNullableDates: Array[Option[org.joda.time.LocalDate]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableDates") oneArrayOfNullableDates: Array[Option[org.joda.time.LocalDate]]
  ) =
    this(URI = URI, oneArrayOfNullableDates = if (oneArrayOfNullableDates == null) Array.empty else oneArrayOfNullableDates)

}

object OneArrayOfNullableDates_6Grid
