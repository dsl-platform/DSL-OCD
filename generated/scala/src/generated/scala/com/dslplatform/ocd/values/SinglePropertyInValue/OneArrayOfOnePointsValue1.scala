package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfOnePointsValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOnePoints: Array[java.awt.geom.Point2D] = Array.empty
  ) {

    require(oneArrayOfOnePoints ne null, "Null value was provided for property \"oneArrayOfOnePoints\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOnePoints)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOnePoints") oneArrayOfOnePoints: Array[java.awt.geom.Point2D]
  ) =
    this( oneArrayOfOnePoints = if (oneArrayOfOnePoints == null) Array.empty else oneArrayOfOnePoints)

}
