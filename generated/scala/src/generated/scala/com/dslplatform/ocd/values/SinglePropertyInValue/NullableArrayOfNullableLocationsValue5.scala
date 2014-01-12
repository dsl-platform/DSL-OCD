package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableArrayOfNullableLocationsValue5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableLocations: Option[Array[Option[java.awt.geom.Point2D]]] = None
  ) {

    require(nullableArrayOfNullableLocations ne null, "Null value was provided for property \"nullableArrayOfNullableLocations\"")
    if (nullableArrayOfNullableLocations.isDefined) require(nullableArrayOfNullableLocations.get ne null, "Null value was provided for property \"nullableArrayOfNullableLocations\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableLocations)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableLocations") nullableArrayOfNullableLocations: Option[Array[Option[java.awt.geom.Point2D]]]
  ) =
    this( nullableArrayOfNullableLocations = nullableArrayOfNullableLocations)

}
