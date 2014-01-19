package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfOneRectangles_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneRectangles: Option[Array[java.awt.geom.Rectangle2D]] = None,
     calculatedNullableArrayOfOneRectangles: Option[Array[java.awt.geom.Rectangle2D]] = None,
     persistedNullableArrayOfOneRectangles: Option[Array[java.awt.geom.Rectangle2D]] = None
  ) {

    require(nullableArrayOfOneRectangles ne null, "Null value was provided for property \"nullableArrayOfOneRectangles\"")
    if (nullableArrayOfOneRectangles.isDefined) require(nullableArrayOfOneRectangles.get ne null, "Null value was provided for property \"nullableArrayOfOneRectangles\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneRectangles)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneRectangles") nullableArrayOfOneRectangles: Option[Array[java.awt.geom.Rectangle2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneRectangles") calculatedNullableArrayOfOneRectangles: Option[Array[java.awt.geom.Rectangle2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneRectangles") persistedNullableArrayOfOneRectangles: Option[Array[java.awt.geom.Rectangle2D]]
  ) =
    this( nullableArrayOfOneRectangles = nullableArrayOfOneRectangles, calculatedNullableArrayOfOneRectangles = calculatedNullableArrayOfOneRectangles, persistedNullableArrayOfOneRectangles = persistedNullableArrayOfOneRectangles)

}
