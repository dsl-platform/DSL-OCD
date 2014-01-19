package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfOneStringsWithMaxLengthOf9_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneStringsWithMaxLengthOf9: Option[IndexedSeq[String]] = None,
     calculatedNullableListOfOneStringsWithMaxLengthOf9: Option[IndexedSeq[String]] = None,
     persistedNullableListOfOneStringsWithMaxLengthOf9: Option[IndexedSeq[String]] = None
  ) {

    require(nullableListOfOneStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"nullableListOfOneStringsWithMaxLengthOf9\"")
    if (nullableListOfOneStringsWithMaxLengthOf9.isDefined) require(nullableListOfOneStringsWithMaxLengthOf9.get ne null, "Null value was provided for property \"nullableListOfOneStringsWithMaxLengthOf9\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneStringsWithMaxLengthOf9)
    com.dslplatform.api.Guards.checkCollectionLength(nullableListOfOneStringsWithMaxLengthOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneStringsWithMaxLengthOf9") nullableListOfOneStringsWithMaxLengthOf9: Option[IndexedSeq[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneStringsWithMaxLengthOf9") calculatedNullableListOfOneStringsWithMaxLengthOf9: Option[IndexedSeq[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneStringsWithMaxLengthOf9") persistedNullableListOfOneStringsWithMaxLengthOf9: Option[IndexedSeq[String]]
  ) =
    this( nullableListOfOneStringsWithMaxLengthOf9 = nullableListOfOneStringsWithMaxLengthOf9, calculatedNullableListOfOneStringsWithMaxLengthOf9 = calculatedNullableListOfOneStringsWithMaxLengthOf9, persistedNullableListOfOneStringsWithMaxLengthOf9 = persistedNullableListOfOneStringsWithMaxLengthOf9)

}
