package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfNullableUrls_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullableUrls: Option[IndexedSeq[Option[java.net.URI]]] = None,
     calculatedNullableListOfNullableUrls: Option[IndexedSeq[Option[java.net.URI]]] = None,
     persistedNullableListOfNullableUrls: Option[IndexedSeq[Option[java.net.URI]]] = None
  ) {

    require(nullableListOfNullableUrls ne null, "Null value was provided for property \"nullableListOfNullableUrls\"")
    if (nullableListOfNullableUrls.isDefined) require(nullableListOfNullableUrls.get ne null, "Null value was provided for property \"nullableListOfNullableUrls\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableUrls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableUrls") nullableListOfNullableUrls: Option[IndexedSeq[Option[java.net.URI]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableUrls") calculatedNullableListOfNullableUrls: Option[IndexedSeq[Option[java.net.URI]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableUrls") persistedNullableListOfNullableUrls: Option[IndexedSeq[Option[java.net.URI]]]
  ) =
    this( nullableListOfNullableUrls = nullableListOfNullableUrls, calculatedNullableListOfNullableUrls = calculatedNullableListOfNullableUrls, persistedNullableListOfNullableUrls = persistedNullableListOfNullableUrls)

}
