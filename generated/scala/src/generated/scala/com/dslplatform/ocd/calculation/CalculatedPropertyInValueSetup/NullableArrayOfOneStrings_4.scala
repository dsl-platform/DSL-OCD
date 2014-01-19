package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfOneStrings_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneStrings: Option[Array[String]] = None,
     calculatedNullableArrayOfOneStrings: Option[Array[String]] = None,
     persistedNullableArrayOfOneStrings: Option[Array[String]] = None
  ) {

    require(nullableArrayOfOneStrings ne null, "Null value was provided for property \"nullableArrayOfOneStrings\"")
    if (nullableArrayOfOneStrings.isDefined) require(nullableArrayOfOneStrings.get ne null, "Null value was provided for property \"nullableArrayOfOneStrings\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneStrings)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneStrings") nullableArrayOfOneStrings: Option[Array[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneStrings") calculatedNullableArrayOfOneStrings: Option[Array[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneStrings") persistedNullableArrayOfOneStrings: Option[Array[String]]
  ) =
    this( nullableArrayOfOneStrings = nullableArrayOfOneStrings, calculatedNullableArrayOfOneStrings = calculatedNullableArrayOfOneStrings, persistedNullableArrayOfOneStrings = persistedNullableArrayOfOneStrings)

}
