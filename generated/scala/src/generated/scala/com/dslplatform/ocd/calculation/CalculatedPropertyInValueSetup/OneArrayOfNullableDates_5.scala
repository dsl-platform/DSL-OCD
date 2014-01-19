package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfNullableDates_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableDates: Array[Option[org.joda.time.LocalDate]] = Array.empty,
     calculatedOneArrayOfNullableDates: Array[Option[org.joda.time.LocalDate]] = Array.empty,
     persistedOneArrayOfNullableDates: Array[Option[org.joda.time.LocalDate]] = Array.empty
  ) {

    require(oneArrayOfNullableDates ne null, "Null value was provided for property \"oneArrayOfNullableDates\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableDates)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableDates") oneArrayOfNullableDates: Array[Option[org.joda.time.LocalDate]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableDates") calculatedOneArrayOfNullableDates: Array[Option[org.joda.time.LocalDate]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableDates") persistedOneArrayOfNullableDates: Array[Option[org.joda.time.LocalDate]]
  ) =
    this( oneArrayOfNullableDates = if (oneArrayOfNullableDates == null) Array.empty else oneArrayOfNullableDates, calculatedOneArrayOfNullableDates = calculatedOneArrayOfNullableDates, persistedOneArrayOfNullableDates = persistedOneArrayOfNullableDates)

}
