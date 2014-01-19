package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableSetOfNullableIntegers_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableSetOfNullableIntegers: Option[Set[Option[Int]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableIntegers") nullableSetOfNullableIntegers: Option[Set[Option[Int]]]
  ) =
    this(URI = URI, nullableSetOfNullableIntegers = nullableSetOfNullableIntegers)

}

object NullableSetOfNullableIntegers_5Grid
