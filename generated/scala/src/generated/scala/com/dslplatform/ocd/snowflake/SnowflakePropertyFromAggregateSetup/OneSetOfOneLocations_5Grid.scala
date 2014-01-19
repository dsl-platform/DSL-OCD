package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfOneLocations_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfOneLocations: Set[java.awt.geom.Point2D]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneLocations") oneSetOfOneLocations: Set[java.awt.geom.Point2D]
  ) =
    this(URI = URI, oneSetOfOneLocations = if (oneSetOfOneLocations == null) Set.empty else oneSetOfOneLocations)

}

object OneSetOfOneLocations_5Grid
