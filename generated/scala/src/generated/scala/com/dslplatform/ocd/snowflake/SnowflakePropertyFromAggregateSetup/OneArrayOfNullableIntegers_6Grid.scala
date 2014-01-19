package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfNullableIntegers_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfNullableIntegers: Array[Option[Int]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableIntegers") oneArrayOfNullableIntegers: Array[Option[Int]]
  ) =
    this(URI = URI, oneArrayOfNullableIntegers = if (oneArrayOfNullableIntegers == null) Array.empty else oneArrayOfNullableIntegers)

}

object OneArrayOfNullableIntegers_6Grid
