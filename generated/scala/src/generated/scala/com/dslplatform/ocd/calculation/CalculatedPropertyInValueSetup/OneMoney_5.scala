package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneMoney_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneMoney: BigDecimal = BigDecimal(0),
     calculatedOneMoney: BigDecimal = BigDecimal(0),
     persistedOneMoney: BigDecimal = BigDecimal(0)
  ) {

    require(oneMoney ne null, "Null value was provided for property \"oneMoney\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneMoney") oneMoney: BigDecimal
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneMoney") calculatedOneMoney: BigDecimal
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneMoney") persistedOneMoney: BigDecimal
  ) =
    this( oneMoney = if (oneMoney == null) BigDecimal(0) else oneMoney, calculatedOneMoney = if (calculatedOneMoney == null) BigDecimal(0) else calculatedOneMoney, persistedOneMoney = if (persistedOneMoney == null) BigDecimal(0) else persistedOneMoney)

}
