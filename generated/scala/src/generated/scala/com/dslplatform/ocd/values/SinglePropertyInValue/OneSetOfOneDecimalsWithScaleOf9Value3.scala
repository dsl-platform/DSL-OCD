package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfOneDecimalsWithScaleOf9Value3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneDecimalsWithScaleOf9: Set[BigDecimal] = Set.empty
  ) {

    require(oneSetOfOneDecimalsWithScaleOf9 ne null, "Null value was provided for property \"oneSetOfOneDecimalsWithScaleOf9\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneDecimalsWithScaleOf9)
    com.dslplatform.api.Guards.checkCollectionScale(oneSetOfOneDecimalsWithScaleOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneDecimalsWithScaleOf9") oneSetOfOneDecimalsWithScaleOf9: Set[BigDecimal]
  ) =
    this( oneSetOfOneDecimalsWithScaleOf9 = if (oneSetOfOneDecimalsWithScaleOf9 == null) Set.empty else oneSetOfOneDecimalsWithScaleOf9)

}
