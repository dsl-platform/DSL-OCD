package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfOneDecimalsWithScaleOf9_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfOneDecimalsWithScaleOf9: Set[BigDecimal]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneDecimalsWithScaleOf9") oneSetOfOneDecimalsWithScaleOf9: Set[BigDecimal]
  ) =
    this(URI = URI, oneSetOfOneDecimalsWithScaleOf9 = if (oneSetOfOneDecimalsWithScaleOf9 == null) Set.empty else oneSetOfOneDecimalsWithScaleOf9)

}

object OneSetOfOneDecimalsWithScaleOf9_6Grid
