package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfOneUrls_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneUrls: Option[IndexedSeq[java.net.URI]] = None,
     calculatedNullableListOfOneUrls: Option[IndexedSeq[java.net.URI]] = None,
     persistedNullableListOfOneUrls: Option[IndexedSeq[java.net.URI]] = None
  ) {

    require(nullableListOfOneUrls ne null, "Null value was provided for property \"nullableListOfOneUrls\"")
    if (nullableListOfOneUrls.isDefined) require(nullableListOfOneUrls.get ne null, "Null value was provided for property \"nullableListOfOneUrls\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneUrls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneUrls") nullableListOfOneUrls: Option[IndexedSeq[java.net.URI]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneUrls") calculatedNullableListOfOneUrls: Option[IndexedSeq[java.net.URI]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneUrls") persistedNullableListOfOneUrls: Option[IndexedSeq[java.net.URI]]
  ) =
    this( nullableListOfOneUrls = nullableListOfOneUrls, calculatedNullableListOfOneUrls = calculatedNullableListOfOneUrls, persistedNullableListOfOneUrls = persistedNullableListOfOneUrls)

}
