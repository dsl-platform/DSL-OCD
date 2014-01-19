package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfNullableMaps_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableMaps: Option[Set[Option[Map[String, String]]]] = None,
     calculatedNullableSetOfNullableMaps: Option[Set[Option[Map[String, String]]]] = None,
     persistedNullableSetOfNullableMaps: Option[Set[Option[Map[String, String]]]] = None
  ) {

    require(nullableSetOfNullableMaps ne null, "Null value was provided for property \"nullableSetOfNullableMaps\"")
    if (nullableSetOfNullableMaps.isDefined) require(nullableSetOfNullableMaps.get ne null, "Null value was provided for property \"nullableSetOfNullableMaps\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableMaps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableMaps") nullableSetOfNullableMaps: Option[Set[Option[Map[String, String]]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableMaps") calculatedNullableSetOfNullableMaps: Option[Set[Option[Map[String, String]]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableMaps") persistedNullableSetOfNullableMaps: Option[Set[Option[Map[String, String]]]]
  ) =
    this( nullableSetOfNullableMaps = nullableSetOfNullableMaps, calculatedNullableSetOfNullableMaps = calculatedNullableSetOfNullableMaps, persistedNullableSetOfNullableMaps = persistedNullableSetOfNullableMaps)

}
