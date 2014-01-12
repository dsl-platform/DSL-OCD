package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfOneDecimalsWithScaleOf9Value1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneDecimalsWithScaleOf9: Option[IndexedSeq[BigDecimal]] = None
  ) {

    require(nullableListOfOneDecimalsWithScaleOf9 ne null, "Null value was provided for property \"nullableListOfOneDecimalsWithScaleOf9\"")
    if (nullableListOfOneDecimalsWithScaleOf9.isDefined) require(nullableListOfOneDecimalsWithScaleOf9.get ne null, "Null value was provided for property \"nullableListOfOneDecimalsWithScaleOf9\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneDecimalsWithScaleOf9)
    com.dslplatform.api.Guards.checkCollectionScale(nullableListOfOneDecimalsWithScaleOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneDecimalsWithScaleOf9") nullableListOfOneDecimalsWithScaleOf9: Option[IndexedSeq[BigDecimal]]
  ) =
    this( nullableListOfOneDecimalsWithScaleOf9 = nullableListOfOneDecimalsWithScaleOf9)

}
