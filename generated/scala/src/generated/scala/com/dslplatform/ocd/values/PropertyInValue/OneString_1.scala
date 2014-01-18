package com.dslplatform.ocd.values.PropertyInValue

case class OneString_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneString: String = ""
  ) {

    require(oneString ne null, "Null value was provided for property \"oneString\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneString") oneString: String
  ) =
    this( oneString = if (oneString == null) "" else oneString)

}
