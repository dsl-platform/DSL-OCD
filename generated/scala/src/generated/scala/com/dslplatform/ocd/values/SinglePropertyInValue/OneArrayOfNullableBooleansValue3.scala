package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfNullableBooleansValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableBooleans: Array[Option[Boolean]] = Array.empty
  ) {

    require(oneArrayOfNullableBooleans ne null, "Null value was provided for property \"oneArrayOfNullableBooleans\"")
    com.dslplatform.api.Guards.checkArrayOptionValNulls(oneArrayOfNullableBooleans)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableBooleans") oneArrayOfNullableBooleans: Array[Option[Boolean]]
  ) =
    this( oneArrayOfNullableBooleans = if (oneArrayOfNullableBooleans == null) Array.empty else oneArrayOfNullableBooleans)

}
