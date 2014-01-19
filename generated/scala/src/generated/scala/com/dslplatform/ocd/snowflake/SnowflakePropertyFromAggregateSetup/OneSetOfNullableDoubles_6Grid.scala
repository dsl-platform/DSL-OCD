package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfNullableDoubles_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfNullableDoubles: Set[Option[Double]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableDoubles") oneSetOfNullableDoubles: Set[Option[Double]]
  ) =
    this(URI = URI, oneSetOfNullableDoubles = if (oneSetOfNullableDoubles == null) Set.empty else oneSetOfNullableDoubles)

}

object OneSetOfNullableDoubles_6Grid
