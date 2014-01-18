package com.dslplatform.ocd.values.PropertyInValue

case class NullableArrayOfOneDates_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneDates: Option[Array[org.joda.time.LocalDate]] = None
  ) {

    require(nullableArrayOfOneDates ne null, "Null value was provided for property \"nullableArrayOfOneDates\"")
    if (nullableArrayOfOneDates.isDefined) require(nullableArrayOfOneDates.get ne null, "Null value was provided for property \"nullableArrayOfOneDates\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneDates)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneDates") nullableArrayOfOneDates: Option[Array[org.joda.time.LocalDate]]
  ) =
    this( nullableArrayOfOneDates = nullableArrayOfOneDates)

}
