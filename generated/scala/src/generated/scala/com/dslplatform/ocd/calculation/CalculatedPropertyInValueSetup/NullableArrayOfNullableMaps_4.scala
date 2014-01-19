package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfNullableMaps_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableMaps: Option[Array[Option[Map[String, String]]]] = None,
     calculatedNullableArrayOfNullableMaps: Option[Array[Option[Map[String, String]]]] = None,
     persistedNullableArrayOfNullableMaps: Option[Array[Option[Map[String, String]]]] = None
  ) {

    require(nullableArrayOfNullableMaps ne null, "Null value was provided for property \"nullableArrayOfNullableMaps\"")
    if (nullableArrayOfNullableMaps.isDefined) require(nullableArrayOfNullableMaps.get ne null, "Null value was provided for property \"nullableArrayOfNullableMaps\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableMaps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableMaps") nullableArrayOfNullableMaps: Option[Array[Option[Map[String, String]]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableMaps") calculatedNullableArrayOfNullableMaps: Option[Array[Option[Map[String, String]]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableMaps") persistedNullableArrayOfNullableMaps: Option[Array[Option[Map[String, String]]]]
  ) =
    this( nullableArrayOfNullableMaps = nullableArrayOfNullableMaps, calculatedNullableArrayOfNullableMaps = calculatedNullableArrayOfNullableMaps, persistedNullableArrayOfNullableMaps = persistedNullableArrayOfNullableMaps)

}
