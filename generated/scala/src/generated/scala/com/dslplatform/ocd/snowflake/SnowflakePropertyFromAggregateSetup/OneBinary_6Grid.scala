package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneBinary_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneBinary: Array[Byte]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneBinary") oneBinary: Array[Byte]
  ) =
    this(URI = URI, oneBinary = if (oneBinary == null) Array[Byte]() else oneBinary)

}

object OneBinary_6Grid
