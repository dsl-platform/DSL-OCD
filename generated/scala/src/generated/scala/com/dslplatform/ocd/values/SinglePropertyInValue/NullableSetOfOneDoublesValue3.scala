package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableSetOfOneDoublesValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneDoubles: Option[Set[Double]] = None
  ) {

    require(nullableSetOfOneDoubles ne null, "Null value was provided for property \"nullableSetOfOneDoubles\"")
    if (nullableSetOfOneDoubles.isDefined) require(nullableSetOfOneDoubles.get ne null, "Null value was provided for property \"nullableSetOfOneDoubles\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneDoubles") nullableSetOfOneDoubles: Option[Set[Double]]
  ) =
    this( nullableSetOfOneDoubles = nullableSetOfOneDoubles)

}
