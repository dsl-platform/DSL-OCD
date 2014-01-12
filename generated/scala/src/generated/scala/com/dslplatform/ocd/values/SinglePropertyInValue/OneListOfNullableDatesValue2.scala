package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneListOfNullableDatesValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableDates: IndexedSeq[Option[org.joda.time.LocalDate]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableDates ne null, "Null value was provided for property \"oneListOfNullableDates\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableDates)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableDates") oneListOfNullableDates: IndexedSeq[Option[org.joda.time.LocalDate]]
  ) =
    this( oneListOfNullableDates = if (oneListOfNullableDates == null) IndexedSeq.empty else oneListOfNullableDates)

}
