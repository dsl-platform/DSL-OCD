package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableMapValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableMap: Option[Map[String, String]] = None
  ) {

    require(nullableMap ne null, "Null value was provided for property \"nullableMap\"")
    if (nullableMap.isDefined) require(nullableMap.get ne null, "Null value was provided for property \"nullableMap\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableMap") nullableMap: Option[Map[String, String]]
  ) =
    this( nullableMap = nullableMap)

}
