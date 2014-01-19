package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfOneLocations_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneLocations: IndexedSeq[java.awt.geom.Point2D] = IndexedSeq.empty,
     calculatedOneListOfOneLocations: IndexedSeq[java.awt.geom.Point2D] = IndexedSeq.empty,
     persistedOneListOfOneLocations: IndexedSeq[java.awt.geom.Point2D] = IndexedSeq.empty
  ) {

    require(oneListOfOneLocations ne null, "Null value was provided for property \"oneListOfOneLocations\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneLocations)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneLocations") oneListOfOneLocations: IndexedSeq[java.awt.geom.Point2D]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneLocations") calculatedOneListOfOneLocations: IndexedSeq[java.awt.geom.Point2D]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneLocations") persistedOneListOfOneLocations: IndexedSeq[java.awt.geom.Point2D]
  ) =
    this( oneListOfOneLocations = if (oneListOfOneLocations == null) IndexedSeq.empty else oneListOfOneLocations, calculatedOneListOfOneLocations = calculatedOneListOfOneLocations, persistedOneListOfOneLocations = persistedOneListOfOneLocations)

}
