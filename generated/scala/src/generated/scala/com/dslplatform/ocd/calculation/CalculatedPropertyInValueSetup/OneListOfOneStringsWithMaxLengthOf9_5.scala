package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfOneStringsWithMaxLengthOf9_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneStringsWithMaxLengthOf9: IndexedSeq[String] = IndexedSeq.empty,
     calculatedOneListOfOneStringsWithMaxLengthOf9: IndexedSeq[String] = IndexedSeq.empty,
     persistedOneListOfOneStringsWithMaxLengthOf9: IndexedSeq[String] = IndexedSeq.empty
  ) {

    require(oneListOfOneStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"oneListOfOneStringsWithMaxLengthOf9\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneStringsWithMaxLengthOf9)
    com.dslplatform.api.Guards.checkCollectionLength(oneListOfOneStringsWithMaxLengthOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneStringsWithMaxLengthOf9") oneListOfOneStringsWithMaxLengthOf9: IndexedSeq[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneStringsWithMaxLengthOf9") calculatedOneListOfOneStringsWithMaxLengthOf9: IndexedSeq[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneStringsWithMaxLengthOf9") persistedOneListOfOneStringsWithMaxLengthOf9: IndexedSeq[String]
  ) =
    this( oneListOfOneStringsWithMaxLengthOf9 = if (oneListOfOneStringsWithMaxLengthOf9 == null) IndexedSeq.empty else oneListOfOneStringsWithMaxLengthOf9, calculatedOneListOfOneStringsWithMaxLengthOf9 = calculatedOneListOfOneStringsWithMaxLengthOf9, persistedOneListOfOneStringsWithMaxLengthOf9 = persistedOneListOfOneStringsWithMaxLengthOf9)

}
