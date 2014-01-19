package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableListOfNullableBooleans_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableListOfNullableBooleans: Option[IndexedSeq[Option[Boolean]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableBooleans") nullableListOfNullableBooleans: Option[IndexedSeq[Option[Boolean]]]
  ) =
    this(URI = URI, nullableListOfNullableBooleans = nullableListOfNullableBooleans)

}

object NullableListOfNullableBooleans_5Grid
