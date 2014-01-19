package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfOneDates_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneDates: Set[org.joda.time.LocalDate] = Set.empty,
     calculatedOneSetOfOneDates: Set[org.joda.time.LocalDate] = Set.empty,
     persistedOneSetOfOneDates: Set[org.joda.time.LocalDate] = Set.empty
  ) {

    require(oneSetOfOneDates ne null, "Null value was provided for property \"oneSetOfOneDates\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneDates)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneDates") oneSetOfOneDates: Set[org.joda.time.LocalDate]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneDates") calculatedOneSetOfOneDates: Set[org.joda.time.LocalDate]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneDates") persistedOneSetOfOneDates: Set[org.joda.time.LocalDate]
  ) =
    this( oneSetOfOneDates = if (oneSetOfOneDates == null) Set.empty else oneSetOfOneDates, calculatedOneSetOfOneDates = calculatedOneSetOfOneDates, persistedOneSetOfOneDates = persistedOneSetOfOneDates)

}
