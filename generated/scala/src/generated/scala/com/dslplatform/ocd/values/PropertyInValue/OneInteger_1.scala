package com.dslplatform.ocd.values.PropertyInValue

case class OneInteger_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneInteger: Int = 0
  ) {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneInteger") oneInteger: Int
  ) =
    this( oneInteger = oneInteger)

}
