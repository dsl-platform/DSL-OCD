package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableSetOfOneRectangles_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableSetOfOneRectangles: Option[Set[java.awt.geom.Rectangle2D]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneRectangles") nullableSetOfOneRectangles: Option[Set[java.awt.geom.Rectangle2D]]
  ) =
    this(URI = URI, nullableSetOfOneRectangles = nullableSetOfOneRectangles)

}

object NullableSetOfOneRectangles_5Grid
