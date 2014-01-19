package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfNullableStrings_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullableStrings: Option[IndexedSeq[Option[String]]] = None,
     calculatedNullableListOfNullableStrings: Option[IndexedSeq[Option[String]]] = None,
     persistedNullableListOfNullableStrings: Option[IndexedSeq[Option[String]]] = None
  ) {

    require(nullableListOfNullableStrings ne null, "Null value was provided for property \"nullableListOfNullableStrings\"")
    if (nullableListOfNullableStrings.isDefined) require(nullableListOfNullableStrings.get ne null, "Null value was provided for property \"nullableListOfNullableStrings\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableStrings)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableStrings") nullableListOfNullableStrings: Option[IndexedSeq[Option[String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableStrings") calculatedNullableListOfNullableStrings: Option[IndexedSeq[Option[String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableStrings") persistedNullableListOfNullableStrings: Option[IndexedSeq[Option[String]]]
  ) =
    this( nullableListOfNullableStrings = nullableListOfNullableStrings, calculatedNullableListOfNullableStrings = calculatedNullableListOfNullableStrings, persistedNullableListOfNullableStrings = persistedNullableListOfNullableStrings)

}
