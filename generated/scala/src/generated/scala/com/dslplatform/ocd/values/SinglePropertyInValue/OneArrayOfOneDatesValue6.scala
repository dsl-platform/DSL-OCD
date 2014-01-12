package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfOneDatesValue6 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneDates: Array[org.joda.time.LocalDate] = Array.empty
  ) {

    require(oneArrayOfOneDates ne null, "Null value was provided for property \"oneArrayOfOneDates\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneDates)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneDates") oneArrayOfOneDates: Array[org.joda.time.LocalDate]
  ) =
    this( oneArrayOfOneDates = if (oneArrayOfOneDates == null) Array.empty else oneArrayOfOneDates)

}
