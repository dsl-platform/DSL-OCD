package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneListOfOneStringsValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneStrings: IndexedSeq[String] = IndexedSeq.empty
  ) {

    require(oneListOfOneStrings ne null, "Null value was provided for property \"oneListOfOneStrings\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneStrings)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneStrings") oneListOfOneStrings: IndexedSeq[String]
  ) =
    this( oneListOfOneStrings = if (oneListOfOneStrings == null) IndexedSeq.empty else oneListOfOneStrings)

}
