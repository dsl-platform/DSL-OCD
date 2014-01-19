package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneText_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneText: String = "",
     calculatedOneText: String = "",
     persistedOneText: String = ""
  ) {

    require(oneText ne null, "Null value was provided for property \"oneText\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneText") oneText: String
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneText") calculatedOneText: String
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneText") persistedOneText: String
  ) =
    this( oneText = if (oneText == null) "" else oneText, calculatedOneText = if (calculatedOneText == null) "" else calculatedOneText, persistedOneText = if (persistedOneText == null) "" else persistedOneText)

}
