package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfOneUrlsValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneUrls: Option[IndexedSeq[java.net.URI]] = None
  ) {

    require(nullableListOfOneUrls ne null, "Null value was provided for property \"nullableListOfOneUrls\"")
    if (nullableListOfOneUrls.isDefined) require(nullableListOfOneUrls.get ne null, "Null value was provided for property \"nullableListOfOneUrls\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneUrls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneUrls") nullableListOfOneUrls: Option[IndexedSeq[java.net.URI]]
  ) =
    this( nullableListOfOneUrls = nullableListOfOneUrls)

}
