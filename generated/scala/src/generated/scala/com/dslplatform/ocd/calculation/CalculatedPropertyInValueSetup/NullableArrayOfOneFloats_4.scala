package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfOneFloats_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneFloats: Option[Array[Float]] = None,
     calculatedNullableArrayOfOneFloats: Option[Array[Float]] = None,
     persistedNullableArrayOfOneFloats: Option[Array[Float]] = None
  ) {

    require(nullableArrayOfOneFloats ne null, "Null value was provided for property \"nullableArrayOfOneFloats\"")
    if (nullableArrayOfOneFloats.isDefined) require(nullableArrayOfOneFloats.get ne null, "Null value was provided for property \"nullableArrayOfOneFloats\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneFloats") nullableArrayOfOneFloats: Option[Array[Float]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneFloats") calculatedNullableArrayOfOneFloats: Option[Array[Float]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneFloats") persistedNullableArrayOfOneFloats: Option[Array[Float]]
  ) =
    this( nullableArrayOfOneFloats = nullableArrayOfOneFloats, calculatedNullableArrayOfOneFloats = calculatedNullableArrayOfOneFloats, persistedNullableArrayOfOneFloats = persistedNullableArrayOfOneFloats)

}
