package com.dslplatform.ocd.values.PropertyInValue

case class OnePoint_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     onePoint: java.awt.geom.Point2D = new java.awt.Point()
  ) {

    require(onePoint ne null, "Null value was provided for property \"onePoint\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("onePoint") onePoint: java.awt.geom.Point2D
  ) =
    this( onePoint = if (onePoint == null) new java.awt.Point() else onePoint)

}
