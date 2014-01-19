package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableArrayOfOneMonies_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableArrayOfOneMonies: Option[Array[BigDecimal]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneMonies") nullableArrayOfOneMonies: Option[Array[BigDecimal]]
  ) =
    this(URI = URI, nullableArrayOfOneMonies = nullableArrayOfOneMonies)

}

object NullableArrayOfOneMonies_5Grid
