package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableLong_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableLong: Option[Long]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableLong") nullableLong: Option[Long]
  ) =
    this(URI = URI, nullableLong = nullableLong)

}

object NullableLong_5Grid
