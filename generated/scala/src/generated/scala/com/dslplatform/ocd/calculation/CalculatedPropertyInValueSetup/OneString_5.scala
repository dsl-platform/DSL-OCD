package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneString_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneString: String = "",
     calculatedOneString: String = "",
     persistedOneString: String = ""
  ) {

    require(oneString ne null, "Null value was provided for property \"oneString\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneString") oneString: String
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneString") calculatedOneString: String
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneString") persistedOneString: String
  ) =
    this( oneString = if (oneString == null) "" else oneString, calculatedOneString = if (calculatedOneString == null) "" else calculatedOneString, persistedOneString = if (persistedOneString == null) "" else persistedOneString)

}
