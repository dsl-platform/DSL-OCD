package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfOneDecimals_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfOneDecimals: IndexedSeq[BigDecimal]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneDecimals") oneListOfOneDecimals: IndexedSeq[BigDecimal]
  ) =
    this(URI = URI, oneListOfOneDecimals = if (oneListOfOneDecimals == null) IndexedSeq.empty else oneListOfOneDecimals)

}

object OneListOfOneDecimals_6Grid
