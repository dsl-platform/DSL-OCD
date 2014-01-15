package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableArrayOfOneRectanglesValue9 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneRectangles: Option[Array[java.awt.geom.Rectangle2D]] = None
  ) {

    require(nullableArrayOfOneRectangles ne null, "Null value was provided for property \"nullableArrayOfOneRectangles\"")
    if (nullableArrayOfOneRectangles.isDefined) require(nullableArrayOfOneRectangles.get ne null, "Null value was provided for property \"nullableArrayOfOneRectangles\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneRectangles)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneRectangles") nullableArrayOfOneRectangles: Option[Array[java.awt.geom.Rectangle2D]]
  ) =
    this( nullableArrayOfOneRectangles = nullableArrayOfOneRectangles)

}
