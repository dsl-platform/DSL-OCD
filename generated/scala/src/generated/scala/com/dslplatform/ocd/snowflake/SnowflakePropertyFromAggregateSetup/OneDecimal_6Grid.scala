package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneDecimal_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneDecimal: BigDecimal
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneDecimal") oneDecimal: BigDecimal
  ) =
    this(URI = URI, oneDecimal = if (oneDecimal == null) _root_.scala.math.BigDecimal(0) else oneDecimal)

}

object OneDecimal_6Grid
