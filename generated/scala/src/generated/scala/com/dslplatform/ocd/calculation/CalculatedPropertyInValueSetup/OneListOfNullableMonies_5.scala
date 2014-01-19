package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfNullableMonies_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableMonies: IndexedSeq[Option[BigDecimal]] = IndexedSeq.empty,
     calculatedOneListOfNullableMonies: IndexedSeq[Option[BigDecimal]] = IndexedSeq.empty,
     persistedOneListOfNullableMonies: IndexedSeq[Option[BigDecimal]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableMonies ne null, "Null value was provided for property \"oneListOfNullableMonies\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableMonies)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableMonies") oneListOfNullableMonies: IndexedSeq[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableMonies") calculatedOneListOfNullableMonies: IndexedSeq[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableMonies") persistedOneListOfNullableMonies: IndexedSeq[Option[BigDecimal]]
  ) =
    this( oneListOfNullableMonies = if (oneListOfNullableMonies == null) IndexedSeq.empty else oneListOfNullableMonies, calculatedOneListOfNullableMonies = calculatedOneListOfNullableMonies, persistedOneListOfNullableMonies = persistedOneListOfNullableMonies)

}
