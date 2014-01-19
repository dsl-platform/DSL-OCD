package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfOneStrings_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfOneStrings: IndexedSeq[String]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneStrings") oneListOfOneStrings: IndexedSeq[String]
  ) =
    this(URI = URI, oneListOfOneStrings = if (oneListOfOneStrings == null) IndexedSeq.empty else oneListOfOneStrings)

}

object OneListOfOneStrings_6Grid
