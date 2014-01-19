package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfNullableBooleans_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableBooleans: Option[Set[Option[Boolean]]] = None,
     calculatedNullableSetOfNullableBooleans: Option[Set[Option[Boolean]]] = None,
     persistedNullableSetOfNullableBooleans: Option[Set[Option[Boolean]]] = None
  ) {

    require(nullableSetOfNullableBooleans ne null, "Null value was provided for property \"nullableSetOfNullableBooleans\"")
    if (nullableSetOfNullableBooleans.isDefined) require(nullableSetOfNullableBooleans.get ne null, "Null value was provided for property \"nullableSetOfNullableBooleans\"")
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(nullableSetOfNullableBooleans)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableBooleans") nullableSetOfNullableBooleans: Option[Set[Option[Boolean]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableBooleans") calculatedNullableSetOfNullableBooleans: Option[Set[Option[Boolean]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableBooleans") persistedNullableSetOfNullableBooleans: Option[Set[Option[Boolean]]]
  ) =
    this( nullableSetOfNullableBooleans = nullableSetOfNullableBooleans, calculatedNullableSetOfNullableBooleans = calculatedNullableSetOfNullableBooleans, persistedNullableSetOfNullableBooleans = persistedNullableSetOfNullableBooleans)

}
