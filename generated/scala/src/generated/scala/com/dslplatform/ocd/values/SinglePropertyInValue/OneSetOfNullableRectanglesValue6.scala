package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfNullableRectanglesValue6 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableRectangles: Set[Option[java.awt.geom.Rectangle2D]] = Set.empty
  ) {

    require(oneSetOfNullableRectangles ne null, "Null value was provided for property \"oneSetOfNullableRectangles\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableRectangles)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableRectangles") oneSetOfNullableRectangles: Set[Option[java.awt.geom.Rectangle2D]]
  ) =
    this( oneSetOfNullableRectangles = if (oneSetOfNullableRectangles == null) Set.empty else oneSetOfNullableRectangles)

}
