package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfNullableRectangles_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableRectangles: Option[Set[Option[java.awt.geom.Rectangle2D]]] = None,
     calculatedNullableSetOfNullableRectangles: Option[Set[Option[java.awt.geom.Rectangle2D]]] = None,
     persistedNullableSetOfNullableRectangles: Option[Set[Option[java.awt.geom.Rectangle2D]]] = None
  ) {

    require(nullableSetOfNullableRectangles ne null, "Null value was provided for property \"nullableSetOfNullableRectangles\"")
    if (nullableSetOfNullableRectangles.isDefined) require(nullableSetOfNullableRectangles.get ne null, "Null value was provided for property \"nullableSetOfNullableRectangles\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableRectangles)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableRectangles") nullableSetOfNullableRectangles: Option[Set[Option[java.awt.geom.Rectangle2D]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableRectangles") calculatedNullableSetOfNullableRectangles: Option[Set[Option[java.awt.geom.Rectangle2D]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableRectangles") persistedNullableSetOfNullableRectangles: Option[Set[Option[java.awt.geom.Rectangle2D]]]
  ) =
    this( nullableSetOfNullableRectangles = nullableSetOfNullableRectangles, calculatedNullableSetOfNullableRectangles = calculatedNullableSetOfNullableRectangles, persistedNullableSetOfNullableRectangles = persistedNullableSetOfNullableRectangles)

}
