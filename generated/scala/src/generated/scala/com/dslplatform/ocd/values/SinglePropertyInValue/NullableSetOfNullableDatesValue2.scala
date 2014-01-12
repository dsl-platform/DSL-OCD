package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableSetOfNullableDatesValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableDates: Option[Set[Option[org.joda.time.LocalDate]]] = None
  ) {

    require(nullableSetOfNullableDates ne null, "Null value was provided for property \"nullableSetOfNullableDates\"")
    if (nullableSetOfNullableDates.isDefined) require(nullableSetOfNullableDates.get ne null, "Null value was provided for property \"nullableSetOfNullableDates\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableDates)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableDates") nullableSetOfNullableDates: Option[Set[Option[org.joda.time.LocalDate]]]
  ) =
    this( nullableSetOfNullableDates = nullableSetOfNullableDates)

}
