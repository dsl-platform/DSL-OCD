package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfOneLongs_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneLongs: IndexedSeq[Long] = IndexedSeq.empty,
     calculatedOneListOfOneLongs: IndexedSeq[Long] = IndexedSeq.empty,
     persistedOneListOfOneLongs: IndexedSeq[Long] = IndexedSeq.empty
  ) {

    require(oneListOfOneLongs ne null, "Null value was provided for property \"oneListOfOneLongs\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneLongs") oneListOfOneLongs: IndexedSeq[Long]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneLongs") calculatedOneListOfOneLongs: IndexedSeq[Long]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneLongs") persistedOneListOfOneLongs: IndexedSeq[Long]
  ) =
    this( oneListOfOneLongs = if (oneListOfOneLongs == null) IndexedSeq.empty else oneListOfOneLongs, calculatedOneListOfOneLongs = calculatedOneListOfOneLongs, persistedOneListOfOneLongs = persistedOneListOfOneLongs)

}
