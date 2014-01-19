package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfOneDecimalsWithScaleOf9_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneDecimalsWithScaleOf9: Option[Array[BigDecimal]] = None,
     calculatedNullableArrayOfOneDecimalsWithScaleOf9: Option[Array[BigDecimal]] = None,
     persistedNullableArrayOfOneDecimalsWithScaleOf9: Option[Array[BigDecimal]] = None
  ) {

    require(nullableArrayOfOneDecimalsWithScaleOf9 ne null, "Null value was provided for property \"nullableArrayOfOneDecimalsWithScaleOf9\"")
    if (nullableArrayOfOneDecimalsWithScaleOf9.isDefined) require(nullableArrayOfOneDecimalsWithScaleOf9.get ne null, "Null value was provided for property \"nullableArrayOfOneDecimalsWithScaleOf9\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneDecimalsWithScaleOf9)
    com.dslplatform.api.Guards.checkArrayScale(nullableArrayOfOneDecimalsWithScaleOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneDecimalsWithScaleOf9") nullableArrayOfOneDecimalsWithScaleOf9: Option[Array[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneDecimalsWithScaleOf9") calculatedNullableArrayOfOneDecimalsWithScaleOf9: Option[Array[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneDecimalsWithScaleOf9") persistedNullableArrayOfOneDecimalsWithScaleOf9: Option[Array[BigDecimal]]
  ) =
    this( nullableArrayOfOneDecimalsWithScaleOf9 = nullableArrayOfOneDecimalsWithScaleOf9, calculatedNullableArrayOfOneDecimalsWithScaleOf9 = calculatedNullableArrayOfOneDecimalsWithScaleOf9, persistedNullableArrayOfOneDecimalsWithScaleOf9 = persistedNullableArrayOfOneDecimalsWithScaleOf9)

}
