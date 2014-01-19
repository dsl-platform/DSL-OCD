package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfOneLongs_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneLongs: Option[Array[Long]] = None,
     calculatedNullableArrayOfOneLongs: Option[Array[Long]] = None,
     persistedNullableArrayOfOneLongs: Option[Array[Long]] = None
  ) {

    require(nullableArrayOfOneLongs ne null, "Null value was provided for property \"nullableArrayOfOneLongs\"")
    if (nullableArrayOfOneLongs.isDefined) require(nullableArrayOfOneLongs.get ne null, "Null value was provided for property \"nullableArrayOfOneLongs\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneLongs") nullableArrayOfOneLongs: Option[Array[Long]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneLongs") calculatedNullableArrayOfOneLongs: Option[Array[Long]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneLongs") persistedNullableArrayOfOneLongs: Option[Array[Long]]
  ) =
    this( nullableArrayOfOneLongs = nullableArrayOfOneLongs, calculatedNullableArrayOfOneLongs = calculatedNullableArrayOfOneLongs, persistedNullableArrayOfOneLongs = persistedNullableArrayOfOneLongs)

}
