package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfNullableMaps_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfNullableMaps: IndexedSeq[Option[Map[String, String]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableMaps") oneListOfNullableMaps: IndexedSeq[Option[Map[String, String]]]
  ) =
    this(URI = URI, oneListOfNullableMaps = if (oneListOfNullableMaps == null) IndexedSeq.empty else oneListOfNullableMaps)

}

object OneListOfNullableMaps_6Grid
