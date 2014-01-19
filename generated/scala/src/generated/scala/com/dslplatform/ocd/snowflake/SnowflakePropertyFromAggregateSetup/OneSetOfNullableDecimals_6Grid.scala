package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfNullableDecimals_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfNullableDecimals: Set[Option[BigDecimal]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableDecimals") oneSetOfNullableDecimals: Set[Option[BigDecimal]]
  ) =
    this(URI = URI, oneSetOfNullableDecimals = if (oneSetOfNullableDecimals == null) Set.empty else oneSetOfNullableDecimals)

}

object OneSetOfNullableDecimals_6Grid
