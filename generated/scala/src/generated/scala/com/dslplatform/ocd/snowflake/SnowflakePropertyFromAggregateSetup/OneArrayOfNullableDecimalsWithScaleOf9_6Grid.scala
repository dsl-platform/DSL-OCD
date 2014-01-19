package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfNullableDecimalsWithScaleOf9_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfNullableDecimalsWithScaleOf9: Array[Option[BigDecimal]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableDecimalsWithScaleOf9") oneArrayOfNullableDecimalsWithScaleOf9: Array[Option[BigDecimal]]
  ) =
    this(URI = URI, oneArrayOfNullableDecimalsWithScaleOf9 = if (oneArrayOfNullableDecimalsWithScaleOf9 == null) Array.empty else oneArrayOfNullableDecimalsWithScaleOf9)

}

object OneArrayOfNullableDecimalsWithScaleOf9_6Grid
