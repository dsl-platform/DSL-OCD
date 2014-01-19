package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfOneRectangles_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneRectangles: IndexedSeq[java.awt.geom.Rectangle2D] = IndexedSeq.empty,
     calculatedOneListOfOneRectangles: IndexedSeq[java.awt.geom.Rectangle2D] = IndexedSeq.empty,
     persistedOneListOfOneRectangles: IndexedSeq[java.awt.geom.Rectangle2D] = IndexedSeq.empty
  ) {

    require(oneListOfOneRectangles ne null, "Null value was provided for property \"oneListOfOneRectangles\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneRectangles)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneRectangles") oneListOfOneRectangles: IndexedSeq[java.awt.geom.Rectangle2D]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneRectangles") calculatedOneListOfOneRectangles: IndexedSeq[java.awt.geom.Rectangle2D]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneRectangles") persistedOneListOfOneRectangles: IndexedSeq[java.awt.geom.Rectangle2D]
  ) =
    this( oneListOfOneRectangles = if (oneListOfOneRectangles == null) IndexedSeq.empty else oneListOfOneRectangles, calculatedOneListOfOneRectangles = calculatedOneListOfOneRectangles, persistedOneListOfOneRectangles = persistedOneListOfOneRectangles)

}
