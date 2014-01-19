package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfNullableStringsWithMaxLengthOf9_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableStringsWithMaxLengthOf9: Array[Option[String]] = Array.empty,
     calculatedOneArrayOfNullableStringsWithMaxLengthOf9: Array[Option[String]] = Array.empty,
     persistedOneArrayOfNullableStringsWithMaxLengthOf9: Array[Option[String]] = Array.empty
  ) {

    require(oneArrayOfNullableStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"oneArrayOfNullableStringsWithMaxLengthOf9\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableStringsWithMaxLengthOf9)
    com.dslplatform.api.Guards.checkArrayOptionLength(oneArrayOfNullableStringsWithMaxLengthOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableStringsWithMaxLengthOf9") oneArrayOfNullableStringsWithMaxLengthOf9: Array[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableStringsWithMaxLengthOf9") calculatedOneArrayOfNullableStringsWithMaxLengthOf9: Array[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableStringsWithMaxLengthOf9") persistedOneArrayOfNullableStringsWithMaxLengthOf9: Array[Option[String]]
  ) =
    this( oneArrayOfNullableStringsWithMaxLengthOf9 = if (oneArrayOfNullableStringsWithMaxLengthOf9 == null) Array.empty else oneArrayOfNullableStringsWithMaxLengthOf9, calculatedOneArrayOfNullableStringsWithMaxLengthOf9 = calculatedOneArrayOfNullableStringsWithMaxLengthOf9, persistedOneArrayOfNullableStringsWithMaxLengthOf9 = persistedOneArrayOfNullableStringsWithMaxLengthOf9)

}
