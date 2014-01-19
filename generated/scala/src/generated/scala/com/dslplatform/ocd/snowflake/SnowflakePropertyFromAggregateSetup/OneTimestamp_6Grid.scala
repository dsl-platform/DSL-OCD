package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneTimestamp_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneTimestamp: org.joda.time.DateTime
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneTimestamp") oneTimestamp: org.joda.time.DateTime
  ) =
    this(URI = URI, oneTimestamp = if (oneTimestamp == null) org.joda.time.DateTime.now else oneTimestamp)

}

object OneTimestamp_6Grid
