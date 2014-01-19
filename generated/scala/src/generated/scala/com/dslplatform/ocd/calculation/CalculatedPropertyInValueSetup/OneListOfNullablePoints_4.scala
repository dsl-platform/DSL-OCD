package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfNullablePoints_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullablePoints: IndexedSeq[Option[java.awt.geom.Point2D]] = IndexedSeq.empty,
     calculatedOneListOfNullablePoints: IndexedSeq[Option[java.awt.geom.Point2D]] = IndexedSeq.empty,
     persistedOneListOfNullablePoints: IndexedSeq[Option[java.awt.geom.Point2D]] = IndexedSeq.empty
  ) {

    require(oneListOfNullablePoints ne null, "Null value was provided for property \"oneListOfNullablePoints\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullablePoints)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullablePoints") oneListOfNullablePoints: IndexedSeq[Option[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullablePoints") calculatedOneListOfNullablePoints: IndexedSeq[Option[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullablePoints") persistedOneListOfNullablePoints: IndexedSeq[Option[java.awt.geom.Point2D]]
  ) =
    this( oneListOfNullablePoints = if (oneListOfNullablePoints == null) IndexedSeq.empty else oneListOfNullablePoints, calculatedOneListOfNullablePoints = calculatedOneListOfNullablePoints, persistedOneListOfNullablePoints = persistedOneListOfNullablePoints)

}
