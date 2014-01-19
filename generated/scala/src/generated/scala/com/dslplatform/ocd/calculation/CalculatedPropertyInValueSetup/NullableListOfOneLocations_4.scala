package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfOneLocations_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneLocations: Option[IndexedSeq[java.awt.geom.Point2D]] = None,
     calculatedNullableListOfOneLocations: Option[IndexedSeq[java.awt.geom.Point2D]] = None,
     persistedNullableListOfOneLocations: Option[IndexedSeq[java.awt.geom.Point2D]] = None
  ) {

    require(nullableListOfOneLocations ne null, "Null value was provided for property \"nullableListOfOneLocations\"")
    if (nullableListOfOneLocations.isDefined) require(nullableListOfOneLocations.get ne null, "Null value was provided for property \"nullableListOfOneLocations\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneLocations)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneLocations") nullableListOfOneLocations: Option[IndexedSeq[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneLocations") calculatedNullableListOfOneLocations: Option[IndexedSeq[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneLocations") persistedNullableListOfOneLocations: Option[IndexedSeq[java.awt.geom.Point2D]]
  ) =
    this( nullableListOfOneLocations = nullableListOfOneLocations, calculatedNullableListOfOneLocations = calculatedNullableListOfOneLocations, persistedNullableListOfOneLocations = persistedNullableListOfOneLocations)

}
