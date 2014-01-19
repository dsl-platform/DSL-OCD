package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneRectangle_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneRectangle: java.awt.geom.Rectangle2D = new java.awt.geom.Rectangle2D.Float(),
     calculatedOneRectangle: java.awt.geom.Rectangle2D = new java.awt.geom.Rectangle2D.Float(),
     persistedOneRectangle: java.awt.geom.Rectangle2D = new java.awt.geom.Rectangle2D.Float()
  ) {

    require(oneRectangle ne null, "Null value was provided for property \"oneRectangle\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneRectangle") oneRectangle: java.awt.geom.Rectangle2D
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneRectangle") calculatedOneRectangle: java.awt.geom.Rectangle2D
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneRectangle") persistedOneRectangle: java.awt.geom.Rectangle2D
  ) =
    this( oneRectangle = if (oneRectangle == null) new java.awt.geom.Rectangle2D.Float() else oneRectangle, calculatedOneRectangle = if (calculatedOneRectangle == null) new java.awt.geom.Rectangle2D.Float() else calculatedOneRectangle, persistedOneRectangle = if (persistedOneRectangle == null) new java.awt.geom.Rectangle2D.Float() else persistedOneRectangle)

}
