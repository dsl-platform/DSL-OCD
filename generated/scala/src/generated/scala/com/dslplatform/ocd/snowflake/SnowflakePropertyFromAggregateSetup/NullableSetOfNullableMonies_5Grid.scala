package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableSetOfNullableMonies_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableSetOfNullableMonies: Option[Set[Option[BigDecimal]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableMonies") nullableSetOfNullableMonies: Option[Set[Option[BigDecimal]]]
  ) =
    this(URI = URI, nullableSetOfNullableMonies = nullableSetOfNullableMonies)

}

object NullableSetOfNullableMonies_5Grid
