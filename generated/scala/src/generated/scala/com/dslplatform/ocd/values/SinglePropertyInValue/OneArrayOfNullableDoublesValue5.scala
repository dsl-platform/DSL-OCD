package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfNullableDoublesValue5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableDoubles: Array[Option[Double]] = Array.empty
  ) {

    require(oneArrayOfNullableDoubles ne null, "Null value was provided for property \"oneArrayOfNullableDoubles\"")
    com.dslplatform.api.Guards.checkArrayOptionValNulls(oneArrayOfNullableDoubles)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableDoubles") oneArrayOfNullableDoubles: Array[Option[Double]]
  ) =
    this( oneArrayOfNullableDoubles = if (oneArrayOfNullableDoubles == null) Array.empty else oneArrayOfNullableDoubles)

}
