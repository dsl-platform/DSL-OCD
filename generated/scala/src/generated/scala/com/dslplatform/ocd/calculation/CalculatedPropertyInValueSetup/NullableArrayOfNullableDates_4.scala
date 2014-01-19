package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfNullableDates_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableDates: Option[Array[Option[org.joda.time.LocalDate]]] = None,
     calculatedNullableArrayOfNullableDates: Option[Array[Option[org.joda.time.LocalDate]]] = None,
     persistedNullableArrayOfNullableDates: Option[Array[Option[org.joda.time.LocalDate]]] = None
  ) {

    require(nullableArrayOfNullableDates ne null, "Null value was provided for property \"nullableArrayOfNullableDates\"")
    if (nullableArrayOfNullableDates.isDefined) require(nullableArrayOfNullableDates.get ne null, "Null value was provided for property \"nullableArrayOfNullableDates\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableDates)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableDates") nullableArrayOfNullableDates: Option[Array[Option[org.joda.time.LocalDate]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableDates") calculatedNullableArrayOfNullableDates: Option[Array[Option[org.joda.time.LocalDate]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableDates") persistedNullableArrayOfNullableDates: Option[Array[Option[org.joda.time.LocalDate]]]
  ) =
    this( nullableArrayOfNullableDates = nullableArrayOfNullableDates, calculatedNullableArrayOfNullableDates = calculatedNullableArrayOfNullableDates, persistedNullableArrayOfNullableDates = persistedNullableArrayOfNullableDates)

}
