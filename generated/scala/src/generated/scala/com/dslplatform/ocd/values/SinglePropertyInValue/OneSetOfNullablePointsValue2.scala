package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfNullablePointsValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullablePoints: Set[Option[java.awt.geom.Point2D]] = Set.empty
  ) {

    require(oneSetOfNullablePoints ne null, "Null value was provided for property \"oneSetOfNullablePoints\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullablePoints)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullablePoints") oneSetOfNullablePoints: Set[Option[java.awt.geom.Point2D]]
  ) =
    this( oneSetOfNullablePoints = if (oneSetOfNullablePoints == null) Set.empty else oneSetOfNullablePoints)

}
