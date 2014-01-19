package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfNullableStringsWithMaxLengthOf9_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableStringsWithMaxLengthOf9: Set[Option[String]] = Set.empty,
     calculatedOneSetOfNullableStringsWithMaxLengthOf9: Set[Option[String]] = Set.empty,
     persistedOneSetOfNullableStringsWithMaxLengthOf9: Set[Option[String]] = Set.empty
  ) {

    require(oneSetOfNullableStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"oneSetOfNullableStringsWithMaxLengthOf9\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableStringsWithMaxLengthOf9)
    com.dslplatform.api.Guards.checkCollectionOptionLength(oneSetOfNullableStringsWithMaxLengthOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableStringsWithMaxLengthOf9") oneSetOfNullableStringsWithMaxLengthOf9: Set[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableStringsWithMaxLengthOf9") calculatedOneSetOfNullableStringsWithMaxLengthOf9: Set[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableStringsWithMaxLengthOf9") persistedOneSetOfNullableStringsWithMaxLengthOf9: Set[Option[String]]
  ) =
    this( oneSetOfNullableStringsWithMaxLengthOf9 = if (oneSetOfNullableStringsWithMaxLengthOf9 == null) Set.empty else oneSetOfNullableStringsWithMaxLengthOf9, calculatedOneSetOfNullableStringsWithMaxLengthOf9 = calculatedOneSetOfNullableStringsWithMaxLengthOf9, persistedOneSetOfNullableStringsWithMaxLengthOf9 = persistedOneSetOfNullableStringsWithMaxLengthOf9)

}
