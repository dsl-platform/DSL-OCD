package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableUrlValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableUrl: Option[java.net.URI] = None
  ) {

    require(nullableUrl ne null, "Null value was provided for property \"nullableUrl\"")
    if (nullableUrl.isDefined) require(nullableUrl.get ne null, "Null value was provided for property \"nullableUrl\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableUrl") nullableUrl: Option[java.net.URI]
  ) =
    this( nullableUrl = nullableUrl)

}
