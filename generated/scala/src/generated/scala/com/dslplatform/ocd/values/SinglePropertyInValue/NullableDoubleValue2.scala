package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableDoubleValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableDouble: Option[Double] = None
  ) {

    require(nullableDouble ne null, "Null value was provided for property \"nullableDouble\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableDouble") nullableDouble: Option[Double]
  ) =
    this( nullableDouble = nullableDouble)

}
