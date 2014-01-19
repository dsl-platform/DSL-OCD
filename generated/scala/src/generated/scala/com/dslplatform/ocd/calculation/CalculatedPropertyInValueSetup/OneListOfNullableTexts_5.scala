package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfNullableTexts_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableTexts: IndexedSeq[Option[String]] = IndexedSeq.empty,
     calculatedOneListOfNullableTexts: IndexedSeq[Option[String]] = IndexedSeq.empty,
     persistedOneListOfNullableTexts: IndexedSeq[Option[String]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableTexts ne null, "Null value was provided for property \"oneListOfNullableTexts\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableTexts)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableTexts") oneListOfNullableTexts: IndexedSeq[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableTexts") calculatedOneListOfNullableTexts: IndexedSeq[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableTexts") persistedOneListOfNullableTexts: IndexedSeq[Option[String]]
  ) =
    this( oneListOfNullableTexts = if (oneListOfNullableTexts == null) IndexedSeq.empty else oneListOfNullableTexts, calculatedOneListOfNullableTexts = calculatedOneListOfNullableTexts, persistedOneListOfNullableTexts = persistedOneListOfNullableTexts)

}
