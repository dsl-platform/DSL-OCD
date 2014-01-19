package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfOneMaps_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneMaps: Option[Array[Map[String, String]]] = None,
     calculatedNullableArrayOfOneMaps: Option[Array[Map[String, String]]] = None,
     persistedNullableArrayOfOneMaps: Option[Array[Map[String, String]]] = None
  ) {

    require(nullableArrayOfOneMaps ne null, "Null value was provided for property \"nullableArrayOfOneMaps\"")
    if (nullableArrayOfOneMaps.isDefined) require(nullableArrayOfOneMaps.get ne null, "Null value was provided for property \"nullableArrayOfOneMaps\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneMaps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneMaps") nullableArrayOfOneMaps: Option[Array[Map[String, String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneMaps") calculatedNullableArrayOfOneMaps: Option[Array[Map[String, String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneMaps") persistedNullableArrayOfOneMaps: Option[Array[Map[String, String]]]
  ) =
    this( nullableArrayOfOneMaps = nullableArrayOfOneMaps, calculatedNullableArrayOfOneMaps = calculatedNullableArrayOfOneMaps, persistedNullableArrayOfOneMaps = persistedNullableArrayOfOneMaps)

}
