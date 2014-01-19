package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableText_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableText: Option[String]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableText") nullableText: Option[String]
  ) =
    this(URI = URI, nullableText = nullableText)

}

object NullableText_5Grid
