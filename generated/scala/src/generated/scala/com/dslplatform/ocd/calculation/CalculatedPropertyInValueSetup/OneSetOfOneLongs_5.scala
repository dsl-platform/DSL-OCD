package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfOneLongs_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneLongs: Set[Long] = Set.empty,
     calculatedOneSetOfOneLongs: Set[Long] = Set.empty,
     persistedOneSetOfOneLongs: Set[Long] = Set.empty
  ) {

    require(oneSetOfOneLongs ne null, "Null value was provided for property \"oneSetOfOneLongs\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneLongs") oneSetOfOneLongs: Set[Long]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneLongs") calculatedOneSetOfOneLongs: Set[Long]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneLongs") persistedOneSetOfOneLongs: Set[Long]
  ) =
    this( oneSetOfOneLongs = if (oneSetOfOneLongs == null) Set.empty else oneSetOfOneLongs, calculatedOneSetOfOneLongs = calculatedOneSetOfOneLongs, persistedOneSetOfOneLongs = persistedOneSetOfOneLongs)

}
