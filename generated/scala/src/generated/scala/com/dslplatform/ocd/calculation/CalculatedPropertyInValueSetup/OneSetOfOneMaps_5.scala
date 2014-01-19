package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfOneMaps_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneMaps: Set[Map[String, String]] = Set.empty,
     calculatedOneSetOfOneMaps: Set[Map[String, String]] = Set.empty,
     persistedOneSetOfOneMaps: Set[Map[String, String]] = Set.empty
  ) {

    require(oneSetOfOneMaps ne null, "Null value was provided for property \"oneSetOfOneMaps\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneMaps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneMaps") oneSetOfOneMaps: Set[Map[String, String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneMaps") calculatedOneSetOfOneMaps: Set[Map[String, String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneMaps") persistedOneSetOfOneMaps: Set[Map[String, String]]
  ) =
    this( oneSetOfOneMaps = if (oneSetOfOneMaps == null) Set.empty else oneSetOfOneMaps, calculatedOneSetOfOneMaps = calculatedOneSetOfOneMaps, persistedOneSetOfOneMaps = persistedOneSetOfOneMaps)

}
