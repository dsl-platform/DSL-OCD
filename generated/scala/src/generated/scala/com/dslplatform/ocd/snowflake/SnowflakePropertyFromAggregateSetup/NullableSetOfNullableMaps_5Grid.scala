package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableSetOfNullableMaps_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableSetOfNullableMaps: Option[Set[Option[Map[String, String]]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableMaps") nullableSetOfNullableMaps: Option[Set[Option[Map[String, String]]]]
  ) =
    this(URI = URI, nullableSetOfNullableMaps = nullableSetOfNullableMaps)

}

object NullableSetOfNullableMaps_5Grid
