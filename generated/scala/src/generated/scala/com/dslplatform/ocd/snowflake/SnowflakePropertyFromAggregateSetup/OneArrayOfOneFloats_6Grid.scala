package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfOneFloats_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfOneFloats: Array[Float]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneFloats") oneArrayOfOneFloats: Array[Float]
  ) =
    this(URI = URI, oneArrayOfOneFloats = if (oneArrayOfOneFloats == null) Array.empty else oneArrayOfOneFloats)

}

object OneArrayOfOneFloats_6Grid
