package com.dslplatform.ocd.values.PropertyInValue

case class NullableSetOfNullableLocations_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableLocations: Option[Set[Option[java.awt.geom.Point2D]]] = None
  ) {

    require(nullableSetOfNullableLocations ne null, "Null value was provided for property \"nullableSetOfNullableLocations\"")
    if (nullableSetOfNullableLocations.isDefined) require(nullableSetOfNullableLocations.get ne null, "Null value was provided for property \"nullableSetOfNullableLocations\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableLocations)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableLocations") nullableSetOfNullableLocations: Option[Set[Option[java.awt.geom.Point2D]]]
  ) =
    this( nullableSetOfNullableLocations = nullableSetOfNullableLocations)

}
