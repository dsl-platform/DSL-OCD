package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfOneLocations_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneLocations: Option[Set[java.awt.geom.Point2D]] = None,
     calculatedNullableSetOfOneLocations: Option[Set[java.awt.geom.Point2D]] = None,
     persistedNullableSetOfOneLocations: Option[Set[java.awt.geom.Point2D]] = None
  ) {

    require(nullableSetOfOneLocations ne null, "Null value was provided for property \"nullableSetOfOneLocations\"")
    if (nullableSetOfOneLocations.isDefined) require(nullableSetOfOneLocations.get ne null, "Null value was provided for property \"nullableSetOfOneLocations\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneLocations)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneLocations") nullableSetOfOneLocations: Option[Set[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneLocations") calculatedNullableSetOfOneLocations: Option[Set[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneLocations") persistedNullableSetOfOneLocations: Option[Set[java.awt.geom.Point2D]]
  ) =
    this( nullableSetOfOneLocations = nullableSetOfOneLocations, calculatedNullableSetOfOneLocations = calculatedNullableSetOfOneLocations, persistedNullableSetOfOneLocations = persistedNullableSetOfOneLocations)

}
