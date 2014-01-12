package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfNullablePointsValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullablePoints: Array[Option[java.awt.geom.Point2D]] = Array.empty
  ) {

    require(oneArrayOfNullablePoints ne null, "Null value was provided for property \"oneArrayOfNullablePoints\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullablePoints)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullablePoints") oneArrayOfNullablePoints: Array[Option[java.awt.geom.Point2D]]
  ) =
    this( oneArrayOfNullablePoints = if (oneArrayOfNullablePoints == null) Array.empty else oneArrayOfNullablePoints)

}
