package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableSetOfNullableDecimalsWithScaleOf9_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableSetOfNullableDecimalsWithScaleOf9: Option[Set[Option[BigDecimal]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableDecimalsWithScaleOf9") nullableSetOfNullableDecimalsWithScaleOf9: Option[Set[Option[BigDecimal]]]
  ) =
    this(URI = URI, nullableSetOfNullableDecimalsWithScaleOf9 = nullableSetOfNullableDecimalsWithScaleOf9)

}

object NullableSetOfNullableDecimalsWithScaleOf9_5Grid
