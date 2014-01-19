package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfOnePoints_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfOnePoints: Set[java.awt.geom.Point2D]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOnePoints") oneSetOfOnePoints: Set[java.awt.geom.Point2D]
  ) =
    this(URI = URI, oneSetOfOnePoints = if (oneSetOfOnePoints == null) Set.empty else oneSetOfOnePoints)

}

object OneSetOfOnePoints_5Grid
