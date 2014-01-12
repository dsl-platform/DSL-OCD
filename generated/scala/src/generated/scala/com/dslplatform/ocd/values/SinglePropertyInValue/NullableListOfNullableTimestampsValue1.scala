package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfNullableTimestampsValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullableTimestamps: Option[IndexedSeq[Option[org.joda.time.DateTime]]] = None
  ) {

    require(nullableListOfNullableTimestamps ne null, "Null value was provided for property \"nullableListOfNullableTimestamps\"")
    if (nullableListOfNullableTimestamps.isDefined) require(nullableListOfNullableTimestamps.get ne null, "Null value was provided for property \"nullableListOfNullableTimestamps\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableTimestamps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableTimestamps") nullableListOfNullableTimestamps: Option[IndexedSeq[Option[org.joda.time.DateTime]]]
  ) =
    this( nullableListOfNullableTimestamps = nullableListOfNullableTimestamps)

}
