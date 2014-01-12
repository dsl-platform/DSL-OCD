package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableArrayOfOneUrlsValue7 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneUrls: Option[Array[java.net.URI]] = None
  ) {

    require(nullableArrayOfOneUrls ne null, "Null value was provided for property \"nullableArrayOfOneUrls\"")
    if (nullableArrayOfOneUrls.isDefined) require(nullableArrayOfOneUrls.get ne null, "Null value was provided for property \"nullableArrayOfOneUrls\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneUrls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneUrls") nullableArrayOfOneUrls: Option[Array[java.net.URI]]
  ) =
    this( nullableArrayOfOneUrls = nullableArrayOfOneUrls)

}
