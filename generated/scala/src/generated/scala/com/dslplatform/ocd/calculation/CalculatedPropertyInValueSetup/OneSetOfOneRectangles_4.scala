package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfOneRectangles_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneRectangles: Set[java.awt.geom.Rectangle2D] = Set.empty,
     calculatedOneSetOfOneRectangles: Set[java.awt.geom.Rectangle2D] = Set.empty,
     persistedOneSetOfOneRectangles: Set[java.awt.geom.Rectangle2D] = Set.empty
  ) {

    require(oneSetOfOneRectangles ne null, "Null value was provided for property \"oneSetOfOneRectangles\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneRectangles)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneRectangles") oneSetOfOneRectangles: Set[java.awt.geom.Rectangle2D]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneRectangles") calculatedOneSetOfOneRectangles: Set[java.awt.geom.Rectangle2D]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneRectangles") persistedOneSetOfOneRectangles: Set[java.awt.geom.Rectangle2D]
  ) =
    this( oneSetOfOneRectangles = if (oneSetOfOneRectangles == null) Set.empty else oneSetOfOneRectangles, calculatedOneSetOfOneRectangles = calculatedOneSetOfOneRectangles, persistedOneSetOfOneRectangles = persistedOneSetOfOneRectangles)

}
