package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfNullableMaps_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableMaps: IndexedSeq[Option[Map[String, String]]] = IndexedSeq.empty,
     calculatedOneListOfNullableMaps: IndexedSeq[Option[Map[String, String]]] = IndexedSeq.empty,
     persistedOneListOfNullableMaps: IndexedSeq[Option[Map[String, String]]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableMaps ne null, "Null value was provided for property \"oneListOfNullableMaps\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableMaps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableMaps") oneListOfNullableMaps: IndexedSeq[Option[Map[String, String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableMaps") calculatedOneListOfNullableMaps: IndexedSeq[Option[Map[String, String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableMaps") persistedOneListOfNullableMaps: IndexedSeq[Option[Map[String, String]]]
  ) =
    this( oneListOfNullableMaps = if (oneListOfNullableMaps == null) IndexedSeq.empty else oneListOfNullableMaps, calculatedOneListOfNullableMaps = calculatedOneListOfNullableMaps, persistedOneListOfNullableMaps = persistedOneListOfNullableMaps)

}
