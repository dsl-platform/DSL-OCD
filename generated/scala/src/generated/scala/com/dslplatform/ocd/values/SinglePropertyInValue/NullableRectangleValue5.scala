package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableRectangleValue5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableRectangle: Option[java.awt.geom.Rectangle2D] = None
  ) {

    require(nullableRectangle ne null, "Null value was provided for property \"nullableRectangle\"")
    if (nullableRectangle.isDefined) require(nullableRectangle.get ne null, "Null value was provided for property \"nullableRectangle\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableRectangle") nullableRectangle: Option[java.awt.geom.Rectangle2D]
  ) =
    this( nullableRectangle = nullableRectangle)

}
