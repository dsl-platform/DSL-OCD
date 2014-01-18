package com.dslplatform.ocd.values.PropertyInValue

case class NullableArrayOfNullableDates_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableDates: Option[Array[Option[org.joda.time.LocalDate]]] = None
  ) {

    require(nullableArrayOfNullableDates ne null, "Null value was provided for property \"nullableArrayOfNullableDates\"")
    if (nullableArrayOfNullableDates.isDefined) require(nullableArrayOfNullableDates.get ne null, "Null value was provided for property \"nullableArrayOfNullableDates\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableDates)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableDates") nullableArrayOfNullableDates: Option[Array[Option[org.joda.time.LocalDate]]]
  ) =
    this( nullableArrayOfNullableDates = nullableArrayOfNullableDates)

}
