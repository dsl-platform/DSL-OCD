package com.dslplatform.ocd.values.PropertyInValue

case class NullableArrayOfOnePoints_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOnePoints: Option[Array[java.awt.geom.Point2D]] = None
  ) {

    require(nullableArrayOfOnePoints ne null, "Null value was provided for property \"nullableArrayOfOnePoints\"")
    if (nullableArrayOfOnePoints.isDefined) require(nullableArrayOfOnePoints.get ne null, "Null value was provided for property \"nullableArrayOfOnePoints\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOnePoints)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOnePoints") nullableArrayOfOnePoints: Option[Array[java.awt.geom.Point2D]]
  ) =
    this( nullableArrayOfOnePoints = nullableArrayOfOnePoints)

}
