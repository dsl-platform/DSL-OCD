package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfNullableIntegers_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfNullableIntegers: IndexedSeq[Option[Int]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableIntegers") oneListOfNullableIntegers: IndexedSeq[Option[Int]]
  ) =
    this(URI = URI, oneListOfNullableIntegers = if (oneListOfNullableIntegers == null) IndexedSeq.empty else oneListOfNullableIntegers)

}

object OneListOfNullableIntegers_6Grid
