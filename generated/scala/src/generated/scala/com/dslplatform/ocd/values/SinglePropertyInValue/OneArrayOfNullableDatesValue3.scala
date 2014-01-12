package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfNullableDatesValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableDates: Array[Option[org.joda.time.LocalDate]] = Array.empty
  ) {

    require(oneArrayOfNullableDates ne null, "Null value was provided for property \"oneArrayOfNullableDates\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableDates)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableDates") oneArrayOfNullableDates: Array[Option[org.joda.time.LocalDate]]
  ) =
    this( oneArrayOfNullableDates = if (oneArrayOfNullableDates == null) Array.empty else oneArrayOfNullableDates)

}
