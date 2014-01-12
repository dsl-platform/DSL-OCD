package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableStringValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableString: Option[String] = None
  ) {

    require(nullableString ne null, "Null value was provided for property \"nullableString\"")
    if (nullableString.isDefined) require(nullableString.get ne null, "Null value was provided for property \"nullableString\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableString") nullableString: Option[String]
  ) =
    this( nullableString = nullableString)

}
