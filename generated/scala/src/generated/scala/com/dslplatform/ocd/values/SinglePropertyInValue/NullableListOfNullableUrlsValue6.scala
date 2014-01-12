package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfNullableUrlsValue6 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullableUrls: Option[IndexedSeq[Option[java.net.URI]]] = None
  ) {

    require(nullableListOfNullableUrls ne null, "Null value was provided for property \"nullableListOfNullableUrls\"")
    if (nullableListOfNullableUrls.isDefined) require(nullableListOfNullableUrls.get ne null, "Null value was provided for property \"nullableListOfNullableUrls\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableUrls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableUrls") nullableListOfNullableUrls: Option[IndexedSeq[Option[java.net.URI]]]
  ) =
    this( nullableListOfNullableUrls = nullableListOfNullableUrls)

}
