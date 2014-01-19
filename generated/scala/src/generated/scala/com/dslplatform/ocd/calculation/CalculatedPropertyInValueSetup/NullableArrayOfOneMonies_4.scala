package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfOneMonies_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneMonies: Option[Array[BigDecimal]] = None,
     calculatedNullableArrayOfOneMonies: Option[Array[BigDecimal]] = None,
     persistedNullableArrayOfOneMonies: Option[Array[BigDecimal]] = None
  ) {

    require(nullableArrayOfOneMonies ne null, "Null value was provided for property \"nullableArrayOfOneMonies\"")
    if (nullableArrayOfOneMonies.isDefined) require(nullableArrayOfOneMonies.get ne null, "Null value was provided for property \"nullableArrayOfOneMonies\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneMonies)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneMonies") nullableArrayOfOneMonies: Option[Array[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneMonies") calculatedNullableArrayOfOneMonies: Option[Array[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneMonies") persistedNullableArrayOfOneMonies: Option[Array[BigDecimal]]
  ) =
    this( nullableArrayOfOneMonies = nullableArrayOfOneMonies, calculatedNullableArrayOfOneMonies = calculatedNullableArrayOfOneMonies, persistedNullableArrayOfOneMonies = persistedNullableArrayOfOneMonies)

}
