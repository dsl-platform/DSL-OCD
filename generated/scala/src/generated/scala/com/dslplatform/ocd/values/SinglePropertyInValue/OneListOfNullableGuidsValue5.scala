package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneListOfNullableGuidsValue5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableGuids: IndexedSeq[Option[java.util.UUID]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableGuids ne null, "Null value was provided for property \"oneListOfNullableGuids\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableGuids)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableGuids") oneListOfNullableGuids: IndexedSeq[Option[java.util.UUID]]
  ) =
    this( oneListOfNullableGuids = if (oneListOfNullableGuids == null) IndexedSeq.empty else oneListOfNullableGuids)

}
