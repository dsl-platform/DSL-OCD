package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneListOfNullableDoublesValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableDoubles: IndexedSeq[Option[Double]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableDoubles ne null, "Null value was provided for property \"oneListOfNullableDoubles\"")
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneListOfNullableDoubles)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableDoubles") oneListOfNullableDoubles: IndexedSeq[Option[Double]]
  ) =
    this( oneListOfNullableDoubles = if (oneListOfNullableDoubles == null) IndexedSeq.empty else oneListOfNullableDoubles)

}
