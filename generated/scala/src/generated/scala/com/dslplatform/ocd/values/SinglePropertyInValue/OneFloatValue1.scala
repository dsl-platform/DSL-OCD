package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneFloatValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneFloat: Float = 0.0f
  ) {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneFloat") oneFloat: Float
  ) =
    this( oneFloat = oneFloat)

}
