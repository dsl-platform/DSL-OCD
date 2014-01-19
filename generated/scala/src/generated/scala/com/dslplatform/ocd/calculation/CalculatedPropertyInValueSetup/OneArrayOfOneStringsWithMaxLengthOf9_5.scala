package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfOneStringsWithMaxLengthOf9_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneStringsWithMaxLengthOf9: Array[String] = Array.empty,
     calculatedOneArrayOfOneStringsWithMaxLengthOf9: Array[String] = Array.empty,
     persistedOneArrayOfOneStringsWithMaxLengthOf9: Array[String] = Array.empty
  ) {

    require(oneArrayOfOneStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"oneArrayOfOneStringsWithMaxLengthOf9\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneStringsWithMaxLengthOf9)
    com.dslplatform.api.Guards.checkArrayLength(oneArrayOfOneStringsWithMaxLengthOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneStringsWithMaxLengthOf9") oneArrayOfOneStringsWithMaxLengthOf9: Array[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneStringsWithMaxLengthOf9") calculatedOneArrayOfOneStringsWithMaxLengthOf9: Array[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneStringsWithMaxLengthOf9") persistedOneArrayOfOneStringsWithMaxLengthOf9: Array[String]
  ) =
    this( oneArrayOfOneStringsWithMaxLengthOf9 = if (oneArrayOfOneStringsWithMaxLengthOf9 == null) Array.empty else oneArrayOfOneStringsWithMaxLengthOf9, calculatedOneArrayOfOneStringsWithMaxLengthOf9 = calculatedOneArrayOfOneStringsWithMaxLengthOf9, persistedOneArrayOfOneStringsWithMaxLengthOf9 = persistedOneArrayOfOneStringsWithMaxLengthOf9)

}
