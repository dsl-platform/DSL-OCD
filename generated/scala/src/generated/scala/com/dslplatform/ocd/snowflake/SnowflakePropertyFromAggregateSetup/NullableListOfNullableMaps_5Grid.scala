package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableListOfNullableMaps_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableListOfNullableMaps: Option[IndexedSeq[Option[Map[String, String]]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableMaps") nullableListOfNullableMaps: Option[IndexedSeq[Option[Map[String, String]]]]
  ) =
    this(URI = URI, nullableListOfNullableMaps = nullableListOfNullableMaps)

}

object NullableListOfNullableMaps_5Grid
