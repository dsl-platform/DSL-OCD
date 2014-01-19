package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfOneDates_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneDates: Option[IndexedSeq[org.joda.time.LocalDate]] = None,
     calculatedNullableListOfOneDates: Option[IndexedSeq[org.joda.time.LocalDate]] = None,
     persistedNullableListOfOneDates: Option[IndexedSeq[org.joda.time.LocalDate]] = None
  ) {

    require(nullableListOfOneDates ne null, "Null value was provided for property \"nullableListOfOneDates\"")
    if (nullableListOfOneDates.isDefined) require(nullableListOfOneDates.get ne null, "Null value was provided for property \"nullableListOfOneDates\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneDates)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneDates") nullableListOfOneDates: Option[IndexedSeq[org.joda.time.LocalDate]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneDates") calculatedNullableListOfOneDates: Option[IndexedSeq[org.joda.time.LocalDate]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneDates") persistedNullableListOfOneDates: Option[IndexedSeq[org.joda.time.LocalDate]]
  ) =
    this( nullableListOfOneDates = nullableListOfOneDates, calculatedNullableListOfOneDates = calculatedNullableListOfOneDates, persistedNullableListOfOneDates = persistedNullableListOfOneDates)

}
