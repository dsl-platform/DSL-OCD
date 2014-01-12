package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfNullableStringsWithMaxLengthOf9Value1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableStringsWithMaxLengthOf9: Array[Option[String]] = Array.empty
  ) {

    require(oneArrayOfNullableStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"oneArrayOfNullableStringsWithMaxLengthOf9\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableStringsWithMaxLengthOf9)
    com.dslplatform.api.Guards.checkArrayOptionLength(oneArrayOfNullableStringsWithMaxLengthOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableStringsWithMaxLengthOf9") oneArrayOfNullableStringsWithMaxLengthOf9: Array[Option[String]]
  ) =
    this( oneArrayOfNullableStringsWithMaxLengthOf9 = if (oneArrayOfNullableStringsWithMaxLengthOf9 == null) Array.empty else oneArrayOfNullableStringsWithMaxLengthOf9)

}
