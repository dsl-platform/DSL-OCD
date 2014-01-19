package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfNullableTimestamps_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableTimestamps: Option[Array[Option[org.joda.time.DateTime]]] = None,
     calculatedNullableArrayOfNullableTimestamps: Option[Array[Option[org.joda.time.DateTime]]] = None,
     persistedNullableArrayOfNullableTimestamps: Option[Array[Option[org.joda.time.DateTime]]] = None
  ) {

    require(nullableArrayOfNullableTimestamps ne null, "Null value was provided for property \"nullableArrayOfNullableTimestamps\"")
    if (nullableArrayOfNullableTimestamps.isDefined) require(nullableArrayOfNullableTimestamps.get ne null, "Null value was provided for property \"nullableArrayOfNullableTimestamps\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableTimestamps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableTimestamps") nullableArrayOfNullableTimestamps: Option[Array[Option[org.joda.time.DateTime]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableTimestamps") calculatedNullableArrayOfNullableTimestamps: Option[Array[Option[org.joda.time.DateTime]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableTimestamps") persistedNullableArrayOfNullableTimestamps: Option[Array[Option[org.joda.time.DateTime]]]
  ) =
    this( nullableArrayOfNullableTimestamps = nullableArrayOfNullableTimestamps, calculatedNullableArrayOfNullableTimestamps = calculatedNullableArrayOfNullableTimestamps, persistedNullableArrayOfNullableTimestamps = persistedNullableArrayOfNullableTimestamps)

}
