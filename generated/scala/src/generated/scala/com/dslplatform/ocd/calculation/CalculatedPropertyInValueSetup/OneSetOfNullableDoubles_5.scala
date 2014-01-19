package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfNullableDoubles_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableDoubles: Set[Option[Double]] = Set.empty,
     calculatedOneSetOfNullableDoubles: Set[Option[Double]] = Set.empty,
     persistedOneSetOfNullableDoubles: Set[Option[Double]] = Set.empty
  ) {

    require(oneSetOfNullableDoubles ne null, "Null value was provided for property \"oneSetOfNullableDoubles\"")
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneSetOfNullableDoubles)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableDoubles") oneSetOfNullableDoubles: Set[Option[Double]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableDoubles") calculatedOneSetOfNullableDoubles: Set[Option[Double]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableDoubles") persistedOneSetOfNullableDoubles: Set[Option[Double]]
  ) =
    this( oneSetOfNullableDoubles = if (oneSetOfNullableDoubles == null) Set.empty else oneSetOfNullableDoubles, calculatedOneSetOfNullableDoubles = calculatedOneSetOfNullableDoubles, persistedOneSetOfNullableDoubles = persistedOneSetOfNullableDoubles)

}
