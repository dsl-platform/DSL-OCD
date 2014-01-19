package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfNullableDoubles_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableDoubles: Option[Set[Option[Double]]] = None,
     calculatedNullableSetOfNullableDoubles: Option[Set[Option[Double]]] = None,
     persistedNullableSetOfNullableDoubles: Option[Set[Option[Double]]] = None
  ) {

    require(nullableSetOfNullableDoubles ne null, "Null value was provided for property \"nullableSetOfNullableDoubles\"")
    if (nullableSetOfNullableDoubles.isDefined) require(nullableSetOfNullableDoubles.get ne null, "Null value was provided for property \"nullableSetOfNullableDoubles\"")
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(nullableSetOfNullableDoubles)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableDoubles") nullableSetOfNullableDoubles: Option[Set[Option[Double]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableDoubles") calculatedNullableSetOfNullableDoubles: Option[Set[Option[Double]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableDoubles") persistedNullableSetOfNullableDoubles: Option[Set[Option[Double]]]
  ) =
    this( nullableSetOfNullableDoubles = nullableSetOfNullableDoubles, calculatedNullableSetOfNullableDoubles = calculatedNullableSetOfNullableDoubles, persistedNullableSetOfNullableDoubles = persistedNullableSetOfNullableDoubles)

}
