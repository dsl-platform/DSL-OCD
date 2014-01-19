package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfNullableUrls_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableUrls: Option[Set[Option[java.net.URI]]] = None,
     calculatedNullableSetOfNullableUrls: Option[Set[Option[java.net.URI]]] = None,
     persistedNullableSetOfNullableUrls: Option[Set[Option[java.net.URI]]] = None
  ) {

    require(nullableSetOfNullableUrls ne null, "Null value was provided for property \"nullableSetOfNullableUrls\"")
    if (nullableSetOfNullableUrls.isDefined) require(nullableSetOfNullableUrls.get ne null, "Null value was provided for property \"nullableSetOfNullableUrls\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableUrls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableUrls") nullableSetOfNullableUrls: Option[Set[Option[java.net.URI]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableUrls") calculatedNullableSetOfNullableUrls: Option[Set[Option[java.net.URI]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableUrls") persistedNullableSetOfNullableUrls: Option[Set[Option[java.net.URI]]]
  ) =
    this( nullableSetOfNullableUrls = nullableSetOfNullableUrls, calculatedNullableSetOfNullableUrls = calculatedNullableSetOfNullableUrls, persistedNullableSetOfNullableUrls = persistedNullableSetOfNullableUrls)

}
