package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableArrayOfNullableDecimalsWithScaleOf9_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableArrayOfNullableDecimalsWithScaleOf9: Option[Array[Option[BigDecimal]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableDecimalsWithScaleOf9") nullableArrayOfNullableDecimalsWithScaleOf9: Option[Array[Option[BigDecimal]]]
  ) =
    this(URI = URI, nullableArrayOfNullableDecimalsWithScaleOf9 = nullableArrayOfNullableDecimalsWithScaleOf9)

}

object NullableArrayOfNullableDecimalsWithScaleOf9_5Grid
