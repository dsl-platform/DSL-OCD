package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfNullableStringsWithMaxLengthOf9Value2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableStringsWithMaxLengthOf9: Set[Option[String]] = Set.empty
  ) {

    require(oneSetOfNullableStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"oneSetOfNullableStringsWithMaxLengthOf9\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableStringsWithMaxLengthOf9)
    com.dslplatform.api.Guards.checkCollectionOptionLength(oneSetOfNullableStringsWithMaxLengthOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableStringsWithMaxLengthOf9") oneSetOfNullableStringsWithMaxLengthOf9: Set[Option[String]]
  ) =
    this( oneSetOfNullableStringsWithMaxLengthOf9 = if (oneSetOfNullableStringsWithMaxLengthOf9 == null) Set.empty else oneSetOfNullableStringsWithMaxLengthOf9)

}
