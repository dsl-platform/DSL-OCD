package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfNullableGuids_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableGuids: IndexedSeq[Option[java.util.UUID]] = IndexedSeq.empty,
     calculatedOneListOfNullableGuids: IndexedSeq[Option[java.util.UUID]] = IndexedSeq.empty,
     persistedOneListOfNullableGuids: IndexedSeq[Option[java.util.UUID]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableGuids ne null, "Null value was provided for property \"oneListOfNullableGuids\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableGuids)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableGuids") oneListOfNullableGuids: IndexedSeq[Option[java.util.UUID]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableGuids") calculatedOneListOfNullableGuids: IndexedSeq[Option[java.util.UUID]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableGuids") persistedOneListOfNullableGuids: IndexedSeq[Option[java.util.UUID]]
  ) =
    this( oneListOfNullableGuids = if (oneListOfNullableGuids == null) IndexedSeq.empty else oneListOfNullableGuids, calculatedOneListOfNullableGuids = calculatedOneListOfNullableGuids, persistedOneListOfNullableGuids = persistedOneListOfNullableGuids)

}
