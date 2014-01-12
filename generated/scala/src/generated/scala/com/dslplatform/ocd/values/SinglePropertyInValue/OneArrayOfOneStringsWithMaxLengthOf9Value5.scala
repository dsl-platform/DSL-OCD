package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfOneStringsWithMaxLengthOf9Value5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneStringsWithMaxLengthOf9: Array[String] = Array.empty
  ) {

    require(oneArrayOfOneStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"oneArrayOfOneStringsWithMaxLengthOf9\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneStringsWithMaxLengthOf9)
    com.dslplatform.api.Guards.checkArrayLength(oneArrayOfOneStringsWithMaxLengthOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneStringsWithMaxLengthOf9") oneArrayOfOneStringsWithMaxLengthOf9: Array[String]
  ) =
    this( oneArrayOfOneStringsWithMaxLengthOf9 = if (oneArrayOfOneStringsWithMaxLengthOf9 == null) Array.empty else oneArrayOfOneStringsWithMaxLengthOf9)

}
