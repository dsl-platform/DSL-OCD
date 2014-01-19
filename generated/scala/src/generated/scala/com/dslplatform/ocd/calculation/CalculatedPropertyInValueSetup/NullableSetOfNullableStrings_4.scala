package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfNullableStrings_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableStrings: Option[Set[Option[String]]] = None,
     calculatedNullableSetOfNullableStrings: Option[Set[Option[String]]] = None,
     persistedNullableSetOfNullableStrings: Option[Set[Option[String]]] = None
  ) {

    require(nullableSetOfNullableStrings ne null, "Null value was provided for property \"nullableSetOfNullableStrings\"")
    if (nullableSetOfNullableStrings.isDefined) require(nullableSetOfNullableStrings.get ne null, "Null value was provided for property \"nullableSetOfNullableStrings\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableStrings)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableStrings") nullableSetOfNullableStrings: Option[Set[Option[String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableStrings") calculatedNullableSetOfNullableStrings: Option[Set[Option[String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableStrings") persistedNullableSetOfNullableStrings: Option[Set[Option[String]]]
  ) =
    this( nullableSetOfNullableStrings = nullableSetOfNullableStrings, calculatedNullableSetOfNullableStrings = calculatedNullableSetOfNullableStrings, persistedNullableSetOfNullableStrings = persistedNullableSetOfNullableStrings)

}
