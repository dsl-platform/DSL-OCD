package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfOneDatesValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneDates: Option[IndexedSeq[org.joda.time.LocalDate]] = None
  ) {

    require(nullableListOfOneDates ne null, "Null value was provided for property \"nullableListOfOneDates\"")
    if (nullableListOfOneDates.isDefined) require(nullableListOfOneDates.get ne null, "Null value was provided for property \"nullableListOfOneDates\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneDates)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneDates") nullableListOfOneDates: Option[IndexedSeq[org.joda.time.LocalDate]]
  ) =
    this( nullableListOfOneDates = nullableListOfOneDates)

}
