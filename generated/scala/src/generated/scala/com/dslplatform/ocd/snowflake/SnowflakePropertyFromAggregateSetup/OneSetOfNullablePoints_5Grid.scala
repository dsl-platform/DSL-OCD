package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfNullablePoints_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfNullablePoints: Set[Option[java.awt.geom.Point2D]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullablePoints") oneSetOfNullablePoints: Set[Option[java.awt.geom.Point2D]]
  ) =
    this(URI = URI, oneSetOfNullablePoints = if (oneSetOfNullablePoints == null) Set.empty else oneSetOfNullablePoints)

}

object OneSetOfNullablePoints_5Grid
