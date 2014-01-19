package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfOnePoints_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOnePoints: Option[Array[java.awt.geom.Point2D]] = None,
     calculatedNullableArrayOfOnePoints: Option[Array[java.awt.geom.Point2D]] = None,
     persistedNullableArrayOfOnePoints: Option[Array[java.awt.geom.Point2D]] = None
  ) {

    require(nullableArrayOfOnePoints ne null, "Null value was provided for property \"nullableArrayOfOnePoints\"")
    if (nullableArrayOfOnePoints.isDefined) require(nullableArrayOfOnePoints.get ne null, "Null value was provided for property \"nullableArrayOfOnePoints\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOnePoints)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOnePoints") nullableArrayOfOnePoints: Option[Array[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOnePoints") calculatedNullableArrayOfOnePoints: Option[Array[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOnePoints") persistedNullableArrayOfOnePoints: Option[Array[java.awt.geom.Point2D]]
  ) =
    this( nullableArrayOfOnePoints = nullableArrayOfOnePoints, calculatedNullableArrayOfOnePoints = calculatedNullableArrayOfOnePoints, persistedNullableArrayOfOnePoints = persistedNullableArrayOfOnePoints)

}
