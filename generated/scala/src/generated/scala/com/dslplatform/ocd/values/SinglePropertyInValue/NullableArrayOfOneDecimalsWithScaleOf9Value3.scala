package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableArrayOfOneDecimalsWithScaleOf9Value3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneDecimalsWithScaleOf9: Option[Array[BigDecimal]] = None
  ) {

    require(nullableArrayOfOneDecimalsWithScaleOf9 ne null, "Null value was provided for property \"nullableArrayOfOneDecimalsWithScaleOf9\"")
    if (nullableArrayOfOneDecimalsWithScaleOf9.isDefined) require(nullableArrayOfOneDecimalsWithScaleOf9.get ne null, "Null value was provided for property \"nullableArrayOfOneDecimalsWithScaleOf9\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneDecimalsWithScaleOf9)
    com.dslplatform.api.Guards.checkArrayScale(nullableArrayOfOneDecimalsWithScaleOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneDecimalsWithScaleOf9") nullableArrayOfOneDecimalsWithScaleOf9: Option[Array[BigDecimal]]
  ) =
    this( nullableArrayOfOneDecimalsWithScaleOf9 = nullableArrayOfOneDecimalsWithScaleOf9)

}
