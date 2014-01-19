package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfOneFloats_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneFloats: Option[Set[Float]] = None,
     calculatedNullableSetOfOneFloats: Option[Set[Float]] = None,
     persistedNullableSetOfOneFloats: Option[Set[Float]] = None
  ) {

    require(nullableSetOfOneFloats ne null, "Null value was provided for property \"nullableSetOfOneFloats\"")
    if (nullableSetOfOneFloats.isDefined) require(nullableSetOfOneFloats.get ne null, "Null value was provided for property \"nullableSetOfOneFloats\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneFloats") nullableSetOfOneFloats: Option[Set[Float]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneFloats") calculatedNullableSetOfOneFloats: Option[Set[Float]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneFloats") persistedNullableSetOfOneFloats: Option[Set[Float]]
  ) =
    this( nullableSetOfOneFloats = nullableSetOfOneFloats, calculatedNullableSetOfOneFloats = calculatedNullableSetOfOneFloats, persistedNullableSetOfOneFloats = persistedNullableSetOfOneFloats)

}
