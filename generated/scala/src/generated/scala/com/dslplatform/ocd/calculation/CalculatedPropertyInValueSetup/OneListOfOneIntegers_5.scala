package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfOneIntegers_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneIntegers: IndexedSeq[Int] = IndexedSeq.empty,
     calculatedOneListOfOneIntegers: IndexedSeq[Int] = IndexedSeq.empty,
     persistedOneListOfOneIntegers: IndexedSeq[Int] = IndexedSeq.empty
  ) {

    require(oneListOfOneIntegers ne null, "Null value was provided for property \"oneListOfOneIntegers\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneIntegers") oneListOfOneIntegers: IndexedSeq[Int]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneIntegers") calculatedOneListOfOneIntegers: IndexedSeq[Int]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneIntegers") persistedOneListOfOneIntegers: IndexedSeq[Int]
  ) =
    this( oneListOfOneIntegers = if (oneListOfOneIntegers == null) IndexedSeq.empty else oneListOfOneIntegers, calculatedOneListOfOneIntegers = calculatedOneListOfOneIntegers, persistedOneListOfOneIntegers = persistedOneListOfOneIntegers)

}
