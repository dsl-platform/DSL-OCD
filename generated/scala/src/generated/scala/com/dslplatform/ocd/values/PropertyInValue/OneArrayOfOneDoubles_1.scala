package com.dslplatform.ocd.values.PropertyInValue

case class OneArrayOfOneDoubles_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneDoubles: Array[Double] = Array.empty
  ) {

    require(oneArrayOfOneDoubles ne null, "Null value was provided for property \"oneArrayOfOneDoubles\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneDoubles") oneArrayOfOneDoubles: Array[Double]
  ) =
    this( oneArrayOfOneDoubles = if (oneArrayOfOneDoubles == null) Array.empty else oneArrayOfOneDoubles)

}
