package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneListOfNullableBinariesValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableBinaries: IndexedSeq[Option[Array[Byte]]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableBinaries ne null, "Null value was provided for property \"oneListOfNullableBinaries\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableBinaries)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableBinaries") oneListOfNullableBinaries: IndexedSeq[Option[Array[Byte]]]
  ) =
    this( oneListOfNullableBinaries = if (oneListOfNullableBinaries == null) IndexedSeq.empty else oneListOfNullableBinaries)

}
