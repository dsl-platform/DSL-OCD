package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfNullableDates_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableDates: Set[Option[org.joda.time.LocalDate]] = Set.empty,
     calculatedOneSetOfNullableDates: Set[Option[org.joda.time.LocalDate]] = Set.empty,
     persistedOneSetOfNullableDates: Set[Option[org.joda.time.LocalDate]] = Set.empty
  ) {

    require(oneSetOfNullableDates ne null, "Null value was provided for property \"oneSetOfNullableDates\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableDates)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableDates") oneSetOfNullableDates: Set[Option[org.joda.time.LocalDate]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableDates") calculatedOneSetOfNullableDates: Set[Option[org.joda.time.LocalDate]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableDates") persistedOneSetOfNullableDates: Set[Option[org.joda.time.LocalDate]]
  ) =
    this( oneSetOfNullableDates = if (oneSetOfNullableDates == null) Set.empty else oneSetOfNullableDates, calculatedOneSetOfNullableDates = calculatedOneSetOfNullableDates, persistedOneSetOfNullableDates = persistedOneSetOfNullableDates)

}
