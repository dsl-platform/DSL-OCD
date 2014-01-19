package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfNullableLongs_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableLongs: Set[Option[Long]] = Set.empty,
     calculatedOneSetOfNullableLongs: Set[Option[Long]] = Set.empty,
     persistedOneSetOfNullableLongs: Set[Option[Long]] = Set.empty
  ) {

    require(oneSetOfNullableLongs ne null, "Null value was provided for property \"oneSetOfNullableLongs\"")
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneSetOfNullableLongs)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableLongs") oneSetOfNullableLongs: Set[Option[Long]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableLongs") calculatedOneSetOfNullableLongs: Set[Option[Long]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableLongs") persistedOneSetOfNullableLongs: Set[Option[Long]]
  ) =
    this( oneSetOfNullableLongs = if (oneSetOfNullableLongs == null) Set.empty else oneSetOfNullableLongs, calculatedOneSetOfNullableLongs = calculatedOneSetOfNullableLongs, persistedOneSetOfNullableLongs = persistedOneSetOfNullableLongs)

}
