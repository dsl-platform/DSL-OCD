package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableDate_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableDate: Option[org.joda.time.LocalDate] = None,
     calculatedNullableDate: Option[org.joda.time.LocalDate] = None,
     persistedNullableDate: Option[org.joda.time.LocalDate] = None
  ) {

    require(nullableDate ne null, "Null value was provided for property \"nullableDate\"")
    if (nullableDate.isDefined) require(nullableDate.get ne null, "Null value was provided for property \"nullableDate\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableDate") nullableDate: Option[org.joda.time.LocalDate]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableDate") calculatedNullableDate: Option[org.joda.time.LocalDate]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableDate") persistedNullableDate: Option[org.joda.time.LocalDate]
  ) =
    this( nullableDate = nullableDate, calculatedNullableDate = calculatedNullableDate, persistedNullableDate = persistedNullableDate)

}
