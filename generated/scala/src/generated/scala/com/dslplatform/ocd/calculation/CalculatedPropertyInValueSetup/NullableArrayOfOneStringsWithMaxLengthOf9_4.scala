package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfOneStringsWithMaxLengthOf9_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneStringsWithMaxLengthOf9: Option[Array[String]] = None,
     calculatedNullableArrayOfOneStringsWithMaxLengthOf9: Option[Array[String]] = None,
     persistedNullableArrayOfOneStringsWithMaxLengthOf9: Option[Array[String]] = None
  ) {

    require(nullableArrayOfOneStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"nullableArrayOfOneStringsWithMaxLengthOf9\"")
    if (nullableArrayOfOneStringsWithMaxLengthOf9.isDefined) require(nullableArrayOfOneStringsWithMaxLengthOf9.get ne null, "Null value was provided for property \"nullableArrayOfOneStringsWithMaxLengthOf9\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneStringsWithMaxLengthOf9)
    com.dslplatform.api.Guards.checkArrayLength(nullableArrayOfOneStringsWithMaxLengthOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneStringsWithMaxLengthOf9") nullableArrayOfOneStringsWithMaxLengthOf9: Option[Array[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneStringsWithMaxLengthOf9") calculatedNullableArrayOfOneStringsWithMaxLengthOf9: Option[Array[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneStringsWithMaxLengthOf9") persistedNullableArrayOfOneStringsWithMaxLengthOf9: Option[Array[String]]
  ) =
    this( nullableArrayOfOneStringsWithMaxLengthOf9 = nullableArrayOfOneStringsWithMaxLengthOf9, calculatedNullableArrayOfOneStringsWithMaxLengthOf9 = calculatedNullableArrayOfOneStringsWithMaxLengthOf9, persistedNullableArrayOfOneStringsWithMaxLengthOf9 = persistedNullableArrayOfOneStringsWithMaxLengthOf9)

}
