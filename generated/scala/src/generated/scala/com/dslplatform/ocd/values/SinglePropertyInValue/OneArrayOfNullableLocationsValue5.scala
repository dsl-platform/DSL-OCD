package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfNullableLocationsValue5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableLocations: Array[Option[java.awt.geom.Point2D]] = Array.empty
  ) {

    require(oneArrayOfNullableLocations ne null, "Null value was provided for property \"oneArrayOfNullableLocations\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableLocations)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableLocations") oneArrayOfNullableLocations: Array[Option[java.awt.geom.Point2D]]
  ) =
    this( oneArrayOfNullableLocations = if (oneArrayOfNullableLocations == null) Array.empty else oneArrayOfNullableLocations)

}
