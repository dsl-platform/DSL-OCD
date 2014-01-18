package com.dslplatform.ocd.values.PropertyInValue

case class OneLong_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneLong: Long = 0
  ) {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneLong") oneLong: Long
  ) =
    this( oneLong = oneLong)

}
