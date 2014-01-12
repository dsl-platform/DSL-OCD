package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfNullableLocationsValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullableLocations: Option[IndexedSeq[Option[java.awt.geom.Point2D]]] = None
  ) {

    require(nullableListOfNullableLocations ne null, "Null value was provided for property \"nullableListOfNullableLocations\"")
    if (nullableListOfNullableLocations.isDefined) require(nullableListOfNullableLocations.get ne null, "Null value was provided for property \"nullableListOfNullableLocations\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableLocations)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableLocations") nullableListOfNullableLocations: Option[IndexedSeq[Option[java.awt.geom.Point2D]]]
  ) =
    this( nullableListOfNullableLocations = nullableListOfNullableLocations)

}
