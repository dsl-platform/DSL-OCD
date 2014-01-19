package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneStringWithMaxLengthOf9_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneStringWithMaxLengthOf9: String = "",
     calculatedOneStringWithMaxLengthOf9: String = "",
     persistedOneStringWithMaxLengthOf9: String = ""
  ) {

    require(oneStringWithMaxLengthOf9 ne null, "Null value was provided for property \"oneStringWithMaxLengthOf9\"")
    com.dslplatform.api.Guards.checkLength(oneStringWithMaxLengthOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneStringWithMaxLengthOf9") oneStringWithMaxLengthOf9: String
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneStringWithMaxLengthOf9") calculatedOneStringWithMaxLengthOf9: String
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneStringWithMaxLengthOf9") persistedOneStringWithMaxLengthOf9: String
  ) =
    this( oneStringWithMaxLengthOf9 = if (oneStringWithMaxLengthOf9 == null) "" else oneStringWithMaxLengthOf9, calculatedOneStringWithMaxLengthOf9 = if (calculatedOneStringWithMaxLengthOf9 == null) "" else calculatedOneStringWithMaxLengthOf9, persistedOneStringWithMaxLengthOf9 = if (persistedOneStringWithMaxLengthOf9 == null) "" else persistedOneStringWithMaxLengthOf9)

}
