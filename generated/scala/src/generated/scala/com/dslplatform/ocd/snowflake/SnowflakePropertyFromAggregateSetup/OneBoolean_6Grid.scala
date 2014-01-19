package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneBoolean_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneBoolean: Boolean
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneBoolean") oneBoolean: Boolean
  ) =
    this(URI = URI, oneBoolean = oneBoolean)

}

object OneBoolean_6Grid
