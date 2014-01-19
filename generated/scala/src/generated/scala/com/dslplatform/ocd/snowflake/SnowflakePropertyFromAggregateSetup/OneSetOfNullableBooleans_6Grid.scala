package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfNullableBooleans_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfNullableBooleans: Set[Option[Boolean]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableBooleans") oneSetOfNullableBooleans: Set[Option[Boolean]]
  ) =
    this(URI = URI, oneSetOfNullableBooleans = if (oneSetOfNullableBooleans == null) Set.empty else oneSetOfNullableBooleans)

}

object OneSetOfNullableBooleans_6Grid
