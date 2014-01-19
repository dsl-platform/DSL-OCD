package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableListOfNullableDecimalsWithScaleOf9_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableListOfNullableDecimalsWithScaleOf9: Option[IndexedSeq[Option[BigDecimal]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableDecimalsWithScaleOf9") nullableListOfNullableDecimalsWithScaleOf9: Option[IndexedSeq[Option[BigDecimal]]]
  ) =
    this(URI = URI, nullableListOfNullableDecimalsWithScaleOf9 = nullableListOfNullableDecimalsWithScaleOf9)

}

object NullableListOfNullableDecimalsWithScaleOf9_5Grid
