package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableRectangle_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableRectangle: Option[java.awt.geom.Rectangle2D] = None,
     calculatedNullableRectangle: Option[java.awt.geom.Rectangle2D] = None,
     persistedNullableRectangle: Option[java.awt.geom.Rectangle2D] = None
  ) {

    require(nullableRectangle ne null, "Null value was provided for property \"nullableRectangle\"")
    if (nullableRectangle.isDefined) require(nullableRectangle.get ne null, "Null value was provided for property \"nullableRectangle\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableRectangle") nullableRectangle: Option[java.awt.geom.Rectangle2D]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableRectangle") calculatedNullableRectangle: Option[java.awt.geom.Rectangle2D]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableRectangle") persistedNullableRectangle: Option[java.awt.geom.Rectangle2D]
  ) =
    this( nullableRectangle = nullableRectangle, calculatedNullableRectangle = calculatedNullableRectangle, persistedNullableRectangle = persistedNullableRectangle)

}
