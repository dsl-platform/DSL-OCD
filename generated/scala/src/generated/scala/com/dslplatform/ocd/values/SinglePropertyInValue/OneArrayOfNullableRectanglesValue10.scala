package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfNullableRectanglesValue10 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableRectangles: Array[Option[java.awt.geom.Rectangle2D]] = Array.empty
  ) {

    require(oneArrayOfNullableRectangles ne null, "Null value was provided for property \"oneArrayOfNullableRectangles\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableRectangles)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableRectangles") oneArrayOfNullableRectangles: Array[Option[java.awt.geom.Rectangle2D]]
  ) =
    this( oneArrayOfNullableRectangles = if (oneArrayOfNullableRectangles == null) Array.empty else oneArrayOfNullableRectangles)

}
