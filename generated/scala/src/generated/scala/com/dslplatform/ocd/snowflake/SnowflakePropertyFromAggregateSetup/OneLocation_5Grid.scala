package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneLocation_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneLocation: java.awt.geom.Point2D
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneLocation") oneLocation: java.awt.geom.Point2D
  ) =
    this(URI = URI, oneLocation = if (oneLocation == null) new java.awt.geom.Point2D.Float() else oneLocation)

}

object OneLocation_5Grid
