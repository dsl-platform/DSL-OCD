package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneFloat_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneFloat: Float
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneFloat") oneFloat: Float
  ) =
    this(URI = URI, oneFloat = oneFloat)

}

object OneFloat_6Grid
