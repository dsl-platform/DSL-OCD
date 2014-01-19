package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfOneRectangles_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfOneRectangles: Set[java.awt.geom.Rectangle2D]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneRectangles") oneSetOfOneRectangles: Set[java.awt.geom.Rectangle2D]
  ) =
    this(URI = URI, oneSetOfOneRectangles = if (oneSetOfOneRectangles == null) Set.empty else oneSetOfOneRectangles)

}

object OneSetOfOneRectangles_5Grid
