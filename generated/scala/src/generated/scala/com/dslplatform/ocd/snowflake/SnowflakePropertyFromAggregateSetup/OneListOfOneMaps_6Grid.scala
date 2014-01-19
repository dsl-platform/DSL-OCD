package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfOneMaps_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfOneMaps: IndexedSeq[Map[String, String]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneMaps") oneListOfOneMaps: IndexedSeq[Map[String, String]]
  ) =
    this(URI = URI, oneListOfOneMaps = if (oneListOfOneMaps == null) IndexedSeq.empty else oneListOfOneMaps)

}

object OneListOfOneMaps_6Grid
