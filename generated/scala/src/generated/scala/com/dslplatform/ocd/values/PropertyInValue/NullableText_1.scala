package com.dslplatform.ocd.values.PropertyInValue

case class NullableText_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableText: Option[String] = None
  ) {

    require(nullableText ne null, "Null value was provided for property \"nullableText\"")
    if (nullableText.isDefined) require(nullableText.get ne null, "Null value was provided for property \"nullableText\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableText") nullableText: Option[String]
  ) =
    this( nullableText = nullableText)

}
