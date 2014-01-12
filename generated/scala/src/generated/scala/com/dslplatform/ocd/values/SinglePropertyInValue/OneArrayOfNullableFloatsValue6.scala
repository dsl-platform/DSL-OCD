package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfNullableFloatsValue6 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableFloats: Array[Option[Float]] = Array.empty
  ) {

    require(oneArrayOfNullableFloats ne null, "Null value was provided for property \"oneArrayOfNullableFloats\"")
    com.dslplatform.api.Guards.checkArrayOptionValNulls(oneArrayOfNullableFloats)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableFloats") oneArrayOfNullableFloats: Array[Option[Float]]
  ) =
    this( oneArrayOfNullableFloats = if (oneArrayOfNullableFloats == null) Array.empty else oneArrayOfNullableFloats)

}
