package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfNullablePoints_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfNullablePoints: Array[Option[java.awt.geom.Point2D]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullablePoints") oneArrayOfNullablePoints: Array[Option[java.awt.geom.Point2D]]
  ) =
    this(URI = URI, oneArrayOfNullablePoints = if (oneArrayOfNullablePoints == null) Array.empty else oneArrayOfNullablePoints)

}

object OneArrayOfNullablePoints_5Grid
