package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfOneTimestamps_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfOneTimestamps: Array[org.joda.time.DateTime]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneTimestamps") oneArrayOfOneTimestamps: Array[org.joda.time.DateTime]
  ) =
    this(URI = URI, oneArrayOfOneTimestamps = if (oneArrayOfOneTimestamps == null) Array.empty else oneArrayOfOneTimestamps)

}

object OneArrayOfOneTimestamps_6Grid
