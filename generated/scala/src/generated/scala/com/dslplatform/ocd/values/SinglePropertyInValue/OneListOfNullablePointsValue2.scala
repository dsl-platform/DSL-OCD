package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneListOfNullablePointsValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullablePoints: IndexedSeq[Option[java.awt.geom.Point2D]] = IndexedSeq.empty
  ) {

    require(oneListOfNullablePoints ne null, "Null value was provided for property \"oneListOfNullablePoints\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullablePoints)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullablePoints") oneListOfNullablePoints: IndexedSeq[Option[java.awt.geom.Point2D]]
  ) =
    this( oneListOfNullablePoints = if (oneListOfNullablePoints == null) IndexedSeq.empty else oneListOfNullablePoints)

}
