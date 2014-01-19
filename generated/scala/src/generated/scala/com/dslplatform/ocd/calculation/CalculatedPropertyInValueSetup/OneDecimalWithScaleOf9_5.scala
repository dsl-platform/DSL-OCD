package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneDecimalWithScaleOf9_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneDecimalWithScaleOf9: BigDecimal = _root_.scala.math.BigDecimal(0).setScale(9),
     calculatedOneDecimalWithScaleOf9: BigDecimal = _root_.scala.math.BigDecimal(0).setScale(9),
     persistedOneDecimalWithScaleOf9: BigDecimal = _root_.scala.math.BigDecimal(0).setScale(9)
  ) {

    require(oneDecimalWithScaleOf9 ne null, "Null value was provided for property \"oneDecimalWithScaleOf9\"")
    com.dslplatform.api.Guards.checkScale(oneDecimalWithScaleOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneDecimalWithScaleOf9") oneDecimalWithScaleOf9: BigDecimal
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneDecimalWithScaleOf9") calculatedOneDecimalWithScaleOf9: BigDecimal
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneDecimalWithScaleOf9") persistedOneDecimalWithScaleOf9: BigDecimal
  ) =
    this( oneDecimalWithScaleOf9 = if (oneDecimalWithScaleOf9 == null) _root_.scala.math.BigDecimal(0).setScale(9) else oneDecimalWithScaleOf9, calculatedOneDecimalWithScaleOf9 = if (calculatedOneDecimalWithScaleOf9 == null) _root_.scala.math.BigDecimal(0).setScale(9) else calculatedOneDecimalWithScaleOf9, persistedOneDecimalWithScaleOf9 = if (persistedOneDecimalWithScaleOf9 == null) _root_.scala.math.BigDecimal(0).setScale(9) else persistedOneDecimalWithScaleOf9)

}
