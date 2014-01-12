package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneStringWithMaxLengthOf9Value1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneStringWithMaxLengthOf9: String = ""
  ) {

    require(oneStringWithMaxLengthOf9 ne null, "Null value was provided for property \"oneStringWithMaxLengthOf9\"")
    com.dslplatform.api.Guards.checkLength(oneStringWithMaxLengthOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneStringWithMaxLengthOf9") oneStringWithMaxLengthOf9: String
  ) =
    this( oneStringWithMaxLengthOf9 = if (oneStringWithMaxLengthOf9 == null) "" else oneStringWithMaxLengthOf9)

}
