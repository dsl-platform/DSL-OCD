package com.dslplatform.ocd.values.PropertyInValue

case class OneLocation_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneLocation: java.awt.geom.Point2D = new java.awt.geom.Point2D.Float()
  ) {

    require(oneLocation ne null, "Null value was provided for property \"oneLocation\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneLocation") oneLocation: java.awt.geom.Point2D
  ) =
    this( oneLocation = if (oneLocation == null) new java.awt.geom.Point2D.Float() else oneLocation)

}
