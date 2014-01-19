package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfOneIntegers_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfOneIntegers: IndexedSeq[Int]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneIntegers") oneListOfOneIntegers: IndexedSeq[Int]
  ) =
    this(URI = URI, oneListOfOneIntegers = if (oneListOfOneIntegers == null) IndexedSeq.empty else oneListOfOneIntegers)

}

object OneListOfOneIntegers_6Grid
