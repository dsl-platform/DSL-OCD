package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfNullableMaps_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfNullableMaps: Set[Option[Map[String, String]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableMaps") oneSetOfNullableMaps: Set[Option[Map[String, String]]]
  ) =
    this(URI = URI, oneSetOfNullableMaps = if (oneSetOfNullableMaps == null) Set.empty else oneSetOfNullableMaps)

}

object OneSetOfNullableMaps_6Grid
