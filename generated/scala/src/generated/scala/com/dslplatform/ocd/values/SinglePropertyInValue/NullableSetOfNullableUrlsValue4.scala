package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableSetOfNullableUrlsValue4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableUrls: Option[Set[Option[java.net.URI]]] = None
  ) {

    require(nullableSetOfNullableUrls ne null, "Null value was provided for property \"nullableSetOfNullableUrls\"")
    if (nullableSetOfNullableUrls.isDefined) require(nullableSetOfNullableUrls.get ne null, "Null value was provided for property \"nullableSetOfNullableUrls\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableUrls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableUrls") nullableSetOfNullableUrls: Option[Set[Option[java.net.URI]]]
  ) =
    this( nullableSetOfNullableUrls = nullableSetOfNullableUrls)

}
