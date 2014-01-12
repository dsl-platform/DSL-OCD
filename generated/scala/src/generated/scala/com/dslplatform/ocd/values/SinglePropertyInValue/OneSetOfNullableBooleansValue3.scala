package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfNullableBooleansValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableBooleans: Set[Option[Boolean]] = Set.empty
  ) {

    require(oneSetOfNullableBooleans ne null, "Null value was provided for property \"oneSetOfNullableBooleans\"")
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneSetOfNullableBooleans)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableBooleans") oneSetOfNullableBooleans: Set[Option[Boolean]]
  ) =
    this( oneSetOfNullableBooleans = if (oneSetOfNullableBooleans == null) Set.empty else oneSetOfNullableBooleans)

}
