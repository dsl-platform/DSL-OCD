package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfNullableDecimals_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableDecimals: Option[Array[Option[BigDecimal]]] = None,
     calculatedNullableArrayOfNullableDecimals: Option[Array[Option[BigDecimal]]] = None,
     persistedNullableArrayOfNullableDecimals: Option[Array[Option[BigDecimal]]] = None
  ) {

    require(nullableArrayOfNullableDecimals ne null, "Null value was provided for property \"nullableArrayOfNullableDecimals\"")
    if (nullableArrayOfNullableDecimals.isDefined) require(nullableArrayOfNullableDecimals.get ne null, "Null value was provided for property \"nullableArrayOfNullableDecimals\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableDecimals)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableDecimals") nullableArrayOfNullableDecimals: Option[Array[Option[BigDecimal]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableDecimals") calculatedNullableArrayOfNullableDecimals: Option[Array[Option[BigDecimal]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableDecimals") persistedNullableArrayOfNullableDecimals: Option[Array[Option[BigDecimal]]]
  ) =
    this( nullableArrayOfNullableDecimals = nullableArrayOfNullableDecimals, calculatedNullableArrayOfNullableDecimals = calculatedNullableArrayOfNullableDecimals, persistedNullableArrayOfNullableDecimals = persistedNullableArrayOfNullableDecimals)

}
