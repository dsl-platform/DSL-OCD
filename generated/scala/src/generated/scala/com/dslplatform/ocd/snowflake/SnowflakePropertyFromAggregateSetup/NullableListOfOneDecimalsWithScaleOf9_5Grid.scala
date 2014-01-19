package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableListOfOneDecimalsWithScaleOf9_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableListOfOneDecimalsWithScaleOf9: Option[IndexedSeq[BigDecimal]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneDecimalsWithScaleOf9") nullableListOfOneDecimalsWithScaleOf9: Option[IndexedSeq[BigDecimal]]
  ) =
    this(URI = URI, nullableListOfOneDecimalsWithScaleOf9 = nullableListOfOneDecimalsWithScaleOf9)

}

object NullableListOfOneDecimalsWithScaleOf9_5Grid
