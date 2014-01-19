package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfOneUrls_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneUrls: IndexedSeq[java.net.URI] = IndexedSeq.empty,
     calculatedOneListOfOneUrls: IndexedSeq[java.net.URI] = IndexedSeq.empty,
     persistedOneListOfOneUrls: IndexedSeq[java.net.URI] = IndexedSeq.empty
  ) {

    require(oneListOfOneUrls ne null, "Null value was provided for property \"oneListOfOneUrls\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneUrls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneUrls") oneListOfOneUrls: IndexedSeq[java.net.URI]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneUrls") calculatedOneListOfOneUrls: IndexedSeq[java.net.URI]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneUrls") persistedOneListOfOneUrls: IndexedSeq[java.net.URI]
  ) =
    this( oneListOfOneUrls = if (oneListOfOneUrls == null) IndexedSeq.empty else oneListOfOneUrls, calculatedOneListOfOneUrls = calculatedOneListOfOneUrls, persistedOneListOfOneUrls = persistedOneListOfOneUrls)

}
