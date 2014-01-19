package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfNullableMaps_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfNullableMaps: Array[Option[Map[String, String]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableMaps") oneArrayOfNullableMaps: Array[Option[Map[String, String]]]
  ) =
    this(URI = URI, oneArrayOfNullableMaps = if (oneArrayOfNullableMaps == null) Array.empty else oneArrayOfNullableMaps)

}

object OneArrayOfNullableMaps_6Grid
