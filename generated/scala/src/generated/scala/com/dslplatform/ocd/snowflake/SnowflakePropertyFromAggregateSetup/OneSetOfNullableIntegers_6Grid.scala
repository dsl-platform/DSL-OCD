package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfNullableIntegers_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfNullableIntegers: Set[Option[Int]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableIntegers") oneSetOfNullableIntegers: Set[Option[Int]]
  ) =
    this(URI = URI, oneSetOfNullableIntegers = if (oneSetOfNullableIntegers == null) Set.empty else oneSetOfNullableIntegers)

}

object OneSetOfNullableIntegers_6Grid
