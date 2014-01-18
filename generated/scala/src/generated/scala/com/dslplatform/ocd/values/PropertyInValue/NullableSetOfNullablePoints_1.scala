package com.dslplatform.ocd.values.PropertyInValue

case class NullableSetOfNullablePoints_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullablePoints: Option[Set[Option[java.awt.geom.Point2D]]] = None
  ) {

    require(nullableSetOfNullablePoints ne null, "Null value was provided for property \"nullableSetOfNullablePoints\"")
    if (nullableSetOfNullablePoints.isDefined) require(nullableSetOfNullablePoints.get ne null, "Null value was provided for property \"nullableSetOfNullablePoints\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullablePoints)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullablePoints") nullableSetOfNullablePoints: Option[Set[Option[java.awt.geom.Point2D]]]
  ) =
    this( nullableSetOfNullablePoints = nullableSetOfNullablePoints)

}
