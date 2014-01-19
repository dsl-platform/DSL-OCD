package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullablePoint_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullablePoint: Option[java.awt.geom.Point2D] = None,
     calculatedNullablePoint: Option[java.awt.geom.Point2D] = None,
     persistedNullablePoint: Option[java.awt.geom.Point2D] = None
  ) {

    require(nullablePoint ne null, "Null value was provided for property \"nullablePoint\"")
    if (nullablePoint.isDefined) require(nullablePoint.get ne null, "Null value was provided for property \"nullablePoint\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullablePoint") nullablePoint: Option[java.awt.geom.Point2D]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullablePoint") calculatedNullablePoint: Option[java.awt.geom.Point2D]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullablePoint") persistedNullablePoint: Option[java.awt.geom.Point2D]
  ) =
    this( nullablePoint = nullablePoint, calculatedNullablePoint = calculatedNullablePoint, persistedNullablePoint = persistedNullablePoint)

}
