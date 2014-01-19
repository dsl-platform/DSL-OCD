package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfNullablePoints_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullablePoints: Option[Array[Option[java.awt.geom.Point2D]]] = None,
     calculatedNullableArrayOfNullablePoints: Option[Array[Option[java.awt.geom.Point2D]]] = None,
     persistedNullableArrayOfNullablePoints: Option[Array[Option[java.awt.geom.Point2D]]] = None
  ) {

    require(nullableArrayOfNullablePoints ne null, "Null value was provided for property \"nullableArrayOfNullablePoints\"")
    if (nullableArrayOfNullablePoints.isDefined) require(nullableArrayOfNullablePoints.get ne null, "Null value was provided for property \"nullableArrayOfNullablePoints\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullablePoints)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullablePoints") nullableArrayOfNullablePoints: Option[Array[Option[java.awt.geom.Point2D]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullablePoints") calculatedNullableArrayOfNullablePoints: Option[Array[Option[java.awt.geom.Point2D]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullablePoints") persistedNullableArrayOfNullablePoints: Option[Array[Option[java.awt.geom.Point2D]]]
  ) =
    this( nullableArrayOfNullablePoints = nullableArrayOfNullablePoints, calculatedNullableArrayOfNullablePoints = calculatedNullableArrayOfNullablePoints, persistedNullableArrayOfNullablePoints = persistedNullableArrayOfNullablePoints)

}
