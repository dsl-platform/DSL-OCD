package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableArrayOfOneDoublesValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneDoubles: Option[Array[Double]] = None
  ) {

    require(nullableArrayOfOneDoubles ne null, "Null value was provided for property \"nullableArrayOfOneDoubles\"")
    if (nullableArrayOfOneDoubles.isDefined) require(nullableArrayOfOneDoubles.get ne null, "Null value was provided for property \"nullableArrayOfOneDoubles\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneDoubles") nullableArrayOfOneDoubles: Option[Array[Double]]
  ) =
    this( nullableArrayOfOneDoubles = nullableArrayOfOneDoubles)

}
