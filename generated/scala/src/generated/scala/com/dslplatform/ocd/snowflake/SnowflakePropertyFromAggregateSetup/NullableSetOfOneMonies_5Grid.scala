package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableSetOfOneMonies_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableSetOfOneMonies: Option[Set[BigDecimal]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneMonies") nullableSetOfOneMonies: Option[Set[BigDecimal]]
  ) =
    this(URI = URI, nullableSetOfOneMonies = nullableSetOfOneMonies)

}

object NullableSetOfOneMonies_5Grid
