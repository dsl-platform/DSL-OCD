package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfOneTexts_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneTexts: IndexedSeq[String] = IndexedSeq.empty,
     calculatedOneListOfOneTexts: IndexedSeq[String] = IndexedSeq.empty,
     persistedOneListOfOneTexts: IndexedSeq[String] = IndexedSeq.empty
  ) {

    require(oneListOfOneTexts ne null, "Null value was provided for property \"oneListOfOneTexts\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneTexts)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneTexts") oneListOfOneTexts: IndexedSeq[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneTexts") calculatedOneListOfOneTexts: IndexedSeq[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneTexts") persistedOneListOfOneTexts: IndexedSeq[String]
  ) =
    this( oneListOfOneTexts = if (oneListOfOneTexts == null) IndexedSeq.empty else oneListOfOneTexts, calculatedOneListOfOneTexts = calculatedOneListOfOneTexts, persistedOneListOfOneTexts = persistedOneListOfOneTexts)

}
