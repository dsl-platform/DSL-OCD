package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfNullableFloats_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableFloats: Option[Array[Option[Float]]] = None,
     calculatedNullableArrayOfNullableFloats: Option[Array[Option[Float]]] = None,
     persistedNullableArrayOfNullableFloats: Option[Array[Option[Float]]] = None
  ) {

    require(nullableArrayOfNullableFloats ne null, "Null value was provided for property \"nullableArrayOfNullableFloats\"")
    if (nullableArrayOfNullableFloats.isDefined) require(nullableArrayOfNullableFloats.get ne null, "Null value was provided for property \"nullableArrayOfNullableFloats\"")
    com.dslplatform.api.Guards.checkArrayOptionValNulls(nullableArrayOfNullableFloats)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableFloats") nullableArrayOfNullableFloats: Option[Array[Option[Float]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableFloats") calculatedNullableArrayOfNullableFloats: Option[Array[Option[Float]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableFloats") persistedNullableArrayOfNullableFloats: Option[Array[Option[Float]]]
  ) =
    this( nullableArrayOfNullableFloats = nullableArrayOfNullableFloats, calculatedNullableArrayOfNullableFloats = calculatedNullableArrayOfNullableFloats, persistedNullableArrayOfNullableFloats = persistedNullableArrayOfNullableFloats)

}
