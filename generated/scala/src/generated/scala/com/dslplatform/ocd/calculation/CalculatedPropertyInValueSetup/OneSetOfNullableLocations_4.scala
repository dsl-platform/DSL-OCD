package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfNullableLocations_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableLocations: Set[Option[java.awt.geom.Point2D]] = Set.empty,
     calculatedOneSetOfNullableLocations: Set[Option[java.awt.geom.Point2D]] = Set.empty,
     persistedOneSetOfNullableLocations: Set[Option[java.awt.geom.Point2D]] = Set.empty
  ) {

    require(oneSetOfNullableLocations ne null, "Null value was provided for property \"oneSetOfNullableLocations\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableLocations)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableLocations") oneSetOfNullableLocations: Set[Option[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableLocations") calculatedOneSetOfNullableLocations: Set[Option[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableLocations") persistedOneSetOfNullableLocations: Set[Option[java.awt.geom.Point2D]]
  ) =
    this( oneSetOfNullableLocations = if (oneSetOfNullableLocations == null) Set.empty else oneSetOfNullableLocations, calculatedOneSetOfNullableLocations = calculatedOneSetOfNullableLocations, persistedOneSetOfNullableLocations = persistedOneSetOfNullableLocations)

}
