package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfOnePointsValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOnePoints: Set[java.awt.geom.Point2D] = Set.empty
  ) {

    require(oneSetOfOnePoints ne null, "Null value was provided for property \"oneSetOfOnePoints\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOnePoints)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOnePoints") oneSetOfOnePoints: Set[java.awt.geom.Point2D]
  ) =
    this( oneSetOfOnePoints = if (oneSetOfOnePoints == null) Set.empty else oneSetOfOnePoints)

}
