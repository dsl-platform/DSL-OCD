package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfNullableDecimalsWithScaleOf9_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableDecimalsWithScaleOf9: Option[Array[Option[BigDecimal]]] = None,
     calculatedNullableArrayOfNullableDecimalsWithScaleOf9: Option[Array[Option[BigDecimal]]] = None,
     persistedNullableArrayOfNullableDecimalsWithScaleOf9: Option[Array[Option[BigDecimal]]] = None
  ) {

    require(nullableArrayOfNullableDecimalsWithScaleOf9 ne null, "Null value was provided for property \"nullableArrayOfNullableDecimalsWithScaleOf9\"")
    if (nullableArrayOfNullableDecimalsWithScaleOf9.isDefined) require(nullableArrayOfNullableDecimalsWithScaleOf9.get ne null, "Null value was provided for property \"nullableArrayOfNullableDecimalsWithScaleOf9\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableDecimalsWithScaleOf9)
    com.dslplatform.api.Guards.checkArrayOptionScale(nullableArrayOfNullableDecimalsWithScaleOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableDecimalsWithScaleOf9") nullableArrayOfNullableDecimalsWithScaleOf9: Option[Array[Option[BigDecimal]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableDecimalsWithScaleOf9") calculatedNullableArrayOfNullableDecimalsWithScaleOf9: Option[Array[Option[BigDecimal]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableDecimalsWithScaleOf9") persistedNullableArrayOfNullableDecimalsWithScaleOf9: Option[Array[Option[BigDecimal]]]
  ) =
    this( nullableArrayOfNullableDecimalsWithScaleOf9 = nullableArrayOfNullableDecimalsWithScaleOf9, calculatedNullableArrayOfNullableDecimalsWithScaleOf9 = calculatedNullableArrayOfNullableDecimalsWithScaleOf9, persistedNullableArrayOfNullableDecimalsWithScaleOf9 = persistedNullableArrayOfNullableDecimalsWithScaleOf9)

}