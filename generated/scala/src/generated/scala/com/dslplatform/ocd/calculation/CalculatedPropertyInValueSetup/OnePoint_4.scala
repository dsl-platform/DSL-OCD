package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OnePoint_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     onePoint: java.awt.geom.Point2D = new java.awt.Point(),
     calculatedOnePoint: java.awt.geom.Point2D = new java.awt.Point(),
     persistedOnePoint: java.awt.geom.Point2D = new java.awt.Point()
  ) {

    require(onePoint ne null, "Null value was provided for property \"onePoint\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("onePoint") onePoint: java.awt.geom.Point2D
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOnePoint") calculatedOnePoint: java.awt.geom.Point2D
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOnePoint") persistedOnePoint: java.awt.geom.Point2D
  ) =
    this( onePoint = if (onePoint == null) new java.awt.Point() else onePoint, calculatedOnePoint = if (calculatedOnePoint == null) new java.awt.Point() else calculatedOnePoint, persistedOnePoint = if (persistedOnePoint == null) new java.awt.Point() else persistedOnePoint)

}
