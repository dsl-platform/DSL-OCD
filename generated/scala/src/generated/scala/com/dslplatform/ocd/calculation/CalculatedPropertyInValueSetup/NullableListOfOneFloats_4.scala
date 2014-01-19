package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfOneFloats_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneFloats: Option[IndexedSeq[Float]] = None,
     calculatedNullableListOfOneFloats: Option[IndexedSeq[Float]] = None,
     persistedNullableListOfOneFloats: Option[IndexedSeq[Float]] = None
  ) {

    require(nullableListOfOneFloats ne null, "Null value was provided for property \"nullableListOfOneFloats\"")
    if (nullableListOfOneFloats.isDefined) require(nullableListOfOneFloats.get ne null, "Null value was provided for property \"nullableListOfOneFloats\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneFloats") nullableListOfOneFloats: Option[IndexedSeq[Float]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneFloats") calculatedNullableListOfOneFloats: Option[IndexedSeq[Float]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneFloats") persistedNullableListOfOneFloats: Option[IndexedSeq[Float]]
  ) =
    this( nullableListOfOneFloats = nullableListOfOneFloats, calculatedNullableListOfOneFloats = calculatedNullableListOfOneFloats, persistedNullableListOfOneFloats = persistedNullableListOfOneFloats)

}
