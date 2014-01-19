package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableListOfOneMonies_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableListOfOneMonies: Option[IndexedSeq[BigDecimal]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneMonies") nullableListOfOneMonies: Option[IndexedSeq[BigDecimal]]
  ) =
    this(URI = URI, nullableListOfOneMonies = nullableListOfOneMonies)

}

object NullableListOfOneMonies_5Grid
