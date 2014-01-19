package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableListOfNullableIntegers_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableListOfNullableIntegers: Option[IndexedSeq[Option[Int]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableIntegers") nullableListOfNullableIntegers: Option[IndexedSeq[Option[Int]]]
  ) =
    this(URI = URI, nullableListOfNullableIntegers = nullableListOfNullableIntegers)

}

object NullableListOfNullableIntegers_5Grid
