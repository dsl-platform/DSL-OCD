package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableLocation_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableLocation: Option[java.awt.geom.Point2D]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableLocation") nullableLocation: Option[java.awt.geom.Point2D]
  ) =
    this(URI = URI, nullableLocation = nullableLocation)

}

object NullableLocation_5Grid
