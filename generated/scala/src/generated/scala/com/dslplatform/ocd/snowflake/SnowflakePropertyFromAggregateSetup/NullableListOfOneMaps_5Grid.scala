package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableListOfOneMaps_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableListOfOneMaps: Option[IndexedSeq[Map[String, String]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneMaps") nullableListOfOneMaps: Option[IndexedSeq[Map[String, String]]]
  ) =
    this(URI = URI, nullableListOfOneMaps = nullableListOfOneMaps)

}

object NullableListOfOneMaps_5Grid
