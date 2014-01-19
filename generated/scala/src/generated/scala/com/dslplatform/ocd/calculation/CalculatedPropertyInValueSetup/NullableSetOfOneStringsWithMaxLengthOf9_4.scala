package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfOneStringsWithMaxLengthOf9_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneStringsWithMaxLengthOf9: Option[Set[String]] = None,
     calculatedNullableSetOfOneStringsWithMaxLengthOf9: Option[Set[String]] = None,
     persistedNullableSetOfOneStringsWithMaxLengthOf9: Option[Set[String]] = None
  ) {

    require(nullableSetOfOneStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"nullableSetOfOneStringsWithMaxLengthOf9\"")
    if (nullableSetOfOneStringsWithMaxLengthOf9.isDefined) require(nullableSetOfOneStringsWithMaxLengthOf9.get ne null, "Null value was provided for property \"nullableSetOfOneStringsWithMaxLengthOf9\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneStringsWithMaxLengthOf9)
    com.dslplatform.api.Guards.checkCollectionLength(nullableSetOfOneStringsWithMaxLengthOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneStringsWithMaxLengthOf9") nullableSetOfOneStringsWithMaxLengthOf9: Option[Set[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneStringsWithMaxLengthOf9") calculatedNullableSetOfOneStringsWithMaxLengthOf9: Option[Set[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneStringsWithMaxLengthOf9") persistedNullableSetOfOneStringsWithMaxLengthOf9: Option[Set[String]]
  ) =
    this( nullableSetOfOneStringsWithMaxLengthOf9 = nullableSetOfOneStringsWithMaxLengthOf9, calculatedNullableSetOfOneStringsWithMaxLengthOf9 = calculatedNullableSetOfOneStringsWithMaxLengthOf9, persistedNullableSetOfOneStringsWithMaxLengthOf9 = persistedNullableSetOfOneStringsWithMaxLengthOf9)

}
