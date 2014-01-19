package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfOneMaps_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneMaps: IndexedSeq[Map[String, String]] = IndexedSeq.empty,
     calculatedOneListOfOneMaps: IndexedSeq[Map[String, String]] = IndexedSeq.empty,
     persistedOneListOfOneMaps: IndexedSeq[Map[String, String]] = IndexedSeq.empty
  ) {

    require(oneListOfOneMaps ne null, "Null value was provided for property \"oneListOfOneMaps\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneMaps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneMaps") oneListOfOneMaps: IndexedSeq[Map[String, String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneMaps") calculatedOneListOfOneMaps: IndexedSeq[Map[String, String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneMaps") persistedOneListOfOneMaps: IndexedSeq[Map[String, String]]
  ) =
    this( oneListOfOneMaps = if (oneListOfOneMaps == null) IndexedSeq.empty else oneListOfOneMaps, calculatedOneListOfOneMaps = calculatedOneListOfOneMaps, persistedOneListOfOneMaps = persistedOneListOfOneMaps)

}
