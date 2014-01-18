package com.dslplatform.ocd.values.PropertyInValue

case class OneDouble_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneDouble: Double = 0
  ) {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneDouble") oneDouble: Double
  ) =
    this( oneDouble = oneDouble)

}
