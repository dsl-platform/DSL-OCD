package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableStringWithMaxLengthOf9Value3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableStringWithMaxLengthOf9: Option[String] = None
  ) {

    require(nullableStringWithMaxLengthOf9 ne null, "Null value was provided for property \"nullableStringWithMaxLengthOf9\"")
    if (nullableStringWithMaxLengthOf9.isDefined) require(nullableStringWithMaxLengthOf9.get ne null, "Null value was provided for property \"nullableStringWithMaxLengthOf9\"")
    com.dslplatform.api.Guards.checkLength(nullableStringWithMaxLengthOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableStringWithMaxLengthOf9") nullableStringWithMaxLengthOf9: Option[String]
  ) =
    this( nullableStringWithMaxLengthOf9 = nullableStringWithMaxLengthOf9)

}
