package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfNullableGuidsValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableGuids: Set[Option[java.util.UUID]] = Set.empty
  ) {

    require(oneSetOfNullableGuids ne null, "Null value was provided for property \"oneSetOfNullableGuids\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableGuids)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableGuids") oneSetOfNullableGuids: Set[Option[java.util.UUID]]
  ) =
    this( oneSetOfNullableGuids = if (oneSetOfNullableGuids == null) Set.empty else oneSetOfNullableGuids)

}
