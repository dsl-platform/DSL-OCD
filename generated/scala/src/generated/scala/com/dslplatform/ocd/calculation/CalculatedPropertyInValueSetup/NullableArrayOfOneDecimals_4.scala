package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfOneDecimals_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneDecimals: Option[Array[BigDecimal]] = None,
     calculatedNullableArrayOfOneDecimals: Option[Array[BigDecimal]] = None,
     persistedNullableArrayOfOneDecimals: Option[Array[BigDecimal]] = None
  ) {

    require(nullableArrayOfOneDecimals ne null, "Null value was provided for property \"nullableArrayOfOneDecimals\"")
    if (nullableArrayOfOneDecimals.isDefined) require(nullableArrayOfOneDecimals.get ne null, "Null value was provided for property \"nullableArrayOfOneDecimals\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneDecimals)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneDecimals") nullableArrayOfOneDecimals: Option[Array[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneDecimals") calculatedNullableArrayOfOneDecimals: Option[Array[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneDecimals") persistedNullableArrayOfOneDecimals: Option[Array[BigDecimal]]
  ) =
    this( nullableArrayOfOneDecimals = nullableArrayOfOneDecimals, calculatedNullableArrayOfOneDecimals = calculatedNullableArrayOfOneDecimals, persistedNullableArrayOfOneDecimals = persistedNullableArrayOfOneDecimals)

}
