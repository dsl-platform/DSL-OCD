package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneListOfNullableIntegersValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableIntegers: IndexedSeq[Option[Int]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableIntegers ne null, "Null value was provided for property \"oneListOfNullableIntegers\"")
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneListOfNullableIntegers)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableIntegers") oneListOfNullableIntegers: IndexedSeq[Option[Int]]
  ) =
    this( oneListOfNullableIntegers = if (oneListOfNullableIntegers == null) IndexedSeq.empty else oneListOfNullableIntegers)

}
