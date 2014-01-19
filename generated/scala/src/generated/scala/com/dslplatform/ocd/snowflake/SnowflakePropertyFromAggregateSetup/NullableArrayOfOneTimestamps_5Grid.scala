package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableArrayOfOneTimestamps_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableArrayOfOneTimestamps: Option[Array[org.joda.time.DateTime]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneTimestamps") nullableArrayOfOneTimestamps: Option[Array[org.joda.time.DateTime]]
  ) =
    this(URI = URI, nullableArrayOfOneTimestamps = nullableArrayOfOneTimestamps)

}

object NullableArrayOfOneTimestamps_5Grid
