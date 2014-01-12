package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfNullableIntegersValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableIntegers: Set[Option[Int]] = Set.empty
  ) {

    require(oneSetOfNullableIntegers ne null, "Null value was provided for property \"oneSetOfNullableIntegers\"")
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneSetOfNullableIntegers)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableIntegers") oneSetOfNullableIntegers: Set[Option[Int]]
  ) =
    this( oneSetOfNullableIntegers = if (oneSetOfNullableIntegers == null) Set.empty else oneSetOfNullableIntegers)

}
