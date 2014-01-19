package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfNullableStringsWithMaxLengthOf9_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableStringsWithMaxLengthOf9: IndexedSeq[Option[String]] = IndexedSeq.empty,
     calculatedOneListOfNullableStringsWithMaxLengthOf9: IndexedSeq[Option[String]] = IndexedSeq.empty,
     persistedOneListOfNullableStringsWithMaxLengthOf9: IndexedSeq[Option[String]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"oneListOfNullableStringsWithMaxLengthOf9\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableStringsWithMaxLengthOf9)
    com.dslplatform.api.Guards.checkCollectionOptionLength(oneListOfNullableStringsWithMaxLengthOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableStringsWithMaxLengthOf9") oneListOfNullableStringsWithMaxLengthOf9: IndexedSeq[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableStringsWithMaxLengthOf9") calculatedOneListOfNullableStringsWithMaxLengthOf9: IndexedSeq[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableStringsWithMaxLengthOf9") persistedOneListOfNullableStringsWithMaxLengthOf9: IndexedSeq[Option[String]]
  ) =
    this( oneListOfNullableStringsWithMaxLengthOf9 = if (oneListOfNullableStringsWithMaxLengthOf9 == null) IndexedSeq.empty else oneListOfNullableStringsWithMaxLengthOf9, calculatedOneListOfNullableStringsWithMaxLengthOf9 = calculatedOneListOfNullableStringsWithMaxLengthOf9, persistedOneListOfNullableStringsWithMaxLengthOf9 = persistedOneListOfNullableStringsWithMaxLengthOf9)

}
