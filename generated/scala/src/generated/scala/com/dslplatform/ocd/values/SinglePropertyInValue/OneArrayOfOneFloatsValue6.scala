package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfOneFloatsValue6 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneFloats: Array[Float] = Array.empty
  ) {

    require(oneArrayOfOneFloats ne null, "Null value was provided for property \"oneArrayOfOneFloats\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneFloats") oneArrayOfOneFloats: Array[Float]
  ) =
    this( oneArrayOfOneFloats = if (oneArrayOfOneFloats == null) Array.empty else oneArrayOfOneFloats)

}
