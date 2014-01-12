package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfOneUrlsValue4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneUrls: Array[java.net.URI] = Array.empty
  ) {

    require(oneArrayOfOneUrls ne null, "Null value was provided for property \"oneArrayOfOneUrls\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneUrls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneUrls") oneArrayOfOneUrls: Array[java.net.URI]
  ) =
    this( oneArrayOfOneUrls = if (oneArrayOfOneUrls == null) Array.empty else oneArrayOfOneUrls)

}
