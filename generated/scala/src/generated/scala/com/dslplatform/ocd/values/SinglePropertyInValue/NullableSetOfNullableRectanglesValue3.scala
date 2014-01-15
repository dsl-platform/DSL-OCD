package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableSetOfNullableRectanglesValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableRectangles: Option[Set[Option[java.awt.geom.Rectangle2D]]] = None
  ) {

    require(nullableSetOfNullableRectangles ne null, "Null value was provided for property \"nullableSetOfNullableRectangles\"")
    if (nullableSetOfNullableRectangles.isDefined) require(nullableSetOfNullableRectangles.get ne null, "Null value was provided for property \"nullableSetOfNullableRectangles\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableRectangles)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableRectangles") nullableSetOfNullableRectangles: Option[Set[Option[java.awt.geom.Rectangle2D]]]
  ) =
    this( nullableSetOfNullableRectangles = nullableSetOfNullableRectangles)

}
