package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfNullableRectangles_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfNullableRectangles: Set[Option[java.awt.geom.Rectangle2D]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableRectangles") oneSetOfNullableRectangles: Set[Option[java.awt.geom.Rectangle2D]]
  ) =
    this(URI = URI, oneSetOfNullableRectangles = if (oneSetOfNullableRectangles == null) Set.empty else oneSetOfNullableRectangles)

}

object OneSetOfNullableRectangles_5Grid
