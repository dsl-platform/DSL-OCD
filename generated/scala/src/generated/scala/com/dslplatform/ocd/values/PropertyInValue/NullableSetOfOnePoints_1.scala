package com.dslplatform.ocd.values.PropertyInValue

case class NullableSetOfOnePoints_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOnePoints: Option[Set[java.awt.geom.Point2D]] = None
  ) {

    require(nullableSetOfOnePoints ne null, "Null value was provided for property \"nullableSetOfOnePoints\"")
    if (nullableSetOfOnePoints.isDefined) require(nullableSetOfOnePoints.get ne null, "Null value was provided for property \"nullableSetOfOnePoints\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOnePoints)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOnePoints") nullableSetOfOnePoints: Option[Set[java.awt.geom.Point2D]]
  ) =
    this( nullableSetOfOnePoints = nullableSetOfOnePoints)

}
