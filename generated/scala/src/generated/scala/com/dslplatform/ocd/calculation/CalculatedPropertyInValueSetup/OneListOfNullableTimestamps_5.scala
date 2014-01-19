package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfNullableTimestamps_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableTimestamps: IndexedSeq[Option[org.joda.time.DateTime]] = IndexedSeq.empty,
     calculatedOneListOfNullableTimestamps: IndexedSeq[Option[org.joda.time.DateTime]] = IndexedSeq.empty,
     persistedOneListOfNullableTimestamps: IndexedSeq[Option[org.joda.time.DateTime]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableTimestamps ne null, "Null value was provided for property \"oneListOfNullableTimestamps\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableTimestamps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableTimestamps") oneListOfNullableTimestamps: IndexedSeq[Option[org.joda.time.DateTime]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableTimestamps") calculatedOneListOfNullableTimestamps: IndexedSeq[Option[org.joda.time.DateTime]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableTimestamps") persistedOneListOfNullableTimestamps: IndexedSeq[Option[org.joda.time.DateTime]]
  ) =
    this( oneListOfNullableTimestamps = if (oneListOfNullableTimestamps == null) IndexedSeq.empty else oneListOfNullableTimestamps, calculatedOneListOfNullableTimestamps = calculatedOneListOfNullableTimestamps, persistedOneListOfNullableTimestamps = persistedOneListOfNullableTimestamps)

}
