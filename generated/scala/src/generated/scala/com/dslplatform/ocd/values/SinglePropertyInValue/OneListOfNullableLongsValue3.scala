package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneListOfNullableLongsValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableLongs: IndexedSeq[Option[Long]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableLongs ne null, "Null value was provided for property \"oneListOfNullableLongs\"")
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneListOfNullableLongs)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableLongs") oneListOfNullableLongs: IndexedSeq[Option[Long]]
  ) =
    this( oneListOfNullableLongs = if (oneListOfNullableLongs == null) IndexedSeq.empty else oneListOfNullableLongs)

}
