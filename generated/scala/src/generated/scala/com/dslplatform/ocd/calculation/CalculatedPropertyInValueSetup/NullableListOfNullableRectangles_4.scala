package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfNullableRectangles_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullableRectangles: Option[IndexedSeq[Option[java.awt.geom.Rectangle2D]]] = None,
     calculatedNullableListOfNullableRectangles: Option[IndexedSeq[Option[java.awt.geom.Rectangle2D]]] = None,
     persistedNullableListOfNullableRectangles: Option[IndexedSeq[Option[java.awt.geom.Rectangle2D]]] = None
  ) {

    require(nullableListOfNullableRectangles ne null, "Null value was provided for property \"nullableListOfNullableRectangles\"")
    if (nullableListOfNullableRectangles.isDefined) require(nullableListOfNullableRectangles.get ne null, "Null value was provided for property \"nullableListOfNullableRectangles\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableRectangles)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableRectangles") nullableListOfNullableRectangles: Option[IndexedSeq[Option[java.awt.geom.Rectangle2D]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableRectangles") calculatedNullableListOfNullableRectangles: Option[IndexedSeq[Option[java.awt.geom.Rectangle2D]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableRectangles") persistedNullableListOfNullableRectangles: Option[IndexedSeq[Option[java.awt.geom.Rectangle2D]]]
  ) =
    this( nullableListOfNullableRectangles = nullableListOfNullableRectangles, calculatedNullableListOfNullableRectangles = calculatedNullableListOfNullableRectangles, persistedNullableListOfNullableRectangles = persistedNullableListOfNullableRectangles)

}
