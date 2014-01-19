package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableListOfOneBooleans_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableListOfOneBooleans: Option[IndexedSeq[Boolean]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneBooleans") nullableListOfOneBooleans: Option[IndexedSeq[Boolean]]
  ) =
    this(URI = URI, nullableListOfOneBooleans = nullableListOfOneBooleans)

}

object NullableListOfOneBooleans_5Grid
