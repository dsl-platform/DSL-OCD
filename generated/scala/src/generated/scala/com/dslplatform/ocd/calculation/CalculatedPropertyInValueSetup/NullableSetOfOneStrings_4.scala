package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfOneStrings_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneStrings: Option[Set[String]] = None,
     calculatedNullableSetOfOneStrings: Option[Set[String]] = None,
     persistedNullableSetOfOneStrings: Option[Set[String]] = None
  ) {

    require(nullableSetOfOneStrings ne null, "Null value was provided for property \"nullableSetOfOneStrings\"")
    if (nullableSetOfOneStrings.isDefined) require(nullableSetOfOneStrings.get ne null, "Null value was provided for property \"nullableSetOfOneStrings\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneStrings)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneStrings") nullableSetOfOneStrings: Option[Set[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneStrings") calculatedNullableSetOfOneStrings: Option[Set[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneStrings") persistedNullableSetOfOneStrings: Option[Set[String]]
  ) =
    this( nullableSetOfOneStrings = nullableSetOfOneStrings, calculatedNullableSetOfOneStrings = calculatedNullableSetOfOneStrings, persistedNullableSetOfOneStrings = persistedNullableSetOfOneStrings)

}
