package com.dslplatform.ocd.values.PropertyInValue

case class NullableListOfOneLocations_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneLocations: Option[IndexedSeq[java.awt.geom.Point2D]] = None
  ) {

    require(nullableListOfOneLocations ne null, "Null value was provided for property \"nullableListOfOneLocations\"")
    if (nullableListOfOneLocations.isDefined) require(nullableListOfOneLocations.get ne null, "Null value was provided for property \"nullableListOfOneLocations\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneLocations)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneLocations") nullableListOfOneLocations: Option[IndexedSeq[java.awt.geom.Point2D]]
  ) =
    this( nullableListOfOneLocations = nullableListOfOneLocations)

}
