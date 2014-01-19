package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfNullableBooleans_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfNullableBooleans: Array[Option[Boolean]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableBooleans") oneArrayOfNullableBooleans: Array[Option[Boolean]]
  ) =
    this(URI = URI, oneArrayOfNullableBooleans = if (oneArrayOfNullableBooleans == null) Array.empty else oneArrayOfNullableBooleans)

}

object OneArrayOfNullableBooleans_6Grid
