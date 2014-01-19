package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfNullableLongs_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableLongs: Option[Array[Option[Long]]] = None,
     calculatedNullableArrayOfNullableLongs: Option[Array[Option[Long]]] = None,
     persistedNullableArrayOfNullableLongs: Option[Array[Option[Long]]] = None
  ) {

    require(nullableArrayOfNullableLongs ne null, "Null value was provided for property \"nullableArrayOfNullableLongs\"")
    if (nullableArrayOfNullableLongs.isDefined) require(nullableArrayOfNullableLongs.get ne null, "Null value was provided for property \"nullableArrayOfNullableLongs\"")
    com.dslplatform.api.Guards.checkArrayOptionValNulls(nullableArrayOfNullableLongs)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableLongs") nullableArrayOfNullableLongs: Option[Array[Option[Long]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableLongs") calculatedNullableArrayOfNullableLongs: Option[Array[Option[Long]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableLongs") persistedNullableArrayOfNullableLongs: Option[Array[Option[Long]]]
  ) =
    this( nullableArrayOfNullableLongs = nullableArrayOfNullableLongs, calculatedNullableArrayOfNullableLongs = calculatedNullableArrayOfNullableLongs, persistedNullableArrayOfNullableLongs = persistedNullableArrayOfNullableLongs)

}
