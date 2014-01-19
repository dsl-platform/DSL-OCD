package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfOnePoints_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfOnePoints: Array[java.awt.geom.Point2D]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOnePoints") oneArrayOfOnePoints: Array[java.awt.geom.Point2D]
  ) =
    this(URI = URI, oneArrayOfOnePoints = if (oneArrayOfOnePoints == null) Array.empty else oneArrayOfOnePoints)

}

object OneArrayOfOnePoints_5Grid
