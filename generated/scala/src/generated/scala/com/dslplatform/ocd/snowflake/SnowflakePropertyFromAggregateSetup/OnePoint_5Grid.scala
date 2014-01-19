package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OnePoint_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     onePoint: java.awt.geom.Point2D
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("onePoint") onePoint: java.awt.geom.Point2D
  ) =
    this(URI = URI, onePoint = if (onePoint == null) new java.awt.Point() else onePoint)

}

object OnePoint_5Grid
