package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfOneDates_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfOneDates: Array[org.joda.time.LocalDate]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneDates") oneArrayOfOneDates: Array[org.joda.time.LocalDate]
  ) =
    this(URI = URI, oneArrayOfOneDates = if (oneArrayOfOneDates == null) Array.empty else oneArrayOfOneDates)

}

object OneArrayOfOneDates_6Grid
