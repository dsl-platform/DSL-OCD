package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableBoolean_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableBoolean: Option[Boolean]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableBoolean") nullableBoolean: Option[Boolean]
  ) =
    this(URI = URI, nullableBoolean = nullableBoolean)

}

object NullableBoolean_5Grid
