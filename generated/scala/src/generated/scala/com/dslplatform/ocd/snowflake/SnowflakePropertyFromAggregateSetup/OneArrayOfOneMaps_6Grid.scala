package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfOneMaps_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfOneMaps: Array[Map[String, String]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneMaps") oneArrayOfOneMaps: Array[Map[String, String]]
  ) =
    this(URI = URI, oneArrayOfOneMaps = if (oneArrayOfOneMaps == null) Array.empty else oneArrayOfOneMaps)

}

object OneArrayOfOneMaps_6Grid
