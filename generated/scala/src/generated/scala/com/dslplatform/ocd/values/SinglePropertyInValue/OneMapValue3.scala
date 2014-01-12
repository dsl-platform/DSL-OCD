package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneMapValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneMap: Map[String, String] = Map.empty[String, String]
  ) {

    require(oneMap ne null, "Null value was provided for property \"oneMap\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneMap") oneMap: Map[String, String]
  ) =
    this( oneMap = if (oneMap == null) Map.empty[String, String] else oneMap)

}
