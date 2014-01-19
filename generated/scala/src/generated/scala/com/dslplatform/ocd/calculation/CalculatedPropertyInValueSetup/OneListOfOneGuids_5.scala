package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfOneGuids_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneGuids: IndexedSeq[java.util.UUID] = IndexedSeq.empty,
     calculatedOneListOfOneGuids: IndexedSeq[java.util.UUID] = IndexedSeq.empty,
     persistedOneListOfOneGuids: IndexedSeq[java.util.UUID] = IndexedSeq.empty
  ) {

    require(oneListOfOneGuids ne null, "Null value was provided for property \"oneListOfOneGuids\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneGuids)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneGuids") oneListOfOneGuids: IndexedSeq[java.util.UUID]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneGuids") calculatedOneListOfOneGuids: IndexedSeq[java.util.UUID]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneGuids") persistedOneListOfOneGuids: IndexedSeq[java.util.UUID]
  ) =
    this( oneListOfOneGuids = if (oneListOfOneGuids == null) IndexedSeq.empty else oneListOfOneGuids, calculatedOneListOfOneGuids = calculatedOneListOfOneGuids, persistedOneListOfOneGuids = persistedOneListOfOneGuids)

}
