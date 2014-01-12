package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfNullableUrlsValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableUrls: Set[Option[java.net.URI]] = Set.empty
  ) {

    require(oneSetOfNullableUrls ne null, "Null value was provided for property \"oneSetOfNullableUrls\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableUrls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableUrls") oneSetOfNullableUrls: Set[Option[java.net.URI]]
  ) =
    this( oneSetOfNullableUrls = if (oneSetOfNullableUrls == null) Set.empty else oneSetOfNullableUrls)

}
