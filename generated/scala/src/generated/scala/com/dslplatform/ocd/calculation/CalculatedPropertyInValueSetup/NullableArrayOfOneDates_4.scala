package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfOneDates_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneDates: Option[Array[org.joda.time.LocalDate]] = None,
     calculatedNullableArrayOfOneDates: Option[Array[org.joda.time.LocalDate]] = None,
     persistedNullableArrayOfOneDates: Option[Array[org.joda.time.LocalDate]] = None
  ) {

    require(nullableArrayOfOneDates ne null, "Null value was provided for property \"nullableArrayOfOneDates\"")
    if (nullableArrayOfOneDates.isDefined) require(nullableArrayOfOneDates.get ne null, "Null value was provided for property \"nullableArrayOfOneDates\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneDates)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneDates") nullableArrayOfOneDates: Option[Array[org.joda.time.LocalDate]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneDates") calculatedNullableArrayOfOneDates: Option[Array[org.joda.time.LocalDate]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneDates") persistedNullableArrayOfOneDates: Option[Array[org.joda.time.LocalDate]]
  ) =
    this( nullableArrayOfOneDates = nullableArrayOfOneDates, calculatedNullableArrayOfOneDates = calculatedNullableArrayOfOneDates, persistedNullableArrayOfOneDates = persistedNullableArrayOfOneDates)

}