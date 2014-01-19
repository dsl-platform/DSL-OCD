package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfOneRectangles_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneRectangles: Option[IndexedSeq[java.awt.geom.Rectangle2D]] = None,
     calculatedNullableListOfOneRectangles: Option[IndexedSeq[java.awt.geom.Rectangle2D]] = None,
     persistedNullableListOfOneRectangles: Option[IndexedSeq[java.awt.geom.Rectangle2D]] = None
  ) {

    require(nullableListOfOneRectangles ne null, "Null value was provided for property \"nullableListOfOneRectangles\"")
    if (nullableListOfOneRectangles.isDefined) require(nullableListOfOneRectangles.get ne null, "Null value was provided for property \"nullableListOfOneRectangles\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneRectangles)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneRectangles") nullableListOfOneRectangles: Option[IndexedSeq[java.awt.geom.Rectangle2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneRectangles") calculatedNullableListOfOneRectangles: Option[IndexedSeq[java.awt.geom.Rectangle2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneRectangles") persistedNullableListOfOneRectangles: Option[IndexedSeq[java.awt.geom.Rectangle2D]]
  ) =
    this( nullableListOfOneRectangles = nullableListOfOneRectangles, calculatedNullableListOfOneRectangles = calculatedNullableListOfOneRectangles, persistedNullableListOfOneRectangles = persistedNullableListOfOneRectangles)

}
