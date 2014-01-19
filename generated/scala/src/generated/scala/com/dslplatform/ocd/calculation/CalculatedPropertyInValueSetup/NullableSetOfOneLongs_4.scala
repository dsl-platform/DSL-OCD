package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfOneLongs_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneLongs: Option[Set[Long]] = None,
     calculatedNullableSetOfOneLongs: Option[Set[Long]] = None,
     persistedNullableSetOfOneLongs: Option[Set[Long]] = None
  ) {

    require(nullableSetOfOneLongs ne null, "Null value was provided for property \"nullableSetOfOneLongs\"")
    if (nullableSetOfOneLongs.isDefined) require(nullableSetOfOneLongs.get ne null, "Null value was provided for property \"nullableSetOfOneLongs\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneLongs") nullableSetOfOneLongs: Option[Set[Long]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneLongs") calculatedNullableSetOfOneLongs: Option[Set[Long]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneLongs") persistedNullableSetOfOneLongs: Option[Set[Long]]
  ) =
    this( nullableSetOfOneLongs = nullableSetOfOneLongs, calculatedNullableSetOfOneLongs = calculatedNullableSetOfOneLongs, persistedNullableSetOfOneLongs = persistedNullableSetOfOneLongs)

}
