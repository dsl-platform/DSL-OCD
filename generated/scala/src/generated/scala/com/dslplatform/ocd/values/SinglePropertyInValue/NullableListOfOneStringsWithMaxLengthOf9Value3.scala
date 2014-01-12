package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfOneStringsWithMaxLengthOf9Value3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneStringsWithMaxLengthOf9: Option[IndexedSeq[String]] = None
  ) {

    require(nullableListOfOneStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"nullableListOfOneStringsWithMaxLengthOf9\"")
    if (nullableListOfOneStringsWithMaxLengthOf9.isDefined) require(nullableListOfOneStringsWithMaxLengthOf9.get ne null, "Null value was provided for property \"nullableListOfOneStringsWithMaxLengthOf9\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneStringsWithMaxLengthOf9)
    com.dslplatform.api.Guards.checkCollectionLength(nullableListOfOneStringsWithMaxLengthOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneStringsWithMaxLengthOf9") nullableListOfOneStringsWithMaxLengthOf9: Option[IndexedSeq[String]]
  ) =
    this( nullableListOfOneStringsWithMaxLengthOf9 = nullableListOfOneStringsWithMaxLengthOf9)

}
