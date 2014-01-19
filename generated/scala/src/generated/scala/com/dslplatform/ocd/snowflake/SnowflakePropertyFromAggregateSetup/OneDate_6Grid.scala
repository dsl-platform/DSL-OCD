package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneDate_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneDate: org.joda.time.LocalDate
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneDate") oneDate: org.joda.time.LocalDate
  ) =
    this(URI = URI, oneDate = if (oneDate == null) org.joda.time.LocalDate.now else oneDate)

}

object OneDate_6Grid
