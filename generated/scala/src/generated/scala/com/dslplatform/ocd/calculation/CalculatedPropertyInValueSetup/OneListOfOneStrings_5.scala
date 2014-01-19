package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfOneStrings_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneStrings: IndexedSeq[String] = IndexedSeq.empty,
     calculatedOneListOfOneStrings: IndexedSeq[String] = IndexedSeq.empty,
     persistedOneListOfOneStrings: IndexedSeq[String] = IndexedSeq.empty
  ) {

    require(oneListOfOneStrings ne null, "Null value was provided for property \"oneListOfOneStrings\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneStrings)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneStrings") oneListOfOneStrings: IndexedSeq[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneStrings") calculatedOneListOfOneStrings: IndexedSeq[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneStrings") persistedOneListOfOneStrings: IndexedSeq[String]
  ) =
    this( oneListOfOneStrings = if (oneListOfOneStrings == null) IndexedSeq.empty else oneListOfOneStrings, calculatedOneListOfOneStrings = calculatedOneListOfOneStrings, persistedOneListOfOneStrings = persistedOneListOfOneStrings)

}
