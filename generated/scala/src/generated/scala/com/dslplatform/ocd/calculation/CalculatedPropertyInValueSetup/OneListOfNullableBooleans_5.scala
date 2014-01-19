package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfNullableBooleans_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableBooleans: IndexedSeq[Option[Boolean]] = IndexedSeq.empty,
     calculatedOneListOfNullableBooleans: IndexedSeq[Option[Boolean]] = IndexedSeq.empty,
     persistedOneListOfNullableBooleans: IndexedSeq[Option[Boolean]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableBooleans ne null, "Null value was provided for property \"oneListOfNullableBooleans\"")
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneListOfNullableBooleans)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableBooleans") oneListOfNullableBooleans: IndexedSeq[Option[Boolean]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableBooleans") calculatedOneListOfNullableBooleans: IndexedSeq[Option[Boolean]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableBooleans") persistedOneListOfNullableBooleans: IndexedSeq[Option[Boolean]]
  ) =
    this( oneListOfNullableBooleans = if (oneListOfNullableBooleans == null) IndexedSeq.empty else oneListOfNullableBooleans, calculatedOneListOfNullableBooleans = calculatedOneListOfNullableBooleans, persistedOneListOfNullableBooleans = persistedOneListOfNullableBooleans)

}
