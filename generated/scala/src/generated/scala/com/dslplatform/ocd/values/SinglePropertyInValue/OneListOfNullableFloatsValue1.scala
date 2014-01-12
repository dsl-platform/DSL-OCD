package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneListOfNullableFloatsValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableFloats: IndexedSeq[Option[Float]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableFloats ne null, "Null value was provided for property \"oneListOfNullableFloats\"")
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneListOfNullableFloats)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableFloats") oneListOfNullableFloats: IndexedSeq[Option[Float]]
  ) =
    this( oneListOfNullableFloats = if (oneListOfNullableFloats == null) IndexedSeq.empty else oneListOfNullableFloats)

}
