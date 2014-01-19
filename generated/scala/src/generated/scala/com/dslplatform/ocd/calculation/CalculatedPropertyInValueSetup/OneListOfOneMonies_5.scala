package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfOneMonies_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneMonies: IndexedSeq[BigDecimal] = IndexedSeq.empty,
     calculatedOneListOfOneMonies: IndexedSeq[BigDecimal] = IndexedSeq.empty,
     persistedOneListOfOneMonies: IndexedSeq[BigDecimal] = IndexedSeq.empty
  ) {

    require(oneListOfOneMonies ne null, "Null value was provided for property \"oneListOfOneMonies\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneMonies)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneMonies") oneListOfOneMonies: IndexedSeq[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneMonies") calculatedOneListOfOneMonies: IndexedSeq[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneMonies") persistedOneListOfOneMonies: IndexedSeq[BigDecimal]
  ) =
    this( oneListOfOneMonies = if (oneListOfOneMonies == null) IndexedSeq.empty else oneListOfOneMonies, calculatedOneListOfOneMonies = calculatedOneListOfOneMonies, persistedOneListOfOneMonies = persistedOneListOfOneMonies)

}
