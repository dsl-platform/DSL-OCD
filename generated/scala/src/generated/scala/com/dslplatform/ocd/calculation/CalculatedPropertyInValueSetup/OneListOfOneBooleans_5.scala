package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfOneBooleans_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneBooleans: IndexedSeq[Boolean] = IndexedSeq.empty,
     calculatedOneListOfOneBooleans: IndexedSeq[Boolean] = IndexedSeq.empty,
     persistedOneListOfOneBooleans: IndexedSeq[Boolean] = IndexedSeq.empty
  ) {

    require(oneListOfOneBooleans ne null, "Null value was provided for property \"oneListOfOneBooleans\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneBooleans") oneListOfOneBooleans: IndexedSeq[Boolean]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneBooleans") calculatedOneListOfOneBooleans: IndexedSeq[Boolean]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneBooleans") persistedOneListOfOneBooleans: IndexedSeq[Boolean]
  ) =
    this( oneListOfOneBooleans = if (oneListOfOneBooleans == null) IndexedSeq.empty else oneListOfOneBooleans, calculatedOneListOfOneBooleans = calculatedOneListOfOneBooleans, persistedOneListOfOneBooleans = persistedOneListOfOneBooleans)

}
