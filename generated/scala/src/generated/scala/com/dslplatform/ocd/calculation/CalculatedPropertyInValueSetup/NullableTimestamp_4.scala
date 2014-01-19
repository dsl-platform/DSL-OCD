package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableTimestamp_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableTimestamp: Option[org.joda.time.DateTime] = None,
     calculatedNullableTimestamp: Option[org.joda.time.DateTime] = None,
     persistedNullableTimestamp: Option[org.joda.time.DateTime] = None
  ) {

    require(nullableTimestamp ne null, "Null value was provided for property \"nullableTimestamp\"")
    if (nullableTimestamp.isDefined) require(nullableTimestamp.get ne null, "Null value was provided for property \"nullableTimestamp\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableTimestamp") nullableTimestamp: Option[org.joda.time.DateTime]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableTimestamp") calculatedNullableTimestamp: Option[org.joda.time.DateTime]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableTimestamp") persistedNullableTimestamp: Option[org.joda.time.DateTime]
  ) =
    this( nullableTimestamp = nullableTimestamp, calculatedNullableTimestamp = calculatedNullableTimestamp, persistedNullableTimestamp = persistedNullableTimestamp)

}
