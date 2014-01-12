package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableArrayOfNullableDecimalsWithScaleOf9Value1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableDecimalsWithScaleOf9: Option[Array[Option[BigDecimal]]] = None
  ) {

    require(nullableArrayOfNullableDecimalsWithScaleOf9 ne null, "Null value was provided for property \"nullableArrayOfNullableDecimalsWithScaleOf9\"")
    if (nullableArrayOfNullableDecimalsWithScaleOf9.isDefined) require(nullableArrayOfNullableDecimalsWithScaleOf9.get ne null, "Null value was provided for property \"nullableArrayOfNullableDecimalsWithScaleOf9\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableDecimalsWithScaleOf9)
    com.dslplatform.api.Guards.checkArrayOptionScale(nullableArrayOfNullableDecimalsWithScaleOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableDecimalsWithScaleOf9") nullableArrayOfNullableDecimalsWithScaleOf9: Option[Array[Option[BigDecimal]]]
  ) =
    this( nullableArrayOfNullableDecimalsWithScaleOf9 = nullableArrayOfNullableDecimalsWithScaleOf9)

}
