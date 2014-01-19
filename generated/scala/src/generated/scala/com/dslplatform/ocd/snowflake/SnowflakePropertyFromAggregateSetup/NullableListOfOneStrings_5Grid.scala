package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableListOfOneStrings_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableListOfOneStrings: Option[IndexedSeq[String]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneStrings") nullableListOfOneStrings: Option[IndexedSeq[String]]
  ) =
    this(URI = URI, nullableListOfOneStrings = nullableListOfOneStrings)

}

object NullableListOfOneStrings_5Grid
