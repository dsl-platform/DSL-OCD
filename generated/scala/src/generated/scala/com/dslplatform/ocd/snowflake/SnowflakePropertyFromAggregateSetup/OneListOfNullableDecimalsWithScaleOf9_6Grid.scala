package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfNullableDecimalsWithScaleOf9_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfNullableDecimalsWithScaleOf9: IndexedSeq[Option[BigDecimal]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableDecimalsWithScaleOf9") oneListOfNullableDecimalsWithScaleOf9: IndexedSeq[Option[BigDecimal]]
  ) =
    this(URI = URI, oneListOfNullableDecimalsWithScaleOf9 = if (oneListOfNullableDecimalsWithScaleOf9 == null) IndexedSeq.empty else oneListOfNullableDecimalsWithScaleOf9)

}

object OneListOfNullableDecimalsWithScaleOf9_6Grid
