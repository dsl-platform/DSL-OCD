package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneDecimalWithScaleOf9_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneDecimalWithScaleOf9: BigDecimal
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneDecimalWithScaleOf9") oneDecimalWithScaleOf9: BigDecimal
  ) =
    this(URI = URI, oneDecimalWithScaleOf9 = if (oneDecimalWithScaleOf9 == null) _root_.scala.math.BigDecimal(0).setScale(9) else oneDecimalWithScaleOf9)

}

object OneDecimalWithScaleOf9_6Grid
