package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfOneDoublesValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneDoubles: Option[IndexedSeq[Double]] = None
  ) {

    require(nullableListOfOneDoubles ne null, "Null value was provided for property \"nullableListOfOneDoubles\"")
    if (nullableListOfOneDoubles.isDefined) require(nullableListOfOneDoubles.get ne null, "Null value was provided for property \"nullableListOfOneDoubles\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneDoubles") nullableListOfOneDoubles: Option[IndexedSeq[Double]]
  ) =
    this( nullableListOfOneDoubles = nullableListOfOneDoubles)

}
