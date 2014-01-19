package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfOneFloats_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneFloats: Set[Float] = Set.empty,
     calculatedOneSetOfOneFloats: Set[Float] = Set.empty,
     persistedOneSetOfOneFloats: Set[Float] = Set.empty
  ) {

    require(oneSetOfOneFloats ne null, "Null value was provided for property \"oneSetOfOneFloats\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneFloats") oneSetOfOneFloats: Set[Float]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneFloats") calculatedOneSetOfOneFloats: Set[Float]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneFloats") persistedOneSetOfOneFloats: Set[Float]
  ) =
    this( oneSetOfOneFloats = if (oneSetOfOneFloats == null) Set.empty else oneSetOfOneFloats, calculatedOneSetOfOneFloats = calculatedOneSetOfOneFloats, persistedOneSetOfOneFloats = persistedOneSetOfOneFloats)

}
