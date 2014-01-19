package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfNullableFloats_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfNullableFloats: Array[Option[Float]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableFloats") oneArrayOfNullableFloats: Array[Option[Float]]
  ) =
    this(URI = URI, oneArrayOfNullableFloats = if (oneArrayOfNullableFloats == null) Array.empty else oneArrayOfNullableFloats)

}

object OneArrayOfNullableFloats_6Grid
