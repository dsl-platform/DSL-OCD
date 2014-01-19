package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfNullableRectangles_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableRectangles: Option[Array[Option[java.awt.geom.Rectangle2D]]] = None,
     calculatedNullableArrayOfNullableRectangles: Option[Array[Option[java.awt.geom.Rectangle2D]]] = None,
     persistedNullableArrayOfNullableRectangles: Option[Array[Option[java.awt.geom.Rectangle2D]]] = None
  ) {

    require(nullableArrayOfNullableRectangles ne null, "Null value was provided for property \"nullableArrayOfNullableRectangles\"")
    if (nullableArrayOfNullableRectangles.isDefined) require(nullableArrayOfNullableRectangles.get ne null, "Null value was provided for property \"nullableArrayOfNullableRectangles\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableRectangles)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableRectangles") nullableArrayOfNullableRectangles: Option[Array[Option[java.awt.geom.Rectangle2D]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableRectangles") calculatedNullableArrayOfNullableRectangles: Option[Array[Option[java.awt.geom.Rectangle2D]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableRectangles") persistedNullableArrayOfNullableRectangles: Option[Array[Option[java.awt.geom.Rectangle2D]]]
  ) =
    this( nullableArrayOfNullableRectangles = nullableArrayOfNullableRectangles, calculatedNullableArrayOfNullableRectangles = calculatedNullableArrayOfNullableRectangles, persistedNullableArrayOfNullableRectangles = persistedNullableArrayOfNullableRectangles)

}
