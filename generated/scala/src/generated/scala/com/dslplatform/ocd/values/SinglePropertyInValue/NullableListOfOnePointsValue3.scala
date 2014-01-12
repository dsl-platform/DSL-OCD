package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfOnePointsValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOnePoints: Option[IndexedSeq[java.awt.geom.Point2D]] = None
  ) {

    require(nullableListOfOnePoints ne null, "Null value was provided for property \"nullableListOfOnePoints\"")
    if (nullableListOfOnePoints.isDefined) require(nullableListOfOnePoints.get ne null, "Null value was provided for property \"nullableListOfOnePoints\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOnePoints)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOnePoints") nullableListOfOnePoints: Option[IndexedSeq[java.awt.geom.Point2D]]
  ) =
    this( nullableListOfOnePoints = nullableListOfOnePoints)

}
