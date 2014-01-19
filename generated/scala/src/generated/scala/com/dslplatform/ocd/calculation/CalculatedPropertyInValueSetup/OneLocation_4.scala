package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneLocation_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneLocation: java.awt.geom.Point2D = new java.awt.geom.Point2D.Float(),
     calculatedOneLocation: java.awt.geom.Point2D = new java.awt.geom.Point2D.Float(),
     persistedOneLocation: java.awt.geom.Point2D = new java.awt.geom.Point2D.Float()
  ) {

    require(oneLocation ne null, "Null value was provided for property \"oneLocation\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneLocation") oneLocation: java.awt.geom.Point2D
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneLocation") calculatedOneLocation: java.awt.geom.Point2D
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneLocation") persistedOneLocation: java.awt.geom.Point2D
  ) =
    this( oneLocation = if (oneLocation == null) new java.awt.geom.Point2D.Float() else oneLocation, calculatedOneLocation = if (calculatedOneLocation == null) new java.awt.geom.Point2D.Float() else calculatedOneLocation, persistedOneLocation = if (persistedOneLocation == null) new java.awt.geom.Point2D.Float() else persistedOneLocation)

}
