package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfNullablePoints_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullablePoints: Set[Option[java.awt.geom.Point2D]] = Set.empty,
     calculatedOneSetOfNullablePoints: Set[Option[java.awt.geom.Point2D]] = Set.empty,
     persistedOneSetOfNullablePoints: Set[Option[java.awt.geom.Point2D]] = Set.empty
  ) {

    require(oneSetOfNullablePoints ne null, "Null value was provided for property \"oneSetOfNullablePoints\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullablePoints)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullablePoints") oneSetOfNullablePoints: Set[Option[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullablePoints") calculatedOneSetOfNullablePoints: Set[Option[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullablePoints") persistedOneSetOfNullablePoints: Set[Option[java.awt.geom.Point2D]]
  ) =
    this( oneSetOfNullablePoints = if (oneSetOfNullablePoints == null) Set.empty else oneSetOfNullablePoints, calculatedOneSetOfNullablePoints = calculatedOneSetOfNullablePoints, persistedOneSetOfNullablePoints = persistedOneSetOfNullablePoints)

}
