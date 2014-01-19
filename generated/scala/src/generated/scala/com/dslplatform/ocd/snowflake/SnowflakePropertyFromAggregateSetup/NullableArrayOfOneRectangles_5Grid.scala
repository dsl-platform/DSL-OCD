package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableArrayOfOneRectangles_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableArrayOfOneRectangles: Option[Array[java.awt.geom.Rectangle2D]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneRectangles") nullableArrayOfOneRectangles: Option[Array[java.awt.geom.Rectangle2D]]
  ) =
    this(URI = URI, nullableArrayOfOneRectangles = nullableArrayOfOneRectangles)

}

object NullableArrayOfOneRectangles_5Grid
