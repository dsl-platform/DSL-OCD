package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullablePoint_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullablePoint: Option[java.awt.geom.Point2D]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullablePoint") nullablePoint: Option[java.awt.geom.Point2D]
  ) =
    this(URI = URI, nullablePoint = nullablePoint)

}

object NullablePoint_5Grid
