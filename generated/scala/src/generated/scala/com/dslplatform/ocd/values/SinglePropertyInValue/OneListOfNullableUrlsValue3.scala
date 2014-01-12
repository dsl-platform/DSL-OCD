package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneListOfNullableUrlsValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableUrls: IndexedSeq[Option[java.net.URI]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableUrls ne null, "Null value was provided for property \"oneListOfNullableUrls\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableUrls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableUrls") oneListOfNullableUrls: IndexedSeq[Option[java.net.URI]]
  ) =
    this( oneListOfNullableUrls = if (oneListOfNullableUrls == null) IndexedSeq.empty else oneListOfNullableUrls)

}
