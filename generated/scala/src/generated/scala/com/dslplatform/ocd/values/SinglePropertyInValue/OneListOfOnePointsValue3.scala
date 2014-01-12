package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneListOfOnePointsValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOnePoints: IndexedSeq[java.awt.geom.Point2D] = IndexedSeq.empty
  ) {

    require(oneListOfOnePoints ne null, "Null value was provided for property \"oneListOfOnePoints\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOnePoints)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOnePoints") oneListOfOnePoints: IndexedSeq[java.awt.geom.Point2D]
  ) =
    this( oneListOfOnePoints = if (oneListOfOnePoints == null) IndexedSeq.empty else oneListOfOnePoints)

}
