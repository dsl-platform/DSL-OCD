package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfOneTexts_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneTexts: Set[String] = Set.empty,
     calculatedOneSetOfOneTexts: Set[String] = Set.empty,
     persistedOneSetOfOneTexts: Set[String] = Set.empty
  ) {

    require(oneSetOfOneTexts ne null, "Null value was provided for property \"oneSetOfOneTexts\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneTexts)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneTexts") oneSetOfOneTexts: Set[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneTexts") calculatedOneSetOfOneTexts: Set[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneTexts") persistedOneSetOfOneTexts: Set[String]
  ) =
    this( oneSetOfOneTexts = if (oneSetOfOneTexts == null) Set.empty else oneSetOfOneTexts, calculatedOneSetOfOneTexts = calculatedOneSetOfOneTexts, persistedOneSetOfOneTexts = persistedOneSetOfOneTexts)

}
