package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfOneDates_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneDates: Option[Set[org.joda.time.LocalDate]] = None,
     calculatedNullableSetOfOneDates: Option[Set[org.joda.time.LocalDate]] = None,
     persistedNullableSetOfOneDates: Option[Set[org.joda.time.LocalDate]] = None
  ) {

    require(nullableSetOfOneDates ne null, "Null value was provided for property \"nullableSetOfOneDates\"")
    if (nullableSetOfOneDates.isDefined) require(nullableSetOfOneDates.get ne null, "Null value was provided for property \"nullableSetOfOneDates\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneDates)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneDates") nullableSetOfOneDates: Option[Set[org.joda.time.LocalDate]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneDates") calculatedNullableSetOfOneDates: Option[Set[org.joda.time.LocalDate]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneDates") persistedNullableSetOfOneDates: Option[Set[org.joda.time.LocalDate]]
  ) =
    this( nullableSetOfOneDates = nullableSetOfOneDates, calculatedNullableSetOfOneDates = calculatedNullableSetOfOneDates, persistedNullableSetOfOneDates = persistedNullableSetOfOneDates)

}
