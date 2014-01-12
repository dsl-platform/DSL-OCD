package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableSetOfOneLocationsValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneLocations: Option[Set[java.awt.geom.Point2D]] = None
  ) {

    require(nullableSetOfOneLocations ne null, "Null value was provided for property \"nullableSetOfOneLocations\"")
    if (nullableSetOfOneLocations.isDefined) require(nullableSetOfOneLocations.get ne null, "Null value was provided for property \"nullableSetOfOneLocations\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneLocations)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneLocations") nullableSetOfOneLocations: Option[Set[java.awt.geom.Point2D]]
  ) =
    this( nullableSetOfOneLocations = nullableSetOfOneLocations)

}
