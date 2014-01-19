package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfNullableLocations_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableLocations: Option[Set[Option[java.awt.geom.Point2D]]] = None,
     calculatedNullableSetOfNullableLocations: Option[Set[Option[java.awt.geom.Point2D]]] = None,
     persistedNullableSetOfNullableLocations: Option[Set[Option[java.awt.geom.Point2D]]] = None
  ) {

    require(nullableSetOfNullableLocations ne null, "Null value was provided for property \"nullableSetOfNullableLocations\"")
    if (nullableSetOfNullableLocations.isDefined) require(nullableSetOfNullableLocations.get ne null, "Null value was provided for property \"nullableSetOfNullableLocations\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableLocations)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableLocations") nullableSetOfNullableLocations: Option[Set[Option[java.awt.geom.Point2D]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableLocations") calculatedNullableSetOfNullableLocations: Option[Set[Option[java.awt.geom.Point2D]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableLocations") persistedNullableSetOfNullableLocations: Option[Set[Option[java.awt.geom.Point2D]]]
  ) =
    this( nullableSetOfNullableLocations = nullableSetOfNullableLocations, calculatedNullableSetOfNullableLocations = calculatedNullableSetOfNullableLocations, persistedNullableSetOfNullableLocations = persistedNullableSetOfNullableLocations)

}
