package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfOneXmls_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneXmls: IndexedSeq[scala.xml.Elem] = IndexedSeq.empty,
     calculatedOneListOfOneXmls: IndexedSeq[scala.xml.Elem] = IndexedSeq.empty,
     persistedOneListOfOneXmls: IndexedSeq[scala.xml.Elem] = IndexedSeq.empty
  ) {

    require(oneListOfOneXmls ne null, "Null value was provided for property \"oneListOfOneXmls\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneXmls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneXmls") oneListOfOneXmls: IndexedSeq[scala.xml.Elem]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneXmls") calculatedOneListOfOneXmls: IndexedSeq[scala.xml.Elem]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneXmls") persistedOneListOfOneXmls: IndexedSeq[scala.xml.Elem]
  ) =
    this( oneListOfOneXmls = if (oneListOfOneXmls == null) IndexedSeq.empty else oneListOfOneXmls, calculatedOneListOfOneXmls = calculatedOneListOfOneXmls, persistedOneListOfOneXmls = persistedOneListOfOneXmls)

}
