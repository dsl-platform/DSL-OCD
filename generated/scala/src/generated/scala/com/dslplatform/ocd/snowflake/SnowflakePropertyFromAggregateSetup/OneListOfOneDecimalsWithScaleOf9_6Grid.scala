package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfOneDecimalsWithScaleOf9_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfOneDecimalsWithScaleOf9: IndexedSeq[BigDecimal]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneDecimalsWithScaleOf9") oneListOfOneDecimalsWithScaleOf9: IndexedSeq[BigDecimal]
  ) =
    this(URI = URI, oneListOfOneDecimalsWithScaleOf9 = if (oneListOfOneDecimalsWithScaleOf9 == null) IndexedSeq.empty else oneListOfOneDecimalsWithScaleOf9)

}

object OneListOfOneDecimalsWithScaleOf9_6Grid
