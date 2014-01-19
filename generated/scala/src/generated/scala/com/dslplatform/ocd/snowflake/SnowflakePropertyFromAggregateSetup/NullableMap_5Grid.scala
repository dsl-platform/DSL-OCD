package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableMap_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableMap: Option[Map[String, String]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableMap") nullableMap: Option[Map[String, String]]
  ) =
    this(URI = URI, nullableMap = nullableMap)

}

object NullableMap_5Grid
