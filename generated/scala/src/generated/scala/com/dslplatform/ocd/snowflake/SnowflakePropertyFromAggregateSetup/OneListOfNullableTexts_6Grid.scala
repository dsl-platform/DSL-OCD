package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfNullableTexts_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfNullableTexts: IndexedSeq[Option[String]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableTexts") oneListOfNullableTexts: IndexedSeq[Option[String]]
  ) =
    this(URI = URI, oneListOfNullableTexts = if (oneListOfNullableTexts == null) IndexedSeq.empty else oneListOfNullableTexts)

}

object OneListOfNullableTexts_6Grid
