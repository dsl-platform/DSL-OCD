package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableMoney_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableMoney: Option[BigDecimal] = None,
     calculatedNullableMoney: Option[BigDecimal] = None,
     persistedNullableMoney: Option[BigDecimal] = None
  ) {

    require(nullableMoney ne null, "Null value was provided for property \"nullableMoney\"")
    if (nullableMoney.isDefined) require(nullableMoney.get ne null, "Null value was provided for property \"nullableMoney\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableMoney") nullableMoney: Option[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableMoney") calculatedNullableMoney: Option[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableMoney") persistedNullableMoney: Option[BigDecimal]
  ) =
    this( nullableMoney = nullableMoney, calculatedNullableMoney = calculatedNullableMoney, persistedNullableMoney = persistedNullableMoney)

}
