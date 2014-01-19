package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableDecimalWithScaleOf9_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableDecimalWithScaleOf9: Option[BigDecimal]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableDecimalWithScaleOf9") nullableDecimalWithScaleOf9: Option[BigDecimal]
  ) =
    this(URI = URI, nullableDecimalWithScaleOf9 = nullableDecimalWithScaleOf9)

}

object NullableDecimalWithScaleOf9_5Grid
