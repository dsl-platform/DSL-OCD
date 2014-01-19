package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableFloat_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableFloat: Option[Float]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableFloat") nullableFloat: Option[Float]
  ) =
    this(URI = URI, nullableFloat = nullableFloat)

}

object NullableFloat_5Grid
