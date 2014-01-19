package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfOnePoints_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOnePoints: Option[Set[java.awt.geom.Point2D]] = None,
     calculatedNullableSetOfOnePoints: Option[Set[java.awt.geom.Point2D]] = None,
     persistedNullableSetOfOnePoints: Option[Set[java.awt.geom.Point2D]] = None
  ) {

    require(nullableSetOfOnePoints ne null, "Null value was provided for property \"nullableSetOfOnePoints\"")
    if (nullableSetOfOnePoints.isDefined) require(nullableSetOfOnePoints.get ne null, "Null value was provided for property \"nullableSetOfOnePoints\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOnePoints)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOnePoints") nullableSetOfOnePoints: Option[Set[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOnePoints") calculatedNullableSetOfOnePoints: Option[Set[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOnePoints") persistedNullableSetOfOnePoints: Option[Set[java.awt.geom.Point2D]]
  ) =
    this( nullableSetOfOnePoints = nullableSetOfOnePoints, calculatedNullableSetOfOnePoints = calculatedNullableSetOfOnePoints, persistedNullableSetOfOnePoints = persistedNullableSetOfOnePoints)

}
