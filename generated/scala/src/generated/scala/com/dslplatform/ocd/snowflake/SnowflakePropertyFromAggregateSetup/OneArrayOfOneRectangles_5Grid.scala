package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfOneRectangles_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfOneRectangles: Array[java.awt.geom.Rectangle2D]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneRectangles") oneArrayOfOneRectangles: Array[java.awt.geom.Rectangle2D]
  ) =
    this(URI = URI, oneArrayOfOneRectangles = if (oneArrayOfOneRectangles == null) Array.empty else oneArrayOfOneRectangles)

}

object OneArrayOfOneRectangles_5Grid
