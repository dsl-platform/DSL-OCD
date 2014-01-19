package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneRectangle_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneRectangle: java.awt.geom.Rectangle2D
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneRectangle") oneRectangle: java.awt.geom.Rectangle2D
  ) =
    this(URI = URI, oneRectangle = if (oneRectangle == null) new java.awt.geom.Rectangle2D.Float() else oneRectangle)

}

object OneRectangle_5Grid
