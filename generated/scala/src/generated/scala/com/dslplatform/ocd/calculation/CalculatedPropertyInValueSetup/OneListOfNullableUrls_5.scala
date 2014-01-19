package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfNullableUrls_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableUrls: IndexedSeq[Option[java.net.URI]] = IndexedSeq.empty,
     calculatedOneListOfNullableUrls: IndexedSeq[Option[java.net.URI]] = IndexedSeq.empty,
     persistedOneListOfNullableUrls: IndexedSeq[Option[java.net.URI]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableUrls ne null, "Null value was provided for property \"oneListOfNullableUrls\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableUrls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableUrls") oneListOfNullableUrls: IndexedSeq[Option[java.net.URI]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableUrls") calculatedOneListOfNullableUrls: IndexedSeq[Option[java.net.URI]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableUrls") persistedOneListOfNullableUrls: IndexedSeq[Option[java.net.URI]]
  ) =
    this( oneListOfNullableUrls = if (oneListOfNullableUrls == null) IndexedSeq.empty else oneListOfNullableUrls, calculatedOneListOfNullableUrls = calculatedOneListOfNullableUrls, persistedOneListOfNullableUrls = persistedOneListOfNullableUrls)

}
