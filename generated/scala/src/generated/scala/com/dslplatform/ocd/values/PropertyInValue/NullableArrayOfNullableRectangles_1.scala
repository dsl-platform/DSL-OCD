package com.dslplatform.ocd.values.PropertyInValue

case class NullableArrayOfNullableRectangles_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableRectangles: Option[Array[Option[java.awt.geom.Rectangle2D]]] = None
  ) {

    require(nullableArrayOfNullableRectangles ne null, "Null value was provided for property \"nullableArrayOfNullableRectangles\"")
    if (nullableArrayOfNullableRectangles.isDefined) require(nullableArrayOfNullableRectangles.get ne null, "Null value was provided for property \"nullableArrayOfNullableRectangles\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableRectangles)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableRectangles") nullableArrayOfNullableRectangles: Option[Array[Option[java.awt.geom.Rectangle2D]]]
  ) =
    this( nullableArrayOfNullableRectangles = nullableArrayOfNullableRectangles)

}
