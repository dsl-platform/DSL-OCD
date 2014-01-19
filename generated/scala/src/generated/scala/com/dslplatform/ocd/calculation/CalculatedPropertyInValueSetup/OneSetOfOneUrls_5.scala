package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfOneUrls_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneUrls: Set[java.net.URI] = Set.empty,
     calculatedOneSetOfOneUrls: Set[java.net.URI] = Set.empty,
     persistedOneSetOfOneUrls: Set[java.net.URI] = Set.empty
  ) {

    require(oneSetOfOneUrls ne null, "Null value was provided for property \"oneSetOfOneUrls\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneUrls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneUrls") oneSetOfOneUrls: Set[java.net.URI]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneUrls") calculatedOneSetOfOneUrls: Set[java.net.URI]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneUrls") persistedOneSetOfOneUrls: Set[java.net.URI]
  ) =
    this( oneSetOfOneUrls = if (oneSetOfOneUrls == null) Set.empty else oneSetOfOneUrls, calculatedOneSetOfOneUrls = calculatedOneSetOfOneUrls, persistedOneSetOfOneUrls = persistedOneSetOfOneUrls)

}
