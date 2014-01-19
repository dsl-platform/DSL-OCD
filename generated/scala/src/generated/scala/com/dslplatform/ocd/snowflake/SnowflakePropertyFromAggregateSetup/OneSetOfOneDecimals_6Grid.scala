package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfOneDecimals_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfOneDecimals: Set[BigDecimal]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneDecimals") oneSetOfOneDecimals: Set[BigDecimal]
  ) =
    this(URI = URI, oneSetOfOneDecimals = if (oneSetOfOneDecimals == null) Set.empty else oneSetOfOneDecimals)

}

object OneSetOfOneDecimals_6Grid
