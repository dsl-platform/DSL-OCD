package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfOneBinariesValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneBinaries: Set[Array[Byte]] = Set.empty
  ) {

    require(oneSetOfOneBinaries ne null, "Null value was provided for property \"oneSetOfOneBinaries\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneBinaries)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneBinaries") oneSetOfOneBinaries: Set[Array[Byte]]
  ) =
    this( oneSetOfOneBinaries = if (oneSetOfOneBinaries == null) Set.empty else oneSetOfOneBinaries)

}
