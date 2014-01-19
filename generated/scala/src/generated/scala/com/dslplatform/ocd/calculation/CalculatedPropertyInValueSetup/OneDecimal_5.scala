package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneDecimal_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneDecimal: BigDecimal = _root_.scala.math.BigDecimal(0),
     calculatedOneDecimal: BigDecimal = _root_.scala.math.BigDecimal(0),
     persistedOneDecimal: BigDecimal = _root_.scala.math.BigDecimal(0)
  ) {

    require(oneDecimal ne null, "Null value was provided for property \"oneDecimal\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneDecimal") oneDecimal: BigDecimal
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneDecimal") calculatedOneDecimal: BigDecimal
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneDecimal") persistedOneDecimal: BigDecimal
  ) =
    this( oneDecimal = if (oneDecimal == null) _root_.scala.math.BigDecimal(0) else oneDecimal, calculatedOneDecimal = if (calculatedOneDecimal == null) _root_.scala.math.BigDecimal(0) else calculatedOneDecimal, persistedOneDecimal = if (persistedOneDecimal == null) _root_.scala.math.BigDecimal(0) else persistedOneDecimal)

}
