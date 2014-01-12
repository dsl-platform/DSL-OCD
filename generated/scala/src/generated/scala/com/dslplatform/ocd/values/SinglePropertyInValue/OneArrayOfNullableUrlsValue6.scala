package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfNullableUrlsValue6 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableUrls: Array[Option[java.net.URI]] = Array.empty
  ) {

    require(oneArrayOfNullableUrls ne null, "Null value was provided for property \"oneArrayOfNullableUrls\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableUrls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableUrls") oneArrayOfNullableUrls: Array[Option[java.net.URI]]
  ) =
    this( oneArrayOfNullableUrls = if (oneArrayOfNullableUrls == null) Array.empty else oneArrayOfNullableUrls)

}
