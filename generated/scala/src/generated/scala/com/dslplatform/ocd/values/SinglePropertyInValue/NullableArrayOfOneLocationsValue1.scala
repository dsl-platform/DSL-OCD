package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableArrayOfOneLocationsValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneLocations: Option[Array[java.awt.geom.Point2D]] = None
  ) {

    require(nullableArrayOfOneLocations ne null, "Null value was provided for property \"nullableArrayOfOneLocations\"")
    if (nullableArrayOfOneLocations.isDefined) require(nullableArrayOfOneLocations.get ne null, "Null value was provided for property \"nullableArrayOfOneLocations\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneLocations)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneLocations") nullableArrayOfOneLocations: Option[Array[java.awt.geom.Point2D]]
  ) =
    this( nullableArrayOfOneLocations = nullableArrayOfOneLocations)

}
