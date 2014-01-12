package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneBooleanValue4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneBoolean: Boolean = false
  ) {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneBoolean") oneBoolean: Boolean
  ) =
    this( oneBoolean = oneBoolean)

}
