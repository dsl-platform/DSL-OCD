package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfNullableTimestamps_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullableTimestamps: Option[IndexedSeq[Option[org.joda.time.DateTime]]] = None,
     calculatedNullableListOfNullableTimestamps: Option[IndexedSeq[Option[org.joda.time.DateTime]]] = None,
     persistedNullableListOfNullableTimestamps: Option[IndexedSeq[Option[org.joda.time.DateTime]]] = None
  ) {

    require(nullableListOfNullableTimestamps ne null, "Null value was provided for property \"nullableListOfNullableTimestamps\"")
    if (nullableListOfNullableTimestamps.isDefined) require(nullableListOfNullableTimestamps.get ne null, "Null value was provided for property \"nullableListOfNullableTimestamps\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableTimestamps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableTimestamps") nullableListOfNullableTimestamps: Option[IndexedSeq[Option[org.joda.time.DateTime]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableTimestamps") calculatedNullableListOfNullableTimestamps: Option[IndexedSeq[Option[org.joda.time.DateTime]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableTimestamps") persistedNullableListOfNullableTimestamps: Option[IndexedSeq[Option[org.joda.time.DateTime]]]
  ) =
    this( nullableListOfNullableTimestamps = nullableListOfNullableTimestamps, calculatedNullableListOfNullableTimestamps = calculatedNullableListOfNullableTimestamps, persistedNullableListOfNullableTimestamps = persistedNullableListOfNullableTimestamps)

}
