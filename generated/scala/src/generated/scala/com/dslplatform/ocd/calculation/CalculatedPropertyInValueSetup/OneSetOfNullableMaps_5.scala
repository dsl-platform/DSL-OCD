package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfNullableMaps_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableMaps: Set[Option[Map[String, String]]] = Set.empty,
     calculatedOneSetOfNullableMaps: Set[Option[Map[String, String]]] = Set.empty,
     persistedOneSetOfNullableMaps: Set[Option[Map[String, String]]] = Set.empty
  ) {

    require(oneSetOfNullableMaps ne null, "Null value was provided for property \"oneSetOfNullableMaps\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableMaps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableMaps") oneSetOfNullableMaps: Set[Option[Map[String, String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableMaps") calculatedOneSetOfNullableMaps: Set[Option[Map[String, String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableMaps") persistedOneSetOfNullableMaps: Set[Option[Map[String, String]]]
  ) =
    this( oneSetOfNullableMaps = if (oneSetOfNullableMaps == null) Set.empty else oneSetOfNullableMaps, calculatedOneSetOfNullableMaps = calculatedOneSetOfNullableMaps, persistedOneSetOfNullableMaps = persistedOneSetOfNullableMaps)

}
