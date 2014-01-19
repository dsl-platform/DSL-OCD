package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfOneXmls_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneXmls: Option[Array[scala.xml.Elem]] = None,
     calculatedNullableArrayOfOneXmls: Option[Array[scala.xml.Elem]] = None,
     persistedNullableArrayOfOneXmls: Option[Array[scala.xml.Elem]] = None
  ) {

    require(nullableArrayOfOneXmls ne null, "Null value was provided for property \"nullableArrayOfOneXmls\"")
    if (nullableArrayOfOneXmls.isDefined) require(nullableArrayOfOneXmls.get ne null, "Null value was provided for property \"nullableArrayOfOneXmls\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneXmls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneXmls") nullableArrayOfOneXmls: Option[Array[scala.xml.Elem]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneXmls") calculatedNullableArrayOfOneXmls: Option[Array[scala.xml.Elem]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneXmls") persistedNullableArrayOfOneXmls: Option[Array[scala.xml.Elem]]
  ) =
    this( nullableArrayOfOneXmls = nullableArrayOfOneXmls, calculatedNullableArrayOfOneXmls = calculatedNullableArrayOfOneXmls, persistedNullableArrayOfOneXmls = persistedNullableArrayOfOneXmls)

}
