package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneLong_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneLong: Long
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneLong") oneLong: Long
  ) =
    this(URI = URI, oneLong = oneLong)

}

object OneLong_6Grid
