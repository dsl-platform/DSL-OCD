package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfNullablePointsValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullablePoints: Option[IndexedSeq[Option[java.awt.geom.Point2D]]] = None
  ) {

    require(nullableListOfNullablePoints ne null, "Null value was provided for property \"nullableListOfNullablePoints\"")
    if (nullableListOfNullablePoints.isDefined) require(nullableListOfNullablePoints.get ne null, "Null value was provided for property \"nullableListOfNullablePoints\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullablePoints)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullablePoints") nullableListOfNullablePoints: Option[IndexedSeq[Option[java.awt.geom.Point2D]]]
  ) =
    this( nullableListOfNullablePoints = nullableListOfNullablePoints)

}
