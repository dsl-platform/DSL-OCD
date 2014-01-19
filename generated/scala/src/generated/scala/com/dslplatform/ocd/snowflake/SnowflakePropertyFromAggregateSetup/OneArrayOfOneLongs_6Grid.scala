package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfOneLongs_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfOneLongs: Array[Long]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneLongs") oneArrayOfOneLongs: Array[Long]
  ) =
    this(URI = URI, oneArrayOfOneLongs = if (oneArrayOfOneLongs == null) Array.empty else oneArrayOfOneLongs)

}

object OneArrayOfOneLongs_6Grid
