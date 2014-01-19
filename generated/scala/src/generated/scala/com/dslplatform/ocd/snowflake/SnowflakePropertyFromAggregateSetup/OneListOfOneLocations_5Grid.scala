package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfOneLocations_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfOneLocations: IndexedSeq[java.awt.geom.Point2D]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneLocations") oneListOfOneLocations: IndexedSeq[java.awt.geom.Point2D]
  ) =
    this(URI = URI, oneListOfOneLocations = if (oneListOfOneLocations == null) IndexedSeq.empty else oneListOfOneLocations)

}

object OneListOfOneLocations_5Grid
