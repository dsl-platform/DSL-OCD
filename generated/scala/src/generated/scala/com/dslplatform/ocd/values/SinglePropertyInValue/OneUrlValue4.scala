package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneUrlValue4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneUrl: java.net.URI = ???
  ) {

    require(oneUrl ne null, "Null value was provided for property \"oneUrl\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneUrl") oneUrl: java.net.URI
  ) =
    this( oneUrl = if (oneUrl == null) ??? else oneUrl)

}
