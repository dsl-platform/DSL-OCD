package com.dslplatform.ocd.values.PropertyInValue

case class OneSetOfOneRectangles_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneRectangles: Set[java.awt.geom.Rectangle2D] = Set.empty
  ) {

    require(oneSetOfOneRectangles ne null, "Null value was provided for property \"oneSetOfOneRectangles\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneRectangles)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneRectangles") oneSetOfOneRectangles: Set[java.awt.geom.Rectangle2D]
  ) =
    this( oneSetOfOneRectangles = if (oneSetOfOneRectangles == null) Set.empty else oneSetOfOneRectangles)

}
