package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableLocationValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableLocation: Option[java.awt.geom.Point2D] = None
  ) {

    require(nullableLocation ne null, "Null value was provided for property \"nullableLocation\"")
    if (nullableLocation.isDefined) require(nullableLocation.get ne null, "Null value was provided for property \"nullableLocation\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableLocation") nullableLocation: Option[java.awt.geom.Point2D]
  ) =
    this( nullableLocation = nullableLocation)

}
