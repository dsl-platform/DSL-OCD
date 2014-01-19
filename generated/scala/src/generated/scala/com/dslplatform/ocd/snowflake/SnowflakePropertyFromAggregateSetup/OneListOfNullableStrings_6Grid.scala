package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfNullableStrings_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfNullableStrings: IndexedSeq[Option[String]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableStrings") oneListOfNullableStrings: IndexedSeq[Option[String]]
  ) =
    this(URI = URI, oneListOfNullableStrings = if (oneListOfNullableStrings == null) IndexedSeq.empty else oneListOfNullableStrings)

}

object OneListOfNullableStrings_6Grid
