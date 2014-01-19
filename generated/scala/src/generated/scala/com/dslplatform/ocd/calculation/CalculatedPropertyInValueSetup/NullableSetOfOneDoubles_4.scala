package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfOneDoubles_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneDoubles: Option[Set[Double]] = None,
     calculatedNullableSetOfOneDoubles: Option[Set[Double]] = None,
     persistedNullableSetOfOneDoubles: Option[Set[Double]] = None
  ) {

    require(nullableSetOfOneDoubles ne null, "Null value was provided for property \"nullableSetOfOneDoubles\"")
    if (nullableSetOfOneDoubles.isDefined) require(nullableSetOfOneDoubles.get ne null, "Null value was provided for property \"nullableSetOfOneDoubles\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneDoubles") nullableSetOfOneDoubles: Option[Set[Double]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneDoubles") calculatedNullableSetOfOneDoubles: Option[Set[Double]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneDoubles") persistedNullableSetOfOneDoubles: Option[Set[Double]]
  ) =
    this( nullableSetOfOneDoubles = nullableSetOfOneDoubles, calculatedNullableSetOfOneDoubles = calculatedNullableSetOfOneDoubles, persistedNullableSetOfOneDoubles = persistedNullableSetOfOneDoubles)

}
