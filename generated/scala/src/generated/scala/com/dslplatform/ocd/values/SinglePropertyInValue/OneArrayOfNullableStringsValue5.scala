package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfNullableStringsValue5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableStrings: Array[Option[String]] = Array.empty
  ) {

    require(oneArrayOfNullableStrings ne null, "Null value was provided for property \"oneArrayOfNullableStrings\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableStrings)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableStrings") oneArrayOfNullableStrings: Array[Option[String]]
  ) =
    this( oneArrayOfNullableStrings = if (oneArrayOfNullableStrings == null) Array.empty else oneArrayOfNullableStrings)

}
