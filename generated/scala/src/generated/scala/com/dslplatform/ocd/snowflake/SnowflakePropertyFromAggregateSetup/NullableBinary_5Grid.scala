package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableBinary_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableBinary: Option[Array[Byte]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableBinary") nullableBinary: Option[Array[Byte]]
  ) =
    this(URI = URI, nullableBinary = nullableBinary)

}

object NullableBinary_5Grid
