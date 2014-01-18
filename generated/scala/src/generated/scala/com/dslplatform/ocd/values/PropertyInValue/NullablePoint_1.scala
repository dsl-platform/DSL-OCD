package com.dslplatform.ocd.values.PropertyInValue

case class NullablePoint_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullablePoint: Option[java.awt.geom.Point2D] = None
  ) {

    require(nullablePoint ne null, "Null value was provided for property \"nullablePoint\"")
    if (nullablePoint.isDefined) require(nullablePoint.get ne null, "Null value was provided for property \"nullablePoint\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullablePoint") nullablePoint: Option[java.awt.geom.Point2D]
  ) =
    this( nullablePoint = nullablePoint)

}
