package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneMap_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneMap: Map[String, String]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneMap") oneMap: Map[String, String]
  ) =
    this(URI = URI, oneMap = if (oneMap == null) Map.empty[String, String] else oneMap)

}

object OneMap_6Grid
