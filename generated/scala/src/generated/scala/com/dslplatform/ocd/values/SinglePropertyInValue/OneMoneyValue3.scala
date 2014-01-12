package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneMoneyValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneMoney: BigDecimal = BigDecimal(0)
  ) {

    require(oneMoney ne null, "Null value was provided for property \"oneMoney\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneMoney") oneMoney: BigDecimal
  ) =
    this( oneMoney = if (oneMoney == null) BigDecimal(0) else oneMoney)

}
