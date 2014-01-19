package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfNullableRectangles_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableRectangles: Array[Option[java.awt.geom.Rectangle2D]] = Array.empty,
     calculatedOneArrayOfNullableRectangles: Array[Option[java.awt.geom.Rectangle2D]] = Array.empty,
     persistedOneArrayOfNullableRectangles: Array[Option[java.awt.geom.Rectangle2D]] = Array.empty
  ) {

    require(oneArrayOfNullableRectangles ne null, "Null value was provided for property \"oneArrayOfNullableRectangles\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableRectangles)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableRectangles") oneArrayOfNullableRectangles: Array[Option[java.awt.geom.Rectangle2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableRectangles") calculatedOneArrayOfNullableRectangles: Array[Option[java.awt.geom.Rectangle2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableRectangles") persistedOneArrayOfNullableRectangles: Array[Option[java.awt.geom.Rectangle2D]]
  ) =
    this( oneArrayOfNullableRectangles = if (oneArrayOfNullableRectangles == null) Array.empty else oneArrayOfNullableRectangles, calculatedOneArrayOfNullableRectangles = calculatedOneArrayOfNullableRectangles, persistedOneArrayOfNullableRectangles = persistedOneArrayOfNullableRectangles)

}
