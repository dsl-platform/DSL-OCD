package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfNullableStrings_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableStrings: IndexedSeq[Option[String]] = IndexedSeq.empty,
     calculatedOneListOfNullableStrings: IndexedSeq[Option[String]] = IndexedSeq.empty,
     persistedOneListOfNullableStrings: IndexedSeq[Option[String]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableStrings ne null, "Null value was provided for property \"oneListOfNullableStrings\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableStrings)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableStrings") oneListOfNullableStrings: IndexedSeq[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableStrings") calculatedOneListOfNullableStrings: IndexedSeq[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableStrings") persistedOneListOfNullableStrings: IndexedSeq[Option[String]]
  ) =
    this( oneListOfNullableStrings = if (oneListOfNullableStrings == null) IndexedSeq.empty else oneListOfNullableStrings, calculatedOneListOfNullableStrings = calculatedOneListOfNullableStrings, persistedOneListOfNullableStrings = persistedOneListOfNullableStrings)

}
