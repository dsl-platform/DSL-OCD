package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfNullableFloats_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableFloats: IndexedSeq[Option[Float]] = IndexedSeq.empty,
     calculatedOneListOfNullableFloats: IndexedSeq[Option[Float]] = IndexedSeq.empty,
     persistedOneListOfNullableFloats: IndexedSeq[Option[Float]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableFloats ne null, "Null value was provided for property \"oneListOfNullableFloats\"")
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneListOfNullableFloats)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableFloats") oneListOfNullableFloats: IndexedSeq[Option[Float]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableFloats") calculatedOneListOfNullableFloats: IndexedSeq[Option[Float]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableFloats") persistedOneListOfNullableFloats: IndexedSeq[Option[Float]]
  ) =
    this( oneListOfNullableFloats = if (oneListOfNullableFloats == null) IndexedSeq.empty else oneListOfNullableFloats, calculatedOneListOfNullableFloats = calculatedOneListOfNullableFloats, persistedOneListOfNullableFloats = persistedOneListOfNullableFloats)

}
