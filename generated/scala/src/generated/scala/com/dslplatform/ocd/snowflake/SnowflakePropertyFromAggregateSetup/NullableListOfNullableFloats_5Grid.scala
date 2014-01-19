package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableListOfNullableFloats_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableListOfNullableFloats: Option[IndexedSeq[Option[Float]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableFloats") nullableListOfNullableFloats: Option[IndexedSeq[Option[Float]]]
  ) =
    this(URI = URI, nullableListOfNullableFloats = nullableListOfNullableFloats)

}

object NullableListOfNullableFloats_5Grid
