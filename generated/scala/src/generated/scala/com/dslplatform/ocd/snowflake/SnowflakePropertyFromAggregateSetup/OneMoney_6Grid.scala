package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneMoney_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneMoney: BigDecimal
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneMoney") oneMoney: BigDecimal
  ) =
    this(URI = URI, oneMoney = if (oneMoney == null) BigDecimal(0) else oneMoney)

}

object OneMoney_6Grid
