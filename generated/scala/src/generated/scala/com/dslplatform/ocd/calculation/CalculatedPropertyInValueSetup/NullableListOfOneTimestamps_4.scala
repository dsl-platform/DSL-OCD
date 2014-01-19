package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfOneTimestamps_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneTimestamps: Option[IndexedSeq[org.joda.time.DateTime]] = None,
     calculatedNullableListOfOneTimestamps: Option[IndexedSeq[org.joda.time.DateTime]] = None,
     persistedNullableListOfOneTimestamps: Option[IndexedSeq[org.joda.time.DateTime]] = None
  ) {

    require(nullableListOfOneTimestamps ne null, "Null value was provided for property \"nullableListOfOneTimestamps\"")
    if (nullableListOfOneTimestamps.isDefined) require(nullableListOfOneTimestamps.get ne null, "Null value was provided for property \"nullableListOfOneTimestamps\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneTimestamps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneTimestamps") nullableListOfOneTimestamps: Option[IndexedSeq[org.joda.time.DateTime]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneTimestamps") calculatedNullableListOfOneTimestamps: Option[IndexedSeq[org.joda.time.DateTime]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneTimestamps") persistedNullableListOfOneTimestamps: Option[IndexedSeq[org.joda.time.DateTime]]
  ) =
    this( nullableListOfOneTimestamps = nullableListOfOneTimestamps, calculatedNullableListOfOneTimestamps = calculatedNullableListOfOneTimestamps, persistedNullableListOfOneTimestamps = persistedNullableListOfOneTimestamps)

}
