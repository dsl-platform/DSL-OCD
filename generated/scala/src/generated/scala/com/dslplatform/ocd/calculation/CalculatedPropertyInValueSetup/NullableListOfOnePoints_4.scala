package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfOnePoints_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOnePoints: Option[IndexedSeq[java.awt.geom.Point2D]] = None,
     calculatedNullableListOfOnePoints: Option[IndexedSeq[java.awt.geom.Point2D]] = None,
     persistedNullableListOfOnePoints: Option[IndexedSeq[java.awt.geom.Point2D]] = None
  ) {

    require(nullableListOfOnePoints ne null, "Null value was provided for property \"nullableListOfOnePoints\"")
    if (nullableListOfOnePoints.isDefined) require(nullableListOfOnePoints.get ne null, "Null value was provided for property \"nullableListOfOnePoints\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOnePoints)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOnePoints") nullableListOfOnePoints: Option[IndexedSeq[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOnePoints") calculatedNullableListOfOnePoints: Option[IndexedSeq[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOnePoints") persistedNullableListOfOnePoints: Option[IndexedSeq[java.awt.geom.Point2D]]
  ) =
    this( nullableListOfOnePoints = nullableListOfOnePoints, calculatedNullableListOfOnePoints = calculatedNullableListOfOnePoints, persistedNullableListOfOnePoints = persistedNullableListOfOnePoints)

}
