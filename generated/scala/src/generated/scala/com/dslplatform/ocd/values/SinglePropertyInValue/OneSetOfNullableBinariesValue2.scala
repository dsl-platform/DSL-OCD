package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfNullableBinariesValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableBinaries: Set[Option[Array[Byte]]] = Set.empty
  ) {

    require(oneSetOfNullableBinaries ne null, "Null value was provided for property \"oneSetOfNullableBinaries\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableBinaries)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableBinaries") oneSetOfNullableBinaries: Set[Option[Array[Byte]]]
  ) =
    this( oneSetOfNullableBinaries = if (oneSetOfNullableBinaries == null) Set.empty else oneSetOfNullableBinaries)

}
