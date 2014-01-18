package com.dslplatform.ocd.values.PropertyInValue

case class NullableMoney_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableMoney: Option[BigDecimal] = None
  ) {

    require(nullableMoney ne null, "Null value was provided for property \"nullableMoney\"")
    if (nullableMoney.isDefined) require(nullableMoney.get ne null, "Null value was provided for property \"nullableMoney\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableMoney") nullableMoney: Option[BigDecimal]
  ) =
    this( nullableMoney = nullableMoney)

}
