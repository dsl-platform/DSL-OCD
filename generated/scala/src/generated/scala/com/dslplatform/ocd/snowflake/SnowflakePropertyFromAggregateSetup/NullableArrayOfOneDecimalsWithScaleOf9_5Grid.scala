package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableArrayOfOneDecimalsWithScaleOf9_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableArrayOfOneDecimalsWithScaleOf9: Option[Array[BigDecimal]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneDecimalsWithScaleOf9") nullableArrayOfOneDecimalsWithScaleOf9: Option[Array[BigDecimal]]
  ) =
    this(URI = URI, nullableArrayOfOneDecimalsWithScaleOf9 = nullableArrayOfOneDecimalsWithScaleOf9)

}

object NullableArrayOfOneDecimalsWithScaleOf9_5Grid
