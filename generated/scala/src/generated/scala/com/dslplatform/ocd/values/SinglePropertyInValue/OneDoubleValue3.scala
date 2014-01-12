package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneDoubleValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneDouble: Double = 0
  ) {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneDouble") oneDouble: Double
  ) =
    this( oneDouble = oneDouble)

}
