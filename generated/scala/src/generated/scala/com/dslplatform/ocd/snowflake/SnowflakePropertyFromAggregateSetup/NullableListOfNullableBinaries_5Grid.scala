package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableListOfNullableBinaries_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableListOfNullableBinaries: Option[IndexedSeq[Option[Array[Byte]]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableBinaries") nullableListOfNullableBinaries: Option[IndexedSeq[Option[Array[Byte]]]]
  ) =
    this(URI = URI, nullableListOfNullableBinaries = nullableListOfNullableBinaries)

}

object NullableListOfNullableBinaries_5Grid
