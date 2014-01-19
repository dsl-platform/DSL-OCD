package com.dslplatform.ocd.values.PropertyInValue

case class OneUrl_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneUrl: java.net.URI = null
  ) {

    require(oneUrl ne null, "Null value was provided for property \"oneUrl\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneUrl") oneUrl: java.net.URI
  ) =
    this( oneUrl = if (oneUrl == null) null else oneUrl)

}
