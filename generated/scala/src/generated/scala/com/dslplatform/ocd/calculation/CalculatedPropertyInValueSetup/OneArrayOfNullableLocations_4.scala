package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfNullableLocations_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableLocations: Array[Option[java.awt.geom.Point2D]] = Array.empty,
     calculatedOneArrayOfNullableLocations: Array[Option[java.awt.geom.Point2D]] = Array.empty,
     persistedOneArrayOfNullableLocations: Array[Option[java.awt.geom.Point2D]] = Array.empty
  ) {

    require(oneArrayOfNullableLocations ne null, "Null value was provided for property \"oneArrayOfNullableLocations\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableLocations)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableLocations") oneArrayOfNullableLocations: Array[Option[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableLocations") calculatedOneArrayOfNullableLocations: Array[Option[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableLocations") persistedOneArrayOfNullableLocations: Array[Option[java.awt.geom.Point2D]]
  ) =
    this( oneArrayOfNullableLocations = if (oneArrayOfNullableLocations == null) Array.empty else oneArrayOfNullableLocations, calculatedOneArrayOfNullableLocations = calculatedOneArrayOfNullableLocations, persistedOneArrayOfNullableLocations = persistedOneArrayOfNullableLocations)

}
