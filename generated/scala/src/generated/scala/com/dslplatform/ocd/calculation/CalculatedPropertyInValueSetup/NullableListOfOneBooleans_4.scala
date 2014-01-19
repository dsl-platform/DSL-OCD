package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfOneBooleans_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneBooleans: Option[IndexedSeq[Boolean]] = None,
     calculatedNullableListOfOneBooleans: Option[IndexedSeq[Boolean]] = None,
     persistedNullableListOfOneBooleans: Option[IndexedSeq[Boolean]] = None
  ) {

    require(nullableListOfOneBooleans ne null, "Null value was provided for property \"nullableListOfOneBooleans\"")
    if (nullableListOfOneBooleans.isDefined) require(nullableListOfOneBooleans.get ne null, "Null value was provided for property \"nullableListOfOneBooleans\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneBooleans") nullableListOfOneBooleans: Option[IndexedSeq[Boolean]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneBooleans") calculatedNullableListOfOneBooleans: Option[IndexedSeq[Boolean]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneBooleans") persistedNullableListOfOneBooleans: Option[IndexedSeq[Boolean]]
  ) =
    this( nullableListOfOneBooleans = nullableListOfOneBooleans, calculatedNullableListOfOneBooleans = calculatedNullableListOfOneBooleans, persistedNullableListOfOneBooleans = persistedNullableListOfOneBooleans)

}
