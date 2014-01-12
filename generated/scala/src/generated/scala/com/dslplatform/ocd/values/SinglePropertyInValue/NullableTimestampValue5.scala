package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableTimestampValue5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableTimestamp: Option[org.joda.time.DateTime] = None
  ) {

    require(nullableTimestamp ne null, "Null value was provided for property \"nullableTimestamp\"")
    if (nullableTimestamp.isDefined) require(nullableTimestamp.get ne null, "Null value was provided for property \"nullableTimestamp\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableTimestamp") nullableTimestamp: Option[org.joda.time.DateTime]
  ) =
    this( nullableTimestamp = nullableTimestamp)

}
