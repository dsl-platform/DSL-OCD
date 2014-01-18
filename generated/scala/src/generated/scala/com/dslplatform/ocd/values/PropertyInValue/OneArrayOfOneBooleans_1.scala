package com.dslplatform.ocd.values.PropertyInValue

case class OneArrayOfOneBooleans_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneBooleans: Array[Boolean] = Array.empty
  ) {

    require(oneArrayOfOneBooleans ne null, "Null value was provided for property \"oneArrayOfOneBooleans\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneBooleans") oneArrayOfOneBooleans: Array[Boolean]
  ) =
    this( oneArrayOfOneBooleans = if (oneArrayOfOneBooleans == null) Array.empty else oneArrayOfOneBooleans)

}
