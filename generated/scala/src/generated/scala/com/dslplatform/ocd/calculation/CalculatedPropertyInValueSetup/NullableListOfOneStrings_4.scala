package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfOneStrings_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneStrings: Option[IndexedSeq[String]] = None,
     calculatedNullableListOfOneStrings: Option[IndexedSeq[String]] = None,
     persistedNullableListOfOneStrings: Option[IndexedSeq[String]] = None
  ) {

    require(nullableListOfOneStrings ne null, "Null value was provided for property \"nullableListOfOneStrings\"")
    if (nullableListOfOneStrings.isDefined) require(nullableListOfOneStrings.get ne null, "Null value was provided for property \"nullableListOfOneStrings\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneStrings)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneStrings") nullableListOfOneStrings: Option[IndexedSeq[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneStrings") calculatedNullableListOfOneStrings: Option[IndexedSeq[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneStrings") persistedNullableListOfOneStrings: Option[IndexedSeq[String]]
  ) =
    this( nullableListOfOneStrings = nullableListOfOneStrings, calculatedNullableListOfOneStrings = calculatedNullableListOfOneStrings, persistedNullableListOfOneStrings = persistedNullableListOfOneStrings)

}
