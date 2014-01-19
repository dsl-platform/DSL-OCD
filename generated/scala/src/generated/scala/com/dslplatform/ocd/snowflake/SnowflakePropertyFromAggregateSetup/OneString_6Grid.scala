package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneString_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneString: String
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneString") oneString: String
  ) =
    this(URI = URI, oneString = if (oneString == null) "" else oneString)

}

object OneString_6Grid
