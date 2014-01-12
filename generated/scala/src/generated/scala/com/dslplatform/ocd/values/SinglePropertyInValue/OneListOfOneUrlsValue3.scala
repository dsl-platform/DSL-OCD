package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneListOfOneUrlsValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneUrls: IndexedSeq[java.net.URI] = IndexedSeq.empty
  ) {

    require(oneListOfOneUrls ne null, "Null value was provided for property \"oneListOfOneUrls\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneUrls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneUrls") oneListOfOneUrls: IndexedSeq[java.net.URI]
  ) =
    this( oneListOfOneUrls = if (oneListOfOneUrls == null) IndexedSeq.empty else oneListOfOneUrls)

}
