package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfOneIntegers_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfOneIntegers: Array[Int]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneIntegers") oneArrayOfOneIntegers: Array[Int]
  ) =
    this(URI = URI, oneArrayOfOneIntegers = if (oneArrayOfOneIntegers == null) Array.empty else oneArrayOfOneIntegers)

}

object OneArrayOfOneIntegers_6Grid
