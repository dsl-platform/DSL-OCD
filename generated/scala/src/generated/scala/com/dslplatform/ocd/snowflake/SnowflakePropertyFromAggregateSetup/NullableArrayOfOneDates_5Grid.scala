package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableArrayOfOneDates_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableArrayOfOneDates: Option[Array[org.joda.time.LocalDate]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneDates") nullableArrayOfOneDates: Option[Array[org.joda.time.LocalDate]]
  ) =
    this(URI = URI, nullableArrayOfOneDates = nullableArrayOfOneDates)

}

object NullableArrayOfOneDates_5Grid
