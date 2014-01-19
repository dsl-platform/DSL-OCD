package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfOneDoubles_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneDoubles: Option[IndexedSeq[Double]] = None,
     calculatedNullableListOfOneDoubles: Option[IndexedSeq[Double]] = None,
     persistedNullableListOfOneDoubles: Option[IndexedSeq[Double]] = None
  ) {

    require(nullableListOfOneDoubles ne null, "Null value was provided for property \"nullableListOfOneDoubles\"")
    if (nullableListOfOneDoubles.isDefined) require(nullableListOfOneDoubles.get ne null, "Null value was provided for property \"nullableListOfOneDoubles\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneDoubles") nullableListOfOneDoubles: Option[IndexedSeq[Double]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneDoubles") calculatedNullableListOfOneDoubles: Option[IndexedSeq[Double]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneDoubles") persistedNullableListOfOneDoubles: Option[IndexedSeq[Double]]
  ) =
    this( nullableListOfOneDoubles = nullableListOfOneDoubles, calculatedNullableListOfOneDoubles = calculatedNullableListOfOneDoubles, persistedNullableListOfOneDoubles = persistedNullableListOfOneDoubles)

}
