package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfNullableLongs_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableLongs: Option[Set[Option[Long]]] = None,
     calculatedNullableSetOfNullableLongs: Option[Set[Option[Long]]] = None,
     persistedNullableSetOfNullableLongs: Option[Set[Option[Long]]] = None
  ) {

    require(nullableSetOfNullableLongs ne null, "Null value was provided for property \"nullableSetOfNullableLongs\"")
    if (nullableSetOfNullableLongs.isDefined) require(nullableSetOfNullableLongs.get ne null, "Null value was provided for property \"nullableSetOfNullableLongs\"")
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(nullableSetOfNullableLongs)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableLongs") nullableSetOfNullableLongs: Option[Set[Option[Long]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableLongs") calculatedNullableSetOfNullableLongs: Option[Set[Option[Long]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableLongs") persistedNullableSetOfNullableLongs: Option[Set[Option[Long]]]
  ) =
    this( nullableSetOfNullableLongs = nullableSetOfNullableLongs, calculatedNullableSetOfNullableLongs = calculatedNullableSetOfNullableLongs, persistedNullableSetOfNullableLongs = persistedNullableSetOfNullableLongs)

}
