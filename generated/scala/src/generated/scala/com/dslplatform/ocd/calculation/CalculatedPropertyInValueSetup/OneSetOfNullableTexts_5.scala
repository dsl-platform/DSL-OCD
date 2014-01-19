package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfNullableTexts_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableTexts: Set[Option[String]] = Set.empty,
     calculatedOneSetOfNullableTexts: Set[Option[String]] = Set.empty,
     persistedOneSetOfNullableTexts: Set[Option[String]] = Set.empty
  ) {

    require(oneSetOfNullableTexts ne null, "Null value was provided for property \"oneSetOfNullableTexts\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableTexts)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableTexts") oneSetOfNullableTexts: Set[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableTexts") calculatedOneSetOfNullableTexts: Set[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableTexts") persistedOneSetOfNullableTexts: Set[Option[String]]
  ) =
    this( oneSetOfNullableTexts = if (oneSetOfNullableTexts == null) Set.empty else oneSetOfNullableTexts, calculatedOneSetOfNullableTexts = calculatedOneSetOfNullableTexts, persistedOneSetOfNullableTexts = persistedOneSetOfNullableTexts)

}
