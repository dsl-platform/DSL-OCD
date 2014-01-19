package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfOneBooleans_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfOneBooleans: Array[Boolean]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneBooleans") oneArrayOfOneBooleans: Array[Boolean]
  ) =
    this(URI = URI, oneArrayOfOneBooleans = if (oneArrayOfOneBooleans == null) Array.empty else oneArrayOfOneBooleans)

}

object OneArrayOfOneBooleans_6Grid
