package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfOneBooleans_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfOneBooleans: Set[Boolean]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneBooleans") oneSetOfOneBooleans: Set[Boolean]
  ) =
    this(URI = URI, oneSetOfOneBooleans = if (oneSetOfOneBooleans == null) Set.empty else oneSetOfOneBooleans)

}

object OneSetOfOneBooleans_6Grid
