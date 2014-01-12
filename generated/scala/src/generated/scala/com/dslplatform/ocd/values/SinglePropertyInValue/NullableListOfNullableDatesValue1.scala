package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfNullableDatesValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullableDates: Option[IndexedSeq[Option[org.joda.time.LocalDate]]] = None
  ) {

    require(nullableListOfNullableDates ne null, "Null value was provided for property \"nullableListOfNullableDates\"")
    if (nullableListOfNullableDates.isDefined) require(nullableListOfNullableDates.get ne null, "Null value was provided for property \"nullableListOfNullableDates\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableDates)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableDates") nullableListOfNullableDates: Option[IndexedSeq[Option[org.joda.time.LocalDate]]]
  ) =
    this( nullableListOfNullableDates = nullableListOfNullableDates)

}
