package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfOneFloats_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfOneFloats: Set[Float]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneFloats") oneSetOfOneFloats: Set[Float]
  ) =
    this(URI = URI, oneSetOfOneFloats = if (oneSetOfOneFloats == null) Set.empty else oneSetOfOneFloats)

}

object OneSetOfOneFloats_6Grid
