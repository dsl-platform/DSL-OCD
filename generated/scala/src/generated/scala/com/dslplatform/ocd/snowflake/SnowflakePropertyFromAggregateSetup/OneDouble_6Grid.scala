package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneDouble_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneDouble: Double
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneDouble") oneDouble: Double
  ) =
    this(URI = URI, oneDouble = oneDouble)

}

object OneDouble_6Grid
