package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfOneMaps_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneMaps: Option[IndexedSeq[Map[String, String]]] = None,
     calculatedNullableListOfOneMaps: Option[IndexedSeq[Map[String, String]]] = None,
     persistedNullableListOfOneMaps: Option[IndexedSeq[Map[String, String]]] = None
  ) {

    require(nullableListOfOneMaps ne null, "Null value was provided for property \"nullableListOfOneMaps\"")
    if (nullableListOfOneMaps.isDefined) require(nullableListOfOneMaps.get ne null, "Null value was provided for property \"nullableListOfOneMaps\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneMaps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneMaps") nullableListOfOneMaps: Option[IndexedSeq[Map[String, String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneMaps") calculatedNullableListOfOneMaps: Option[IndexedSeq[Map[String, String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneMaps") persistedNullableListOfOneMaps: Option[IndexedSeq[Map[String, String]]]
  ) =
    this( nullableListOfOneMaps = nullableListOfOneMaps, calculatedNullableListOfOneMaps = calculatedNullableListOfOneMaps, persistedNullableListOfOneMaps = persistedNullableListOfOneMaps)

}
