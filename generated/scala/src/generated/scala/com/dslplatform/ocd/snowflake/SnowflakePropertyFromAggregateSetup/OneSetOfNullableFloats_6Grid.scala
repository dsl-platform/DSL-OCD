package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfNullableFloats_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfNullableFloats: Set[Option[Float]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableFloats") oneSetOfNullableFloats: Set[Option[Float]]
  ) =
    this(URI = URI, oneSetOfNullableFloats = if (oneSetOfNullableFloats == null) Set.empty else oneSetOfNullableFloats)

}

object OneSetOfNullableFloats_6Grid
