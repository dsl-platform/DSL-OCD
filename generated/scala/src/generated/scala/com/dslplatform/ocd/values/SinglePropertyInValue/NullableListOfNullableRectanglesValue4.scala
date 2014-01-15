package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfNullableRectanglesValue4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullableRectangles: Option[IndexedSeq[Option[java.awt.geom.Rectangle2D]]] = None
  ) {

    require(nullableListOfNullableRectangles ne null, "Null value was provided for property \"nullableListOfNullableRectangles\"")
    if (nullableListOfNullableRectangles.isDefined) require(nullableListOfNullableRectangles.get ne null, "Null value was provided for property \"nullableListOfNullableRectangles\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableRectangles)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableRectangles") nullableListOfNullableRectangles: Option[IndexedSeq[Option[java.awt.geom.Rectangle2D]]]
  ) =
    this( nullableListOfNullableRectangles = nullableListOfNullableRectangles)

}
