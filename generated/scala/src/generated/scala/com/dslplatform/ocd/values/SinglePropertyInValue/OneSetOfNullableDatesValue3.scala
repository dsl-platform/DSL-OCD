package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfNullableDatesValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableDates: Set[Option[org.joda.time.LocalDate]] = Set.empty
  ) {

    require(oneSetOfNullableDates ne null, "Null value was provided for property \"oneSetOfNullableDates\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableDates)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableDates") oneSetOfNullableDates: Set[Option[org.joda.time.LocalDate]]
  ) =
    this( oneSetOfNullableDates = if (oneSetOfNullableDates == null) Set.empty else oneSetOfNullableDates)

}
