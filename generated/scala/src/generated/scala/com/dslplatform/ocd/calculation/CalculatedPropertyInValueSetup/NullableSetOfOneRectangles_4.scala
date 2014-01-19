package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfOneRectangles_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneRectangles: Option[Set[java.awt.geom.Rectangle2D]] = None,
     calculatedNullableSetOfOneRectangles: Option[Set[java.awt.geom.Rectangle2D]] = None,
     persistedNullableSetOfOneRectangles: Option[Set[java.awt.geom.Rectangle2D]] = None
  ) {

    require(nullableSetOfOneRectangles ne null, "Null value was provided for property \"nullableSetOfOneRectangles\"")
    if (nullableSetOfOneRectangles.isDefined) require(nullableSetOfOneRectangles.get ne null, "Null value was provided for property \"nullableSetOfOneRectangles\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneRectangles)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneRectangles") nullableSetOfOneRectangles: Option[Set[java.awt.geom.Rectangle2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneRectangles") calculatedNullableSetOfOneRectangles: Option[Set[java.awt.geom.Rectangle2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneRectangles") persistedNullableSetOfOneRectangles: Option[Set[java.awt.geom.Rectangle2D]]
  ) =
    this( nullableSetOfOneRectangles = nullableSetOfOneRectangles, calculatedNullableSetOfOneRectangles = calculatedNullableSetOfOneRectangles, persistedNullableSetOfOneRectangles = persistedNullableSetOfOneRectangles)

}
