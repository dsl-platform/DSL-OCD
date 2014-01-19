package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfNullableRectangles_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableRectangles: IndexedSeq[Option[java.awt.geom.Rectangle2D]] = IndexedSeq.empty,
     calculatedOneListOfNullableRectangles: IndexedSeq[Option[java.awt.geom.Rectangle2D]] = IndexedSeq.empty,
     persistedOneListOfNullableRectangles: IndexedSeq[Option[java.awt.geom.Rectangle2D]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableRectangles ne null, "Null value was provided for property \"oneListOfNullableRectangles\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableRectangles)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableRectangles") oneListOfNullableRectangles: IndexedSeq[Option[java.awt.geom.Rectangle2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableRectangles") calculatedOneListOfNullableRectangles: IndexedSeq[Option[java.awt.geom.Rectangle2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableRectangles") persistedOneListOfNullableRectangles: IndexedSeq[Option[java.awt.geom.Rectangle2D]]
  ) =
    this( oneListOfNullableRectangles = if (oneListOfNullableRectangles == null) IndexedSeq.empty else oneListOfNullableRectangles, calculatedOneListOfNullableRectangles = calculatedOneListOfNullableRectangles, persistedOneListOfNullableRectangles = persistedOneListOfNullableRectangles)

}
