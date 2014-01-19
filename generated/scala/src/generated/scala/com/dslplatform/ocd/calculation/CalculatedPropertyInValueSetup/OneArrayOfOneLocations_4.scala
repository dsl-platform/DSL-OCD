package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfOneLocations_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneLocations: Array[java.awt.geom.Point2D] = Array.empty,
     calculatedOneArrayOfOneLocations: Array[java.awt.geom.Point2D] = Array.empty,
     persistedOneArrayOfOneLocations: Array[java.awt.geom.Point2D] = Array.empty
  ) {

    require(oneArrayOfOneLocations ne null, "Null value was provided for property \"oneArrayOfOneLocations\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneLocations)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneLocations") oneArrayOfOneLocations: Array[java.awt.geom.Point2D]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneLocations") calculatedOneArrayOfOneLocations: Array[java.awt.geom.Point2D]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneLocations") persistedOneArrayOfOneLocations: Array[java.awt.geom.Point2D]
  ) =
    this( oneArrayOfOneLocations = if (oneArrayOfOneLocations == null) Array.empty else oneArrayOfOneLocations, calculatedOneArrayOfOneLocations = calculatedOneArrayOfOneLocations, persistedOneArrayOfOneLocations = persistedOneArrayOfOneLocations)

}
