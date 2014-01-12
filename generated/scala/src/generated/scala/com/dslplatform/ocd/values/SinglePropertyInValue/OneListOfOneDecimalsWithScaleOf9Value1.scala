package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneListOfOneDecimalsWithScaleOf9Value1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneDecimalsWithScaleOf9: IndexedSeq[BigDecimal] = IndexedSeq.empty
  ) {

    require(oneListOfOneDecimalsWithScaleOf9 ne null, "Null value was provided for property \"oneListOfOneDecimalsWithScaleOf9\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneDecimalsWithScaleOf9)
    com.dslplatform.api.Guards.checkCollectionScale(oneListOfOneDecimalsWithScaleOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneDecimalsWithScaleOf9") oneListOfOneDecimalsWithScaleOf9: IndexedSeq[BigDecimal]
  ) =
    this( oneListOfOneDecimalsWithScaleOf9 = if (oneListOfOneDecimalsWithScaleOf9 == null) IndexedSeq.empty else oneListOfOneDecimalsWithScaleOf9)

}
