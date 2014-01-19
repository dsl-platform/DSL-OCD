package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfOneTexts_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfOneTexts: IndexedSeq[String]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneTexts") oneListOfOneTexts: IndexedSeq[String]
  ) =
    this(URI = URI, oneListOfOneTexts = if (oneListOfOneTexts == null) IndexedSeq.empty else oneListOfOneTexts)

}

object OneListOfOneTexts_6Grid
