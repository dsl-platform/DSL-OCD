package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneListOfOneStringsWithMaxLengthOf9Value2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneStringsWithMaxLengthOf9: IndexedSeq[String] = IndexedSeq.empty
  ) {

    require(oneListOfOneStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"oneListOfOneStringsWithMaxLengthOf9\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneStringsWithMaxLengthOf9)
    com.dslplatform.api.Guards.checkCollectionLength(oneListOfOneStringsWithMaxLengthOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneStringsWithMaxLengthOf9") oneListOfOneStringsWithMaxLengthOf9: IndexedSeq[String]
  ) =
    this( oneListOfOneStringsWithMaxLengthOf9 = if (oneListOfOneStringsWithMaxLengthOf9 == null) IndexedSeq.empty else oneListOfOneStringsWithMaxLengthOf9)

}
