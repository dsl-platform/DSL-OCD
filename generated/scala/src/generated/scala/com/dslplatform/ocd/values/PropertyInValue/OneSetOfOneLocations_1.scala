package com.dslplatform.ocd.values.PropertyInValue

case class OneSetOfOneLocations_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneLocations: Set[java.awt.geom.Point2D] = Set.empty
  ) {

    require(oneSetOfOneLocations ne null, "Null value was provided for property \"oneSetOfOneLocations\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneLocations)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneLocations") oneSetOfOneLocations: Set[java.awt.geom.Point2D]
  ) =
    this( oneSetOfOneLocations = if (oneSetOfOneLocations == null) Set.empty else oneSetOfOneLocations)

}
