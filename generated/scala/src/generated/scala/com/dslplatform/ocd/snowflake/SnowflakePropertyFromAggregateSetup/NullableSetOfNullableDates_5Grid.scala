package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableSetOfNullableDates_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableSetOfNullableDates: Option[Set[Option[org.joda.time.LocalDate]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableDates") nullableSetOfNullableDates: Option[Set[Option[org.joda.time.LocalDate]]]
  ) =
    this(URI = URI, nullableSetOfNullableDates = nullableSetOfNullableDates)

}

object NullableSetOfNullableDates_5Grid
