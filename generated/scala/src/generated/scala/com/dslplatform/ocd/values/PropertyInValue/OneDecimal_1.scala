package com.dslplatform.ocd.values.PropertyInValue

case class OneDecimal_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneDecimal: BigDecimal = _root_.scala.math.BigDecimal(0)
  ) {

    require(oneDecimal ne null, "Null value was provided for property \"oneDecimal\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneDecimal") oneDecimal: BigDecimal
  ) =
    this( oneDecimal = if (oneDecimal == null) _root_.scala.math.BigDecimal(0) else oneDecimal)

}
