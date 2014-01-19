package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfOneLongs_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneLongs: Option[IndexedSeq[Long]] = None,
     calculatedNullableListOfOneLongs: Option[IndexedSeq[Long]] = None,
     persistedNullableListOfOneLongs: Option[IndexedSeq[Long]] = None
  ) {

    require(nullableListOfOneLongs ne null, "Null value was provided for property \"nullableListOfOneLongs\"")
    if (nullableListOfOneLongs.isDefined) require(nullableListOfOneLongs.get ne null, "Null value was provided for property \"nullableListOfOneLongs\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneLongs") nullableListOfOneLongs: Option[IndexedSeq[Long]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneLongs") calculatedNullableListOfOneLongs: Option[IndexedSeq[Long]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneLongs") persistedNullableListOfOneLongs: Option[IndexedSeq[Long]]
  ) =
    this( nullableListOfOneLongs = nullableListOfOneLongs, calculatedNullableListOfOneLongs = calculatedNullableListOfOneLongs, persistedNullableListOfOneLongs = persistedNullableListOfOneLongs)

}
