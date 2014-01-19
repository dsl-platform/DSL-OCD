package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfOneStringsWithMaxLengthOf9_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneStringsWithMaxLengthOf9: Set[String] = Set.empty,
     calculatedOneSetOfOneStringsWithMaxLengthOf9: Set[String] = Set.empty,
     persistedOneSetOfOneStringsWithMaxLengthOf9: Set[String] = Set.empty
  ) {

    require(oneSetOfOneStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"oneSetOfOneStringsWithMaxLengthOf9\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneStringsWithMaxLengthOf9)
    com.dslplatform.api.Guards.checkCollectionLength(oneSetOfOneStringsWithMaxLengthOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneStringsWithMaxLengthOf9") oneSetOfOneStringsWithMaxLengthOf9: Set[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneStringsWithMaxLengthOf9") calculatedOneSetOfOneStringsWithMaxLengthOf9: Set[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneStringsWithMaxLengthOf9") persistedOneSetOfOneStringsWithMaxLengthOf9: Set[String]
  ) =
    this( oneSetOfOneStringsWithMaxLengthOf9 = if (oneSetOfOneStringsWithMaxLengthOf9 == null) Set.empty else oneSetOfOneStringsWithMaxLengthOf9, calculatedOneSetOfOneStringsWithMaxLengthOf9 = calculatedOneSetOfOneStringsWithMaxLengthOf9, persistedOneSetOfOneStringsWithMaxLengthOf9 = persistedOneSetOfOneStringsWithMaxLengthOf9)

}
