package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfNullableLongs_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfNullableLongs: Array[Option[Long]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableLongs") oneArrayOfNullableLongs: Array[Option[Long]]
  ) =
    this(URI = URI, oneArrayOfNullableLongs = if (oneArrayOfNullableLongs == null) Array.empty else oneArrayOfNullableLongs)

}

object OneArrayOfNullableLongs_6Grid
