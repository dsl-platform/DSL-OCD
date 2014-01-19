package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableListOfOneBinaries_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableListOfOneBinaries: Option[IndexedSeq[Array[Byte]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneBinaries") nullableListOfOneBinaries: Option[IndexedSeq[Array[Byte]]]
  ) =
    this(URI = URI, nullableListOfOneBinaries = nullableListOfOneBinaries)

}

object NullableListOfOneBinaries_5Grid
