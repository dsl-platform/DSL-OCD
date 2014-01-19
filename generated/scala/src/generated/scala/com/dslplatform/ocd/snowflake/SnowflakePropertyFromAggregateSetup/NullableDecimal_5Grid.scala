package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableDecimal_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableDecimal: Option[BigDecimal]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableDecimal") nullableDecimal: Option[BigDecimal]
  ) =
    this(URI = URI, nullableDecimal = nullableDecimal)

}

object NullableDecimal_5Grid
