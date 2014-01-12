package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneListOfOneDatesValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneDates: IndexedSeq[org.joda.time.LocalDate] = IndexedSeq.empty
  ) {

    require(oneListOfOneDates ne null, "Null value was provided for property \"oneListOfOneDates\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneDates)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneDates") oneListOfOneDates: IndexedSeq[org.joda.time.LocalDate]
  ) =
    this( oneListOfOneDates = if (oneListOfOneDates == null) IndexedSeq.empty else oneListOfOneDates)

}
