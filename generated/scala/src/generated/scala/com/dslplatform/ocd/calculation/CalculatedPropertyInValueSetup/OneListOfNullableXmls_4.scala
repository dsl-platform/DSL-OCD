package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfNullableXmls_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableXmls: IndexedSeq[Option[scala.xml.Elem]] = IndexedSeq.empty,
     calculatedOneListOfNullableXmls: IndexedSeq[Option[scala.xml.Elem]] = IndexedSeq.empty,
     persistedOneListOfNullableXmls: IndexedSeq[Option[scala.xml.Elem]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableXmls ne null, "Null value was provided for property \"oneListOfNullableXmls\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableXmls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableXmls") oneListOfNullableXmls: IndexedSeq[Option[scala.xml.Elem]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableXmls") calculatedOneListOfNullableXmls: IndexedSeq[Option[scala.xml.Elem]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableXmls") persistedOneListOfNullableXmls: IndexedSeq[Option[scala.xml.Elem]]
  ) =
    this( oneListOfNullableXmls = if (oneListOfNullableXmls == null) IndexedSeq.empty else oneListOfNullableXmls, calculatedOneListOfNullableXmls = calculatedOneListOfNullableXmls, persistedOneListOfNullableXmls = persistedOneListOfNullableXmls)

}
