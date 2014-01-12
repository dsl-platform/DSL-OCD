package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableSetOfOneDecimalsWithScaleOf9Value3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneDecimalsWithScaleOf9: Option[Set[BigDecimal]] = None
  ) {

    require(nullableSetOfOneDecimalsWithScaleOf9 ne null, "Null value was provided for property \"nullableSetOfOneDecimalsWithScaleOf9\"")
    if (nullableSetOfOneDecimalsWithScaleOf9.isDefined) require(nullableSetOfOneDecimalsWithScaleOf9.get ne null, "Null value was provided for property \"nullableSetOfOneDecimalsWithScaleOf9\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneDecimalsWithScaleOf9)
    com.dslplatform.api.Guards.checkCollectionScale(nullableSetOfOneDecimalsWithScaleOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneDecimalsWithScaleOf9") nullableSetOfOneDecimalsWithScaleOf9: Option[Set[BigDecimal]]
  ) =
    this( nullableSetOfOneDecimalsWithScaleOf9 = nullableSetOfOneDecimalsWithScaleOf9)

}
