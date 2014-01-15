package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfOneRectanglesValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneRectangles: Array[java.awt.geom.Rectangle2D] = Array.empty
  ) {

    require(oneArrayOfOneRectangles ne null, "Null value was provided for property \"oneArrayOfOneRectangles\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneRectangles)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneRectangles") oneArrayOfOneRectangles: Array[java.awt.geom.Rectangle2D]
  ) =
    this( oneArrayOfOneRectangles = if (oneArrayOfOneRectangles == null) Array.empty else oneArrayOfOneRectangles)

}
