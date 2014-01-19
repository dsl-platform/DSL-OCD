package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableSetOfNullableBinaries_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableSetOfNullableBinaries: Option[Set[Option[Array[Byte]]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableBinaries") nullableSetOfNullableBinaries: Option[Set[Option[Array[Byte]]]]
  ) =
    this(URI = URI, nullableSetOfNullableBinaries = nullableSetOfNullableBinaries)

}

object NullableSetOfNullableBinaries_5Grid
