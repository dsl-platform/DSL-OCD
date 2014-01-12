package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableFloatValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableFloat: Option[Float] = None
  ) {

    require(nullableFloat ne null, "Null value was provided for property \"nullableFloat\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableFloat") nullableFloat: Option[Float]
  ) =
    this( nullableFloat = nullableFloat)

}
