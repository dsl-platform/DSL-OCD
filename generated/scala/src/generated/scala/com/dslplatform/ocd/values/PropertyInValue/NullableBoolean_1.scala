package com.dslplatform.ocd.values.PropertyInValue

case class NullableBoolean_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableBoolean: Option[Boolean] = None
  ) {

    require(nullableBoolean ne null, "Null value was provided for property \"nullableBoolean\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableBoolean") nullableBoolean: Option[Boolean]
  ) =
    this( nullableBoolean = nullableBoolean)

}
