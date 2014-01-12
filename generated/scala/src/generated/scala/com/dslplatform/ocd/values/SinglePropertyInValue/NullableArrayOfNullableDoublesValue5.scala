package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableArrayOfNullableDoublesValue5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableDoubles: Option[Array[Option[Double]]] = None
  ) {

    require(nullableArrayOfNullableDoubles ne null, "Null value was provided for property \"nullableArrayOfNullableDoubles\"")
    if (nullableArrayOfNullableDoubles.isDefined) require(nullableArrayOfNullableDoubles.get ne null, "Null value was provided for property \"nullableArrayOfNullableDoubles\"")
    com.dslplatform.api.Guards.checkArrayOptionValNulls(nullableArrayOfNullableDoubles)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableDoubles") nullableArrayOfNullableDoubles: Option[Array[Option[Double]]]
  ) =
    this( nullableArrayOfNullableDoubles = nullableArrayOfNullableDoubles)

}
