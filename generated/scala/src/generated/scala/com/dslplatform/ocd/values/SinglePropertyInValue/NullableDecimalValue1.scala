package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableDecimalValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableDecimal: Option[BigDecimal] = None
  ) {

    require(nullableDecimal ne null, "Null value was provided for property \"nullableDecimal\"")
    if (nullableDecimal.isDefined) require(nullableDecimal.get ne null, "Null value was provided for property \"nullableDecimal\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableDecimal") nullableDecimal: Option[BigDecimal]
  ) =
    this( nullableDecimal = nullableDecimal)

}
