package com.dslplatform.ocd.values.PropertyInValue

case class OneBoolean_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneBoolean: Boolean = false
  ) {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneBoolean") oneBoolean: Boolean
  ) =
    this( oneBoolean = oneBoolean)

}