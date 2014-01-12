package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneLongValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneLong: Long = 0
  ) {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneLong") oneLong: Long
  ) =
    this( oneLong = oneLong)

}
