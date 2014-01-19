package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableListOfNullableRectangles_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableListOfNullableRectangles: Option[IndexedSeq[Option[java.awt.geom.Rectangle2D]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableRectangles") nullableListOfNullableRectangles: Option[IndexedSeq[Option[java.awt.geom.Rectangle2D]]]
  ) =
    this(URI = URI, nullableListOfNullableRectangles = nullableListOfNullableRectangles)

}

object NullableListOfNullableRectangles_5Grid
