package com.dslplatform.ocd.values.PropertyInValue

case class NullableDate_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableDate: Option[org.joda.time.LocalDate] = None
  ) {

    require(nullableDate ne null, "Null value was provided for property \"nullableDate\"")
    if (nullableDate.isDefined) require(nullableDate.get ne null, "Null value was provided for property \"nullableDate\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableDate") nullableDate: Option[org.joda.time.LocalDate]
  ) =
    this( nullableDate = nullableDate)

}