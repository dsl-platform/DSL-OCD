package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfOneMonies_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneMonies: Option[IndexedSeq[BigDecimal]] = None,
     calculatedNullableListOfOneMonies: Option[IndexedSeq[BigDecimal]] = None,
     persistedNullableListOfOneMonies: Option[IndexedSeq[BigDecimal]] = None
  ) {

    require(nullableListOfOneMonies ne null, "Null value was provided for property \"nullableListOfOneMonies\"")
    if (nullableListOfOneMonies.isDefined) require(nullableListOfOneMonies.get ne null, "Null value was provided for property \"nullableListOfOneMonies\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneMonies)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneMonies") nullableListOfOneMonies: Option[IndexedSeq[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneMonies") calculatedNullableListOfOneMonies: Option[IndexedSeq[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneMonies") persistedNullableListOfOneMonies: Option[IndexedSeq[BigDecimal]]
  ) =
    this( nullableListOfOneMonies = nullableListOfOneMonies, calculatedNullableListOfOneMonies = calculatedNullableListOfOneMonies, persistedNullableListOfOneMonies = persistedNullableListOfOneMonies)

}
