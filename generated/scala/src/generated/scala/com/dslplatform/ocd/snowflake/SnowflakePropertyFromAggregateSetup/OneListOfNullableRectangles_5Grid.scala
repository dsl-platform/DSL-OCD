package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfNullableRectangles_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfNullableRectangles: IndexedSeq[Option[java.awt.geom.Rectangle2D]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableRectangles") oneListOfNullableRectangles: IndexedSeq[Option[java.awt.geom.Rectangle2D]]
  ) =
    this(URI = URI, oneListOfNullableRectangles = if (oneListOfNullableRectangles == null) IndexedSeq.empty else oneListOfNullableRectangles)

}

object OneListOfNullableRectangles_5Grid
