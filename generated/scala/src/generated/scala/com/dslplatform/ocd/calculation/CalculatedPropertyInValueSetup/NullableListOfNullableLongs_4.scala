package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfNullableLongs_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullableLongs: Option[IndexedSeq[Option[Long]]] = None,
     calculatedNullableListOfNullableLongs: Option[IndexedSeq[Option[Long]]] = None,
     persistedNullableListOfNullableLongs: Option[IndexedSeq[Option[Long]]] = None
  ) {

    require(nullableListOfNullableLongs ne null, "Null value was provided for property \"nullableListOfNullableLongs\"")
    if (nullableListOfNullableLongs.isDefined) require(nullableListOfNullableLongs.get ne null, "Null value was provided for property \"nullableListOfNullableLongs\"")
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(nullableListOfNullableLongs)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableLongs") nullableListOfNullableLongs: Option[IndexedSeq[Option[Long]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableLongs") calculatedNullableListOfNullableLongs: Option[IndexedSeq[Option[Long]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableLongs") persistedNullableListOfNullableLongs: Option[IndexedSeq[Option[Long]]]
  ) =
    this( nullableListOfNullableLongs = nullableListOfNullableLongs, calculatedNullableListOfNullableLongs = calculatedNullableListOfNullableLongs, persistedNullableListOfNullableLongs = persistedNullableListOfNullableLongs)

}
