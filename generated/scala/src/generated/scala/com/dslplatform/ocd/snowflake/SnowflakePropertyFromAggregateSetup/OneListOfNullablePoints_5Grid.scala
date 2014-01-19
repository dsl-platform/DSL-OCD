package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfNullablePoints_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfNullablePoints: IndexedSeq[Option[java.awt.geom.Point2D]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullablePoints") oneListOfNullablePoints: IndexedSeq[Option[java.awt.geom.Point2D]]
  ) =
    this(URI = URI, oneListOfNullablePoints = if (oneListOfNullablePoints == null) IndexedSeq.empty else oneListOfNullablePoints)

}

object OneListOfNullablePoints_5Grid
