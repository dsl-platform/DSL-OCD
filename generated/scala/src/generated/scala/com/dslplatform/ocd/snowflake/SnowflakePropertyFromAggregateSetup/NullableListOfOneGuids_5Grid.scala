package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableListOfOneGuids_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableListOfOneGuids: Option[IndexedSeq[java.util.UUID]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneGuids") nullableListOfOneGuids: Option[IndexedSeq[java.util.UUID]]
  ) =
    this(URI = URI, nullableListOfOneGuids = nullableListOfOneGuids)

}

object NullableListOfOneGuids_5Grid
