package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneListOfOneLongsValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneLongs: IndexedSeq[Long] = IndexedSeq.empty
  ) {

    require(oneListOfOneLongs ne null, "Null value was provided for property \"oneListOfOneLongs\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneLongs") oneListOfOneLongs: IndexedSeq[Long]
  ) =
    this( oneListOfOneLongs = if (oneListOfOneLongs == null) IndexedSeq.empty else oneListOfOneLongs)

}
