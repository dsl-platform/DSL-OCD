package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfOneDoubles_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfOneDoubles: Set[Double]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneDoubles") oneSetOfOneDoubles: Set[Double]
  ) =
    this(URI = URI, oneSetOfOneDoubles = if (oneSetOfOneDoubles == null) Set.empty else oneSetOfOneDoubles)

}

object OneSetOfOneDoubles_6Grid
