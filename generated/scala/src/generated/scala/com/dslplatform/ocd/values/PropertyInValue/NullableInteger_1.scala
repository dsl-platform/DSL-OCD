package com.dslplatform.ocd.values.PropertyInValue

case class NullableInteger_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableInteger: Option[Int] = None
  ) {

    require(nullableInteger ne null, "Null value was provided for property \"nullableInteger\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableInteger") nullableInteger: Option[Int]
  ) =
    this( nullableInteger = nullableInteger)

}
