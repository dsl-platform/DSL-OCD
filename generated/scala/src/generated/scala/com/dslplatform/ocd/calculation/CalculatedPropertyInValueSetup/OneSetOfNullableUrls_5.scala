package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfNullableUrls_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableUrls: Set[Option[java.net.URI]] = Set.empty,
     calculatedOneSetOfNullableUrls: Set[Option[java.net.URI]] = Set.empty,
     persistedOneSetOfNullableUrls: Set[Option[java.net.URI]] = Set.empty
  ) {

    require(oneSetOfNullableUrls ne null, "Null value was provided for property \"oneSetOfNullableUrls\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableUrls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableUrls") oneSetOfNullableUrls: Set[Option[java.net.URI]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableUrls") calculatedOneSetOfNullableUrls: Set[Option[java.net.URI]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableUrls") persistedOneSetOfNullableUrls: Set[Option[java.net.URI]]
  ) =
    this( oneSetOfNullableUrls = if (oneSetOfNullableUrls == null) Set.empty else oneSetOfNullableUrls, calculatedOneSetOfNullableUrls = calculatedOneSetOfNullableUrls, persistedOneSetOfNullableUrls = persistedOneSetOfNullableUrls)

}
