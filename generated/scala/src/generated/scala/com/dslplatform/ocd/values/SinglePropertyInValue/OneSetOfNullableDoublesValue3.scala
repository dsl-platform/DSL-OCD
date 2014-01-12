package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfNullableDoublesValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableDoubles: Set[Option[Double]] = Set.empty
  ) {

    require(oneSetOfNullableDoubles ne null, "Null value was provided for property \"oneSetOfNullableDoubles\"")
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneSetOfNullableDoubles)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableDoubles") oneSetOfNullableDoubles: Set[Option[Double]]
  ) =
    this( oneSetOfNullableDoubles = if (oneSetOfNullableDoubles == null) Set.empty else oneSetOfNullableDoubles)

}
