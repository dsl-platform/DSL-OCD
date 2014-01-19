package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneText_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneText: String
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneText") oneText: String
  ) =
    this(URI = URI, oneText = if (oneText == null) "" else oneText)

}

object OneText_6Grid
