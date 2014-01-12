package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfOneGuidsValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneGuids: Set[java.util.UUID] = Set.empty
  ) {

    require(oneSetOfOneGuids ne null, "Null value was provided for property \"oneSetOfOneGuids\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneGuids)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneGuids") oneSetOfOneGuids: Set[java.util.UUID]
  ) =
    this( oneSetOfOneGuids = if (oneSetOfOneGuids == null) Set.empty else oneSetOfOneGuids)

}
