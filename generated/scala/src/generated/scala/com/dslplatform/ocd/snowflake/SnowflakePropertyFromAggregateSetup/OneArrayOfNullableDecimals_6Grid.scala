package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfNullableDecimals_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfNullableDecimals: Array[Option[BigDecimal]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableDecimals") oneArrayOfNullableDecimals: Array[Option[BigDecimal]]
  ) =
    this(URI = URI, oneArrayOfNullableDecimals = if (oneArrayOfNullableDecimals == null) Array.empty else oneArrayOfNullableDecimals)

}

object OneArrayOfNullableDecimals_6Grid
