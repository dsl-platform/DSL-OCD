package com.dslplatform.ocd.values.PropertyInValue

case class OneListOfOneBinaries_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneBinaries: IndexedSeq[Array[Byte]] = IndexedSeq.empty
  ) {

    require(oneListOfOneBinaries ne null, "Null value was provided for property \"oneListOfOneBinaries\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneBinaries)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneBinaries") oneListOfOneBinaries: IndexedSeq[Array[Byte]]
  ) =
    this( oneListOfOneBinaries = if (oneListOfOneBinaries == null) IndexedSeq.empty else oneListOfOneBinaries)

}
