package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfOnePoints_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOnePoints: Set[java.awt.geom.Point2D] = Set.empty,
     calculatedOneSetOfOnePoints: Set[java.awt.geom.Point2D] = Set.empty,
     persistedOneSetOfOnePoints: Set[java.awt.geom.Point2D] = Set.empty
  ) {

    require(oneSetOfOnePoints ne null, "Null value was provided for property \"oneSetOfOnePoints\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOnePoints)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOnePoints") oneSetOfOnePoints: Set[java.awt.geom.Point2D]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOnePoints") calculatedOneSetOfOnePoints: Set[java.awt.geom.Point2D]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOnePoints") persistedOneSetOfOnePoints: Set[java.awt.geom.Point2D]
  ) =
    this( oneSetOfOnePoints = if (oneSetOfOnePoints == null) Set.empty else oneSetOfOnePoints, calculatedOneSetOfOnePoints = calculatedOneSetOfOnePoints, persistedOneSetOfOnePoints = persistedOneSetOfOnePoints)

}
