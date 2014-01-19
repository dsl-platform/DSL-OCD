package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfNullableBinaries_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableBinaries: Option[Array[Option[Array[Byte]]]] = None,
     calculatedNullableArrayOfNullableBinaries: Option[Array[Option[Array[Byte]]]] = None,
     persistedNullableArrayOfNullableBinaries: Option[Array[Option[Array[Byte]]]] = None
  ) {

    require(nullableArrayOfNullableBinaries ne null, "Null value was provided for property \"nullableArrayOfNullableBinaries\"")
    if (nullableArrayOfNullableBinaries.isDefined) require(nullableArrayOfNullableBinaries.get ne null, "Null value was provided for property \"nullableArrayOfNullableBinaries\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableBinaries)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableBinaries") nullableArrayOfNullableBinaries: Option[Array[Option[Array[Byte]]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableBinaries") calculatedNullableArrayOfNullableBinaries: Option[Array[Option[Array[Byte]]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableBinaries") persistedNullableArrayOfNullableBinaries: Option[Array[Option[Array[Byte]]]]
  ) =
    this( nullableArrayOfNullableBinaries = nullableArrayOfNullableBinaries, calculatedNullableArrayOfNullableBinaries = calculatedNullableArrayOfNullableBinaries, persistedNullableArrayOfNullableBinaries = persistedNullableArrayOfNullableBinaries)

}
