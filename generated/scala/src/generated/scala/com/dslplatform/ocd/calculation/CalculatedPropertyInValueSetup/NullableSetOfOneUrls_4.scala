package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfOneUrls_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneUrls: Option[Set[java.net.URI]] = None,
     calculatedNullableSetOfOneUrls: Option[Set[java.net.URI]] = None,
     persistedNullableSetOfOneUrls: Option[Set[java.net.URI]] = None
  ) {

    require(nullableSetOfOneUrls ne null, "Null value was provided for property \"nullableSetOfOneUrls\"")
    if (nullableSetOfOneUrls.isDefined) require(nullableSetOfOneUrls.get ne null, "Null value was provided for property \"nullableSetOfOneUrls\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneUrls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneUrls") nullableSetOfOneUrls: Option[Set[java.net.URI]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneUrls") calculatedNullableSetOfOneUrls: Option[Set[java.net.URI]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneUrls") persistedNullableSetOfOneUrls: Option[Set[java.net.URI]]
  ) =
    this( nullableSetOfOneUrls = nullableSetOfOneUrls, calculatedNullableSetOfOneUrls = calculatedNullableSetOfOneUrls, persistedNullableSetOfOneUrls = persistedNullableSetOfOneUrls)

}
